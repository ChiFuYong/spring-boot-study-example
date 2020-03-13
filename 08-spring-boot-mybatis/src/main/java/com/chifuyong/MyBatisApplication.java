package com.chifuyong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* SpringBoot启动类
* */
@SpringBootApplication
@MapperScan("com.chifuyong.mapper")//扫描 MyBatis 的接口，必须得加，否则会找不到 bean
public class MyBatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyBatisApplication.class,args);
    }
}

