package com.moyu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudeEureka7002Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudeEureka7002Application.class, args);
    }

}
