package com.vea.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.vea.study.mapper")
public class VueElementAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(VueElementAdminApplication.class,args);
    }
}
