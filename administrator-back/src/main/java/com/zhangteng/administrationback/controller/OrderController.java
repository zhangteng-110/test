package com.zhangteng.administrationback.controller;

import com.zhangteng.administrationback.dto.in.OrderSearchInDTO;
import com.zhangteng.administrationback.dto.out.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: OrderController <br/>
 * Description: <br/>
 * date: 2020/2/26 18:03<br/>
 *
 * @author 雷神<br />
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @GetMapping("/search")
    public PageOutDTO<OrderListOutDTO> search(OrderSearchInDTO orderSearchInDTO,@RequestParam Integer pageNum){
        return null;
    }
    @GetMapping("/getById")
    public OrderShowOutDTO getById(@RequestParam Long orderId){
        return null;
    }
    @GetMapping("/getInvoiceInfo")
    public OrderInvoiceShowOutDTO getInvoiceInfo(@RequestParam Long orderId){
        return null;
    }

    @GetMapping("/getShipInfo")
    public OrderShipShowOutDTO getShipInfo(@RequestParam Long orderId){
        return null;
    }
}
