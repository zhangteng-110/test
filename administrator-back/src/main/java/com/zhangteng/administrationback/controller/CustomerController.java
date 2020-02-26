package com.zhangteng.administrationback.controller;

import com.zhangteng.administrationback.dto.in.CustomerSearchInDTO;
import com.zhangteng.administrationback.dto.out.CustomerListOutDTO;
import com.zhangteng.administrationback.dto.out.CustomerShowOutDTO;
import com.zhangteng.administrationback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName: CustomerController <br/>
 * Description: <br/>
 * date: 2020/2/26 17:52<br/>
 *
 * @author 雷神<br />
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {
    @GetMapping("/search")
    public PageOutDTO<CustomerListOutDTO> search(CustomerSearchInDTO customerSearchInDTO,@RequestParam Integer pageNum){
        return null;
    }
    @GetMapping("/getById")
    public CustomerShowOutDTO getById(@RequestParam Integer customerId){
        return null;
    }
    @PostMapping("/disable")
    public void disable(@RequestParam Integer customerId){

    }
}
