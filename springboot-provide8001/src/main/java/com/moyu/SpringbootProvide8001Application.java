package com.moyu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@MapperScan(basePackages = "com.moyu.mapper")
@SpringBootApplication
@EnableEurekaClient
public class SpringbootProvide8001Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootProvide8001Application.class, args);
    }

}
