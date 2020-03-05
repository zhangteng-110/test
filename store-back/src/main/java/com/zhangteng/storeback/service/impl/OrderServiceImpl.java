package com.zhangteng.storeback.service.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zhangteng.storeback.dao.OrderDetailMapper;
import com.zhangteng.storeback.dao.OrderMapper;
import com.zhangteng.storeback.dto.in.OrderCheckoutInDTO;
import com.zhangteng.storeback.dto.in.OrderProductInDTO;
import com.zhangteng.storeback.dto.out.OrderHistoryListOutDTO;
import com.zhangteng.storeback.dto.out.OrderShowOutDTO;
import com.zhangteng.storeback.enumeration.OrderStatus;
import com.zhangteng.storeback.po.*;
import com.zhangteng.storeback.service.AddressService;
import com.zhangteng.storeback.service.OrderHistoryService;
import com.zhangteng.storeback.service.OrderService;
import com.zhangteng.storeback.service.ProductService;
import com.zhangteng.storeback.vo.OrderProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ClassName: OrderServiceImpl <br/>
 * Description: <br/>
 * date: 2020/3/5 17:57<br/>
 *
 * @author 雷神<br />
 * @since JDK 1.8
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private OrderDetailMapper orderDetailMapper;
    @Autowired
    private ProductService productService;
    @Autowired
    private AddressService addressService;
    @Autowired
    private OrderHistoryService orderHistoryService;
    @Override
    @Transactional
    public Long create(OrderCheckoutInDTO orderCheckoutInDTO,Integer customerId) {
        List<OrderProductInDTO> orderProducts = orderCheckoutInDTO.getOrderProducts();
        List<OrderProductVO> orderProductVos = orderProducts.stream().map(orderProductInDTO -> {
            Product orderProduct = productService.getById(orderProductInDTO.getProductId());
            OrderProductVO orderProductVo = new OrderProductVO();
            orderProductVo.setProductId(orderProduct.getProductId());
            orderProductVo.setProductCode(orderProduct.getProductCode());
            orderProductVo.setProductName(orderProduct.getProductName());
            orderProductVo.setQuantity(orderProductInDTO.getQuantity());
            Double unitPrice = orderProduct.getPrice() * orderProduct.getDiscount();
            orderProductVo.setUnitPrice(unitPrice);
            Double totalPrice = unitPrice * orderProductInDTO.getQuantity();
            orderProductVo.setTotalPrice(totalPrice);
            orderProductVo.setUnitRewordPoints(orderProduct.getRewordPoints());
            Integer totalRewordPoints = orderProduct.getRewordPoints() * orderProductInDTO.getQuantity();
            orderProductVo.setTotalRewordPoints(totalRewordPoints);
            return orderProductVo;
        }).collect(Collectors.toList());
        double allTotalPrice = orderProductVos.stream().mapToDouble(p -> p.getTotalPrice()).sum();
        int allTotalRewordPoints = orderProductVos.stream().mapToInt(p -> p.getTotalRewordPoints()).sum();

        Order order = new Order();
        order.setCustomerId(customerId);
        order.setStatus((byte) OrderStatus.ToProcess.ordinal());
        order.setTotalPrice(allTotalPrice);
        order.setRewordPoints(allTotalRewordPoints);
        Date now = new Date();
        order.setCreateTime(now);
        order.setUpdateTime(now);
        orderMapper.insertSelective(order);

        Long orderId = order.getOrderId();
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setOrderId(orderId);
        orderDetail.setShipMethod(orderCheckoutInDTO.getShipMethod());

        orderDetail.setShipPrice(5.0);
        Address shipAddress = addressService.getById(orderCheckoutInDTO.getShipAddressId());
        orderDetail.setShipAddress(shipAddress.getContent());
        orderDetail.setPayMethod(orderCheckoutInDTO.getPayMethod());
        orderDetail.setInvoicePrice(allTotalPrice);
        Address InvoiceAddress = addressService.getById(orderCheckoutInDTO.getInvoiceAddressId());
        orderDetail.setInvoiceAddress(InvoiceAddress.getContent());
        orderDetail.setComment(orderCheckoutInDTO.getComment());
        orderDetail.setOrderProducts(JSON.toJSONString(orderProductVos));
        orderDetailMapper.insertSelective(orderDetail);
        return orderId;
    }

    @Override
    public Page<Order> getByCustomerId(Integer pageNum, Integer customerId) {
        PageHelper.startPage(pageNum, 10);
        Page<Order> page = orderMapper.selectByCustomerId(customerId);
        return page;
    }

    @Override
    public OrderShowOutDTO getById(Long orderId) {
        Order order = orderMapper.selectByPrimaryKey(orderId);
        OrderDetail orderDetail = orderDetailMapper.selectByPrimaryKey(orderId);

        OrderShowOutDTO orderShowOutDTO = new OrderShowOutDTO();
        orderShowOutDTO.setOrderId(orderId);
        orderShowOutDTO.setStatus(order.getStatus());
        orderShowOutDTO.setTotalPrice(order.getTotalPrice());
        orderShowOutDTO.setRewordPoints(order.getRewordPoints());
        orderShowOutDTO.setCreateTimestamp(order.getCreateTime().getTime());
        orderShowOutDTO.setUpdateTimestamp(order.getUpdateTime().getTime());

        orderShowOutDTO.setShipMethod(orderDetail.getShipMethod());
        orderShowOutDTO.setShipAddress(orderDetail.getShipAddress());
        orderShowOutDTO.setShipPrice(orderDetail.getShipPrice());
        orderShowOutDTO.setPayMethod(orderDetail.getPayMethod());
        orderShowOutDTO.setInvoiceAddress(orderDetail.getInvoiceAddress());
        orderShowOutDTO.setInvoicePrice(orderDetail.getInvoicePrice());
        orderShowOutDTO.setComment(orderDetail.getComment());

        List<OrderProductVO> orderProductVOS = JSON.parseArray(orderDetail.getOrderProducts(), OrderProductVO.class);
        orderShowOutDTO.setOrderProducts(orderProductVOS);

        List<OrderHistory> orderHistories = orderHistoryService.getByOrderId(orderId);
        List<OrderHistoryListOutDTO> orderHistoryListOutDTOS = orderHistories.stream().map(orderHistory -> {
            OrderHistoryListOutDTO orderHistoryListOutDTO = new OrderHistoryListOutDTO();
            orderHistoryListOutDTO.setTimestamp(orderHistory.getTime().getTime());
            orderHistoryListOutDTO.setOrderStatus(orderHistory.getOrderStatus());
            orderHistoryListOutDTO.setComment(orderHistory.getComment());
            return orderHistoryListOutDTO;
        }).collect(Collectors.toList());

        orderShowOutDTO.setOrderHistories(orderHistoryListOutDTOS);

        return orderShowOutDTO;
    }
}
