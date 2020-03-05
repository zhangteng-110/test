package com.zhangteng.storeback.service.impl;

import com.alibaba.fastjson.JSON;
import com.zhangteng.storeback.dao.OrderDetailMapper;
import com.zhangteng.storeback.dao.OrderMapper;
import com.zhangteng.storeback.dto.in.OrderCheckoutInDTO;
import com.zhangteng.storeback.dto.in.OrderProductInDTO;
import com.zhangteng.storeback.enumeration.OrderStatus;
import com.zhangteng.storeback.po.Address;
import com.zhangteng.storeback.po.Order;
import com.zhangteng.storeback.po.OrderDetail;
import com.zhangteng.storeback.po.Product;
import com.zhangteng.storeback.service.AddressService;
import com.zhangteng.storeback.service.OrderService;
import com.zhangteng.storeback.service.ProductService;
import com.zhangteng.storeback.vo.OrderProductVo;
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
    @Override
    @Transactional
    public Long create(OrderCheckoutInDTO orderCheckoutInDTO,Integer customerId) {
        List<OrderProductInDTO> orderProducts = orderCheckoutInDTO.getOrderProducts();
        List<OrderProductVo> orderProductVos = orderProducts.stream().map(orderProductInDTO -> {
            Product orderProduct = productService.getById(orderProductInDTO.getProductId());
            OrderProductVo orderProductVo = new OrderProductVo();
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
}
