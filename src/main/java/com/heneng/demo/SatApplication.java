package com.heneng.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * @author cnai
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.heneng.demo.dao")
@EnableScheduling
public class SatApplication {

    public static void main(String[] args) throws Exception{
        SpringApplication.run(SatApplication.class, args);
        System.out.println("启动成功");
    }

}
