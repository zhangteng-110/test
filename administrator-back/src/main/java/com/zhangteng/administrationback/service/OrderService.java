package com.zhangteng.administrationback.service;

import com.github.pagehelper.Page;
import com.zhangteng.administrationback.dto.out.OrderListOutDTO;

/**
 * ClassName: OrderService <br/>
 * Description: <br/>
 * date: 2020/3/6 17:17<br/>
 *
 * @author 雷神<br />
 * @since JDK 1.8
 */
public interface OrderService {
    Page<OrderListOutDTO> search(Integer pageNum);
}
