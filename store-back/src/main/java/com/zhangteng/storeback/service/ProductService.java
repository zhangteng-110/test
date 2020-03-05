package com.zhangteng.storeback.service;


import com.github.pagehelper.Page;
import com.zhangteng.storeback.dto.out.ProductListOutDTO;
import com.zhangteng.storeback.dto.out.ProductShowOutDTO;
import com.zhangteng.storeback.po.Product;


public interface ProductService {

    Product getById(Integer productId);

    ProductShowOutDTO getShowById(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);

}
