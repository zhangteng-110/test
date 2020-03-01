package com.zhangteng.storeback.controller;


import com.zhangteng.storeback.dto.in.AddressCreateInDTO;
import com.zhangteng.storeback.dto.in.AddressUpdateInDTO;
import com.zhangteng.storeback.dto.out.AddressListOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
@CrossOrigin
public class AddressController {

    @GetMapping("/getAddressByCustomerId")
    public List<AddressListOutDTO> getAddressByCustomerId(@RequestAttribute Integer customerId){
        return null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody AddressCreateInDTO addressCreateInDTO,
                          @RequestAttribute Integer customerId){
        return null;
    }

    @PostMapping("/update")
    public void update(@RequestBody AddressUpdateInDTO addressUpdateInDTO,
                       @RequestAttribute Integer customerId){
        
    }

    @PostMapping
    public void delete(@RequestBody Integer addressId){

    }

}
