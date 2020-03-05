package com.zhangteng.storeback.controller;


import com.zhangteng.storeback.dto.in.AddressCreateInDTO;
import com.zhangteng.storeback.dto.in.AddressUpdateInDTO;
import com.zhangteng.storeback.dto.out.AddressListOutDTO;
import com.zhangteng.storeback.po.Address;
import com.zhangteng.storeback.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/address")
@CrossOrigin
public class AddressController {

    @Autowired
    private AddressService addressService;
    @GetMapping("/getCustomerAddress")
    public List<AddressListOutDTO> getCustomerAddress(@RequestAttribute Integer customerId){
        List<Address> addresses = addressService.getByCustomerId(customerId);

        List<AddressListOutDTO> addressListOutDTOS = addresses.stream().map(address -> {
            AddressListOutDTO addressListOutDTO = new AddressListOutDTO();
            addressListOutDTO.setAddressId(address.getAddressId());
            addressListOutDTO.setTag(address.getTag());
            addressListOutDTO.setReceiverName(address.getReceiverName());
            addressListOutDTO.setReceiverMobile(address.getReceiverMobile());
            addressListOutDTO.setContent(address.getContent());
            return addressListOutDTO;
        }).collect(Collectors.toList());

        return addressListOutDTOS;
    }
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
