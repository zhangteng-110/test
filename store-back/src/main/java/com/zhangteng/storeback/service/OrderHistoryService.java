package com.zhangteng.storeback.service;


import com.zhangteng.storeback.po.OrderHistory;

import java.util.List;

public interface OrderHistoryService {

    List<OrderHistory> getByOrderId(Long orderId);

}
