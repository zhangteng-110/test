package com.zhangteng.storeback.dao;

import com.zhangteng.storeback.po.OrderHistory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderHistoryMapper {
    int deleteByPrimaryKey(Long orderHistoryId);

    int insert(OrderHistory record);

    int insertSelective(OrderHistory record);

    OrderHistory selectByPrimaryKey(Long orderHistoryId);

    int updateByPrimaryKeySelective(OrderHistory record);

    int updateByPrimaryKey(OrderHistory record);

    List<OrderHistory> selectByOrderId(Long orderId);
}