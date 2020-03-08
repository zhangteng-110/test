package com.zhangteng.administrationback.controller;

import com.zhangteng.administrationback.dto.out.AddressListOutDTO;
import com.zhangteng.administrationback.dto.out.AddressShowOutDTO;
import com.zhangteng.administrationback.po.Address;
import com.zhangteng.administrationback.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

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
    @Autowired
    private AddressService addressService;
    @GetMapping("/getListByCustomerId")
    public List<AddressListOutDTO> getListByCustomerId(@RequestParam Integer customerId){
        List<Address> addresses = addressService.selectByCustomerId(customerId);
        List<AddressListOutDTO> collect = addresses.stream().map(address -> {
            AddressListOutDTO addressListOutDTO = new AddressListOutDTO();
            addressListOutDTO.setReceiverMobile(address.getReceiverMobile());
            addressListOutDTO.setReceiverName(address.getReceiverName());
            addressListOutDTO.setContent(address.getContent());
            addressListOutDTO.setTag(address.getTag());
            addressListOutDTO.setAddressId(address.getAddressId());
            return addressListOutDTO;
        }).collect(Collectors.toList());
        return collect;
    }
    @GetMapping("/getById")
    public AddressShowOutDTO getById(Integer addressId){
        Address address = addressService.getById(addressId);
        AddressShowOutDTO addressShowOutDTO = new AddressShowOutDTO();
        addressShowOutDTO.setAddressId(addressId);
        addressShowOutDTO.setReceiverMobile(address.getReceiverMobile());
        addressShowOutDTO.setReceiverName(address.getReceiverName());
        addressShowOutDTO.setContent(address.getContent());
        addressShowOutDTO.setTag(address.getTag());
        return addressShowOutDTO;
    }
}
