package com.zhangteng.administrationback.service;

import com.github.pagehelper.Page;
import com.zhangteng.administrationback.dto.in.CustomerSetStatusInDTO;
import com.zhangteng.administrationback.po.Customer;

/**
 * ClassName: CustomerService <br/>
 * Description: <br/>
 * date: 2020/3/8 17:55<br/>
 *
 * @author 雷神<br />
 * @since JDK 1.8
 */
public interface CustomerService {
    Page<Customer> search(Integer pageNum);

    Customer getById(Integer customerId);

    void setStatus(CustomerSetStatusInDTO customerSetStatusInDTO);
}
