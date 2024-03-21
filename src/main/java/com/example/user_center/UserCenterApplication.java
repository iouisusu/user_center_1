package com.example.user_center;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.user_center.mapper")
public class UserCenterApplication {

    public static void main(String[] args) {
        System.out.println("WWWWWWWW");
        SpringApplication.run(UserCenterApplication.class, args);
    }

}
