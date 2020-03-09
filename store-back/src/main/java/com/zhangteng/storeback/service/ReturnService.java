package com.zhangteng.storeback.service;

import com.github.pagehelper.Page;
import com.zhangteng.storeback.po.Return;

public interface ReturnService {

    Integer create(Return aReturn);

    Page<Return> getPageByCustomerId(Integer customerId, Integer pageNum);

    Return getById(Integer returnId);

}
