package com.moyu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringBootConfigService3344Main {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootConfigService3344Main.class,args);
    }
}
