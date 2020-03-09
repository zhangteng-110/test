package com.zhangteng.administrationback.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zhangteng.administrationback.dao.CustomerMapper;
import com.zhangteng.administrationback.dto.in.CustomerSetStatusInDTO;
import com.zhangteng.administrationback.po.Customer;
import com.zhangteng.administrationback.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: CustomerServiceImpl <br/>
 * Description: <br/>
 * date: 2020/3/8 17:56<br/>
 *
 * @author 雷神<br />
 * @since JDK 1.8
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;
    @Override
    public Page<Customer> search(Integer pageNum) {
        PageHelper.startPage(pageNum,10);
        return customerMapper.search();
    }

    @Override
    public Customer getById(Integer customerId) {
        return customerMapper.selectByPrimaryKey(customerId);
    }

    @Override
    public void setStatus(CustomerSetStatusInDTO customerSetStatusInDTO) {
        Customer customer = new Customer();
        customer.setCustomerId(customerSetStatusInDTO.getCustomerId());
        customer.setStatus(customerSetStatusInDTO.getStatus());
        customerMapper.updateByPrimaryKeySelective(customer);
    }


}
