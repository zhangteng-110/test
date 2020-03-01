package com.zhangteng.storeback.service;

import com.zhangteng.storeback.po.Address;

import java.util.List;

public interface AddressService {

    List<Address> getByCustomerId(Integer customerId);

    Integer create(Address address);

    void update(Address address);

    void delete(Integer addressId);

}