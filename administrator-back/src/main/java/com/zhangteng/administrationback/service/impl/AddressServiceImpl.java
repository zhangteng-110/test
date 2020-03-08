package com.zhangteng.administrationback.service.impl;

import com.zhangteng.administrationback.dao.AddressMapper;
import com.zhangteng.administrationback.po.Address;
import com.zhangteng.administrationback.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: AddressServiceImpl <br/>
 * Description: <br/>
 * date: 2020/3/8 18:16<br/>
 *
 * @author 雷神<br />
 * @since JDK 1.8
 */
@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressMapper addressMapper;

    @Override
    public Address getById(Integer addressId) {
        Address address = addressMapper.selectByPrimaryKey(addressId);
        return address;
    }

    @Override
    public List<Address> selectByCustomerId(Integer customerId) {
        return addressMapper.selectByCustomerId(customerId);
    }
}
