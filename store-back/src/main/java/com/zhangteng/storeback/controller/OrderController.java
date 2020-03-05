package com.zhangteng.storeback.controller;


import com.zhangteng.storeback.dto.in.OrderCheckoutInDTO;
import com.zhangteng.storeback.dto.out.OrderListOutDTO;
import com.zhangteng.storeback.dto.out.OrderShowOutDTO;
import com.zhangteng.storeback.dto.out.PageOutDTO;
import com.zhangteng.storeback.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/checkout")
    public Long checkout(@RequestBody OrderCheckoutInDTO orderCheckoutInDTO,
                            @RequestAttribute Integer customerId){

        return orderService.create(orderCheckoutInDTO,customerId);
    }

    @GetMapping("/getList")
    public PageOutDTO<OrderListOutDTO> getList(@RequestParam(required = false,defaultValue = "1") Integer pageNum,@RequestAttribute Integer customerId){

        return null;
    }

    @GetMapping("/getById")
    public OrderShowOutDTO getById(@RequestParam Long orderId){
        return null;
    }
}
