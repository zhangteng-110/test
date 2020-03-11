package com.zhangteng.storeback.service;


import com.zhangteng.storeback.dto.in.CustomerRegisterInDTO;
import com.zhangteng.storeback.po.Customer;

public interface CustomerService {

    Integer register(CustomerRegisterInDTO customerRegisterInDTO);

    Customer getByUsername(String username);

    Customer getById(Integer customerId);

    void update(Customer customer);

    Customer getByEmail(String email);
}
