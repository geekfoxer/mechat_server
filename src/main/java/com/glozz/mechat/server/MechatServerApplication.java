package com.glozz.mechat.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.glozz.mechat.server.mapper")
public class MechatServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MechatServerApplication.class, args);
    }

}
