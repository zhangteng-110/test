package com.zhangteng.storeback.controller;


import com.zhangteng.storeback.dto.in.OrderCheckoutInDTO;
import com.zhangteng.storeback.dto.out.OrderListOutDTO;
import com.zhangteng.storeback.dto.out.OrderShowOutDTO;
import com.zhangteng.storeback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @PostMapping("/checkout")
    public Integer checkout(@RequestBody OrderCheckoutInDTO orderCheckoutInDTO,
                            @RequestAttribute Integer customerId){
        return null;
    }

    @GetMapping("/getList")
    public PageOutDTO<OrderListOutDTO> getList(@RequestAttribute Integer customerId){
        return null;
    }

    @GetMapping("/getById")
    public OrderShowOutDTO getById(@RequestParam Long orderId){
        return null;
    }
}
