package com.zhangteng.storeback.service;


import com.github.pagehelper.Page;
import com.zhangteng.storeback.dto.out.ProductListOutDTO;
import com.zhangteng.storeback.dto.out.ProductShowOutDTO;


public interface ProductService {

    ProductShowOutDTO getById(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);

}
