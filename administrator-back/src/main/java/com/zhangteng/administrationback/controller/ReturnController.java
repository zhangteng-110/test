package com.zhangteng.administrationback.controller;

import com.github.pagehelper.Page;
import com.zhangteng.administrationback.dto.in.ReturnSearchInDTO;
import com.zhangteng.administrationback.dto.in.ReturnUpdateActionInDTO;
import com.zhangteng.administrationback.dto.out.PageOutDTO;
import com.zhangteng.administrationback.dto.out.ReturnListOutDTO;
import com.zhangteng.administrationback.dto.out.ReturnShowOutDTO;
import com.zhangteng.administrationback.po.Return;
import com.zhangteng.administrationback.service.ReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * ClassName: ReturnController <br/>
 * Description: <br/>
 * date: 2020/2/26 17:38<br/>
 *
 * @author 雷神<br />
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/return")
@CrossOrigin
public class ReturnController {
    @Autowired
    private ReturnService returnService;
    @GetMapping("/search")
    public PageOutDTO<ReturnListOutDTO> search(ReturnSearchInDTO returnSearchInDTO, @RequestParam(required = false, defaultValue = "1") Integer pageNum){
        Page<Return> page = returnService.search(returnSearchInDTO, pageNum);
        List<ReturnListOutDTO> returnListOutDTOS = page.stream().map(aReturn -> {
            ReturnListOutDTO returnListOutDTO = new ReturnListOutDTO();
            returnListOutDTO.setReturnId(aReturn.getReturnId());
            returnListOutDTO.setOrderId(aReturn.getOrderId());
            returnListOutDTO.setCustomerId(aReturn.getCustomerId());
            returnListOutDTO.setCustomerName(aReturn.getCustomerName());
            returnListOutDTO.setProductCode(aReturn.getProductCode());
            returnListOutDTO.setProductName(aReturn.getProductName());
            returnListOutDTO.setStatus(aReturn.getStatus());
            returnListOutDTO.setCreateTimestamp(aReturn.getCreateTime().getTime());
            returnListOutDTO.setUpdateTimestamp(aReturn.getUpdateTime().getTime());
            return returnListOutDTO;
        }).collect(Collectors.toList());
        PageOutDTO<ReturnListOutDTO> pageOutDTO = new PageOutDTO<>();
        pageOutDTO.setTotal(page.getTotal());
        pageOutDTO.setPageSize(page.getPageSize());
        pageOutDTO.setPageNum(page.getPageNum());
        pageOutDTO.setList(returnListOutDTOS);
        return pageOutDTO;
    }
    @GetMapping("/getById")
    public ReturnShowOutDTO getById(@RequestParam Integer returnId){
        return null;
    }
    @PostMapping("/updateAction")
    public void updateAction(@RequestBody ReturnUpdateActionInDTO returnUpdateActionInDTO){

    }
}
