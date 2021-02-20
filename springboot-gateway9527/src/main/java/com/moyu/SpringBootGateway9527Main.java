package com.moyu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
@EnableEurekaClient
public class SpringBootGateway9527Main {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootGateway9527Main.class,args);
    }
}
