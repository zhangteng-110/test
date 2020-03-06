package com.zhangteng.administrationback.dao;

import com.github.pagehelper.Page;
import com.zhangteng.administrationback.dto.out.OrderListOutDTO;
import com.zhangteng.administrationback.po.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    //customer
    Page<OrderListOutDTO> search(Integer pageNum);
}