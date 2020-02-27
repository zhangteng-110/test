package com.zhangteng.administrationback;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhangteng.administrationback.dao")
public class AdministrationBackApplication {
    private static Logger logger = LoggerFactory.getLogger(AdministrationBackApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(AdministrationBackApplication.class, args);
        logger.info("administration back action success");
    }

}
