package com.zhangteng.administrationback.controller;

import com.zhangteng.administrationback.dto.in.OrderHistoryCreateInDTO;
import com.zhangteng.administrationback.dto.out.OrderHistoryListOutDTO;
import com.zhangteng.administrationback.po.OrderHistory;
import com.zhangteng.administrationback.service.OrderHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ClassName: OrderHistoryController <br/>
 * Description: <br/>
 * date: 2020/3/9 18:31<br/>
 *
 * @author 雷神<br />
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/orderhistory")
@CrossOrigin
public class OrderHistoryController {
    @Autowired
    private OrderHistoryService orderHistoryService;
    @GetMapping("/getListByOrderId")
    public List<OrderHistoryListOutDTO> getListByOrderId(@RequestParam Long orderId){
        List<OrderHistory> historyList = orderHistoryService.getByOrderId(orderId);
        List<OrderHistoryListOutDTO> collect = historyList.stream().map(orderHistory -> {
            OrderHistoryListOutDTO orderHistoryListOutDTO = new OrderHistoryListOutDTO();
            orderHistoryListOutDTO.setOrderHistoryId(orderHistory.getOrderHistoryId());
            orderHistoryListOutDTO.setTimestamp(orderHistory.getTime().getTime());
            orderHistoryListOutDTO.setOrderStatus(orderHistory.getOrderStatus());
            orderHistoryListOutDTO.setComment(orderHistory.getComment());
            orderHistoryListOutDTO.setCustomerNotified(orderHistory.getCustomerNotified());
            return orderHistoryListOutDTO;
        }).collect(Collectors.toList());
        return collect;
    }
    @PostMapping("/create")
    public Long create(@RequestBody OrderHistoryCreateInDTO orderHistoryCreateInDTO){
        OrderHistory orderHistory = new OrderHistory();
        orderHistory.setOrderId(orderHistoryCreateInDTO.getOrderId());
        orderHistory.setTime(new Date());
        orderHistory.setComment(orderHistoryCreateInDTO.getComment());
        orderHistory.setOrderStatus(orderHistoryCreateInDTO.getOrderStatus());
        orderHistory.setCustomerNotified(orderHistoryCreateInDTO.getCustomerNotified());
        Long orderId = orderHistoryService.create(orderHistory);
        return orderId;
    }


}
