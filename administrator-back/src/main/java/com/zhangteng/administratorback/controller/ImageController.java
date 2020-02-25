package com.zhangteng.administratorback.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * ClassName: ImageController <br/>
 * Description: <br/>
 * date: 2020/2/25 17:17<br/>
 *
 * @author 雷神<br />
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/image")
public class ImageController {
    @PostMapping("/ipload")
    public String upload(@RequestParam MultipartFile image){
        return null;
    }

}
