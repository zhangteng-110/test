package com.zhangteng.administrationback.controller;

import com.zhangteng.administrationback.dto.in.ReturnSearchInDTO;
import com.zhangteng.administrationback.dto.in.ReturnUpdateActionInDTO;
import com.zhangteng.administrationback.dto.out.PageOutDTO;
import com.zhangteng.administrationback.dto.out.ReturnListOutDTO;
import com.zhangteng.administrationback.dto.out.ReturnShowOutDTO;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/search")
    public PageOutDTO<ReturnListOutDTO> search(ReturnSearchInDTO returnSearchInDTO, @RequestParam Integer pageNum){
        return  null;
    }
    @GetMapping("/getById")
    public ReturnShowOutDTO getById(@RequestParam Integer returnId){
        return null;
    }
    @PostMapping("/updateAction")
    public void updateAction(@RequestBody ReturnUpdateActionInDTO returnUpdateActionInDTO){

    }
}
