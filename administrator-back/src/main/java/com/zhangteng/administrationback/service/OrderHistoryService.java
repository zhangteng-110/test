package com.zhangteng.administrationback.service;

import com.zhangteng.administrationback.po.OrderHistory;

import java.util.List;

/**
 * ClassName: OrderHistoryService <br/>
 * Description: <br/>
 * date: 2020/3/9 18:22<br/>
 *
 * @author 雷神<br />
 * @since JDK 1.8
 */
public interface OrderHistoryService {
    List<OrderHistory> getByOrderId(Long orderId);

    Long create(OrderHistory orderHistory);
}
