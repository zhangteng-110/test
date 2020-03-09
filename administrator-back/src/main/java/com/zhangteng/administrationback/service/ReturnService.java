package com.zhangteng.administrationback.service;

import com.github.pagehelper.Page;
import com.zhangteng.administrationback.dto.in.ReturnSearchInDTO;
import com.zhangteng.administrationback.po.Return;

public interface ReturnService {

    Page<Return> search(ReturnSearchInDTO returnSearchInDTO, Integer pageNum);

    Return getById(Integer returnId);

    void update(Return aReturn);

}
