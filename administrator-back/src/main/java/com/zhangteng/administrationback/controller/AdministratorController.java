package com.zhangteng.administrationback.controller;

import com.zhangteng.administrationback.dto.in.*;
import com.zhangteng.administrationback.dto.out.AdministratorGetProfileOutDTO;
import com.zhangteng.administrationback.dto.out.AdministratorListOutDTO;
import com.zhangteng.administrationback.dto.out.AdministratorShowOutDTO;
import com.zhangteng.administrationback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
@CrossOrigin
public class AdministratorController {
    @GetMapping("/login")
    public String login(AdministratorLoginDTO administratorLoginDTO){
        return null;
    }
    @PostMapping("/updateProdfile")
    public void updateProdfile(@RequestBody AdministratorUpdateProfileDTO administratorUpdateProfileDTO){

    }
    @GetMapping("/getProfile")
    public AdministratorGetProfileOutDTO getProfile(@RequestParam(required = false) Integer adminstratorId){
        return null;
    }
    @GetMapping("/getPwdResetCode")
    public String getPwdResetCode(@RequestParam String email){
        return null;
    }
    @GetMapping("/getList")
    public PageOutDTO<AdministratorListOutDTO>  getList(@RequestParam Integer pageNum){
        return null;
    }
    @PostMapping("/resetPwd")
    public void resetPwd(@RequestBody AdministratorResetPwdInDTO administratorResetPwdInDTO){

    }
    @GetMapping("/getById")
    public AdministratorShowOutDTO getById(@RequestParam Integer administratorId){
        return null;
    }
    @PostMapping("/create")
    public Integer  create(@RequestBody AdministratorCreateInDTO administratorCreateInDTO){
        return null;
    }
    @PostMapping("/update")
    public void update(@RequestBody AdministratorUpdateInDTO administratorUpdateInDTO){

    }
    @PostMapping("/delete")
    public void delete(@RequestBody Integer adminstratorId){

    }

    @PostMapping("/batchDelete")
    public void batchDelete(@RequestBody List<Integer> administratorIds){

    }
}