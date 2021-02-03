package com.moyu;

import com.mylrule.MyIRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@RibbonClient(name = "SPRINGCLOUD-PROVIDER",configuration = MyIRule.class)
public class SpringBootOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootOrder80.class,args);
    }
}
