package com.zhangteng.storeback;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhangteng.storeback.dao")
public class StoreBackApplication {
    private static Logger logger = LoggerFactory.getLogger(StoreBackApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(StoreBackApplication.class, args);
        logger.info("store back action success");
    }

}
