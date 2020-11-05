package com.heneng.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SatApplication {

    public static void main(String[] args) {
        SpringApplication.run(SatApplication.class, args);
        System.out.println("启动成功");
    }

}
