package com.zhangteng.administrationback.service.impl;

import com.github.pagehelper.Page;
import com.zhangteng.administrationback.dao.OrderDetailMapper;
import com.zhangteng.administrationback.dao.OrderMapper;
import com.zhangteng.administrationback.dto.out.OrderListOutDTO;
import com.zhangteng.administrationback.dto.out.OrderShowOutDTO;
import com.zhangteng.administrationback.po.Order;
import com.zhangteng.administrationback.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: OrderServiceImpl <br/>
 * Description: <br/>
 * date: 2020/3/6 17:17<br/>
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

    @Override
    public Page<OrderListOutDTO> search(Integer pageNum) {

        return orderMapper.search(pageNum);
    }

    @Override
    public OrderShowOutDTO getById(Long orderId) {
        Order order = orderMapper.selectByPrimaryKey(orderId);
        orderDetailMapper.selectByPrimaryKey(orderId);
        OrderShowOutDTO orderShowOutDTO = new OrderShowOutDTO();
        orderShowOutDTO.setOrderId(orderId);
        orderShowOutDTO.setCustomerId(order.getCustomerId());

        return null;
    }
}
