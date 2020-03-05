package com.zhangteng.storeback.service;

import com.zhangteng.storeback.dto.in.OrderCheckoutInDTO;

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


}
