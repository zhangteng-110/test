package com.zhangteng.storeback.service;

import com.github.pagehelper.Page;
import com.zhangteng.storeback.dto.in.OrderCheckoutInDTO;
import com.zhangteng.storeback.dto.out.OrderShowOutDTO;
import com.zhangteng.storeback.po.Order;

/**
 * ClassName: OrderService <br/>
 * Description: <br/>
 * date: 2020/3/5 17:56<br/>
 *
 * @author 雷神<br />
 * @since JDK 1.8
 */
public interface OrderService {
    Long create(OrderCheckoutInDTO orderCheckoutInDTO,Integer customerId);

    Page<Order> getByCustomerId(Integer pageNum, Integer customerId);

    OrderShowOutDTO getById(Long orderId);
}
