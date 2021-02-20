package com.moyu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class SpringBootHystrixDashboard9001Main {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootHystrixDashboard9001Main.class,args);
    }
}
