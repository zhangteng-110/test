package com.zhangteng.administrationback.service;

import com.github.pagehelper.Page;
import com.zhangteng.administrationback.dto.in.ProductCreateInDTO;
import com.zhangteng.administrationback.dto.in.ProductSearchInDTO;
import com.zhangteng.administrationback.dto.in.ProductUpdateInDTO;
import com.zhangteng.administrationback.dto.out.ProductListOutDTO;
import com.zhangteng.administrationback.dto.out.ProductShowOutDTO;

import java.util.List;

public interface ProductService {

    Integer create(ProductCreateInDTO productCreateInDTO);

    void update(ProductUpdateInDTO productUpdateInDTO);

    void delete(Integer productId);

    void batchDelete(List<Integer> productIds);

    ProductShowOutDTO getById(Integer productId);

    Page<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                   Integer pageNum);

}
