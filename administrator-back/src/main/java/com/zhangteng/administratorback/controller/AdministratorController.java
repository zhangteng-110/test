package com.zhangteng.administratorback.controller;

import com.zhangteng.administratorback.dto.in.AdministratorLoginDTO;
import com.zhangteng.administratorback.dto.in.AdministratorUpdateProfileDTO;
import com.zhangteng.administratorback.dto.out.AdministratorGetProfileOutDTO;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName: AdministratorController <br/>
 * Description: <br/>
 * date: 2020/2/25 17:20<br/>
 *
 * @author 雷神<br />
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/administrator")
public class AdministratorController {
    @GetMapping("/login")
    public String login(AdministratorLoginDTO administratorLoginDTO){
        return null;
    }
    @PostMapping("/updateProdfile")
    public void updateProdfile(@RequestBody AdministratorUpdateProfileDTO administratorUpdateProfileDTO){

    }
    @GetMapping("/getProfile")
    public AdministratorGetProfileOutDTO getProfile(){
        return null;
    }

}
