package com.zhangteng.administrationback.controller;

import com.zhangteng.administrationback.dto.in.ReturnHistoryCreateInDTO;
import com.zhangteng.administrationback.dto.out.ReturnHistoryListOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName: ReturnHistoryController <br/>
 * Description: <br/>
 * date: 2020/2/26 17:46<br/>
 *
 * @author 雷神<br />
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/returnhistory")
public class ReturnHistoryController {
    @GetMapping("/getListByReturnId")
    public List<ReturnHistoryListOutDTO> getListByReturnId(@RequestParam Integer returnId){
        return null;
    }
    @PostMapping("/create")
    public Integer create(@RequestBody ReturnHistoryCreateInDTO returnHistoryCreateInDTO){
        return null;
    }
}
