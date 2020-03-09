package com.zhangteng.administrationback.controller;

import com.github.pagehelper.Page;
import com.zhangteng.administrationback.dto.in.CustomerSearchInDTO;
import com.zhangteng.administrationback.dto.in.CustomerSetStatusInDTO;
import com.zhangteng.administrationback.dto.out.CustomerListOutDTO;
import com.zhangteng.administrationback.dto.out.CustomerShowOutDTO;
import com.zhangteng.administrationback.dto.out.PageOutDTO;
import com.zhangteng.administrationback.po.Address;
import com.zhangteng.administrationback.po.Customer;
import com.zhangteng.administrationback.service.AddressService;
import com.zhangteng.administrationback.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

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
@CrossOrigin
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private AddressService addressService;
    @GetMapping("/search")
    public PageOutDTO<CustomerListOutDTO> search(CustomerSearchInDTO customerSearchInDTO,@RequestParam Integer pageNum){
        Page<Customer> page = customerService.search(pageNum);
        List<CustomerListOutDTO> collect = page.stream().map(customer -> {
            CustomerListOutDTO customerListOutDTO = new CustomerListOutDTO();
            customerListOutDTO.setCustomerId(customer.getCustomerId());
            customerListOutDTO.setUsername(customer.getUsername());
            customerListOutDTO.setRealName(customer.getRealName());
            customerListOutDTO.setEmail(customer.getEmail());
            customerListOutDTO.setMobile(customer.getMobile());
            customerListOutDTO.setStatus(customer.getStatus());
            customerListOutDTO.setCreateTimestamp(customer.getCreateTime().getTime());
            return customerListOutDTO;
        }).collect(Collectors.toList());
        PageOutDTO<CustomerListOutDTO> pageOutDTO = new PageOutDTO<>();
        pageOutDTO.setTotal(page.getTotal());
        pageOutDTO.setPageSize(page.getPageSize());
        pageOutDTO.setPageNum(page.getPageNum());
        pageOutDTO.setList(collect);
        return null;
    }
    @GetMapping("/getById")
    public CustomerShowOutDTO getById(@RequestParam Integer customerId){
        Customer customer = customerService.getById(customerId);
        CustomerShowOutDTO customerShowOutDTO = new CustomerShowOutDTO();
        customerShowOutDTO.setCustomerId(customerId);
        customerShowOutDTO.setUsername(customer.getUsername());
        customerShowOutDTO.setRealName(customer.getRealName());
        customerShowOutDTO.setMobile(customer.getMobile());
        customerShowOutDTO.setEmail(customer.getEmail());
        customerShowOutDTO.setAvatarUrl(customer.getAvatarUrl());
        customerShowOutDTO.setStatus(customer.getStatus());
        customerShowOutDTO.setRewordPoints(customer.getRewordPoints());
        customerShowOutDTO.setCreateTimestamp(customer.getCreateTime().getTime());
        customerShowOutDTO.setNewsSubscribed(customer.getNewsSubscribed());
        customerShowOutDTO.setDefaultAddressId(customer.getDefaultAddressId());
        Address address = addressService.getById(customer.getDefaultAddressId());
        customerShowOutDTO.setDefaultAddress(address.getContent());
        return customerShowOutDTO;
    }
    @PostMapping("/setStatus")
    public void setStatus(@RequestBody CustomerSetStatusInDTO customerSetStatusInDTO){
        customerService.setStatus(customerSetStatusInDTO);
    }
}
