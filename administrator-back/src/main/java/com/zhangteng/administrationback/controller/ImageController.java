package com.zhangteng.administrationback.controller;

import com.zhangteng.administrationback.constant.ClientExceptionConstant;
import com.zhangteng.administrationback.exception.ClientException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

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
@CrossOrigin
public class ImageController {
    private List<String> imageExts = Arrays.asList("jpg","png","jpeg");
    @PostMapping("/upload")
    public String upload(@RequestParam MultipartFile image) throws ClientException {
        String filename = image.getOriginalFilename();
        String[] split = filename.split("\\.");
        String ext = split[split.length - 1].toLowerCase();
        boolean contains = imageExts.contains(ext);
        if (!contains) {
            throw new ClientException(ClientExceptionConstant.IMAGE_INVALID_ERRCODE,ClientExceptionConstant.IMAGE_INVALID_ERRMSG);
        }
        String uuid = UUID.randomUUID().toString();
        String name = String.format("%s.%s", uuid, ext);
        String path = String.format("/static/%s", name);
        try {
            FileOutputStream fos = new FileOutputStream(path);
            byte[] data = image.getBytes();
            fos.write(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return name;
    }

}
