package com.zhangteng.administrationback.controller;

import com.zhangteng.administrationback.dto.out.AddressListOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName: AddressController <br/>
 * Description: <br/>
 * date: 2020/2/26 17:33<br/>
 *
 * @author 雷神<br />
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/address")
@CrossOrigin
public class AddressController {
    @GetMapping("/getListByCustomerId")
    public List<AddressListOutDTO> getListByCustomerId(@RequestParam Integer customerId){
        return null;
    }
}
