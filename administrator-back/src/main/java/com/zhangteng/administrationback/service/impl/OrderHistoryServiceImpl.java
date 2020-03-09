package com.zhangteng.administrationback.service.impl;

import com.zhangteng.administrationback.dao.OrderHistoryMapper;
import com.zhangteng.administrationback.po.OrderHistory;
import com.zhangteng.administrationback.service.OrderHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: OrderHistoryServiceImpl <br/>
 * Description: <br/>
 * date: 2020/3/9 18:22<br/>
 *
 * @author 雷神<br />
 * @since JDK 1.8
 */
@Service
public class OrderHistoryServiceImpl implements OrderHistoryService {
    @Autowired
    private OrderHistoryMapper orderHistoryMapper;

    @Override
    public List<OrderHistory> getByOrderId(Long orderId) {
        return orderHistoryMapper.getByOrderId(orderId);
    }

    @Override
    public Long create(OrderHistory orderHistory) {
        orderHistoryMapper.insertSelective(orderHistory);
        return orderHistory.getOrderHistoryId();
    }
}
