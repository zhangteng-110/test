package com.zhangteng.administrationback.service;

import com.zhangteng.administrationback.po.Address;

import java.util.List;

/**
 * ClassName: AddressService <br/>
 * Description: <br/>
 * date: 2020/3/8 18:16<br/>
 *
 * @author 雷神<br />
 * @since JDK 1.8
 */
public interface AddressService {
    Address getById(Integer addressId);

    List<Address> selectByCustomerId(Integer customerId);
}
