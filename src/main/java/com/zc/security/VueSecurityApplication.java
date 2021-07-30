package com.zc.security;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zc.security.mapper")
public class VueSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(VueSecurityApplication.class, args);
    }

}
