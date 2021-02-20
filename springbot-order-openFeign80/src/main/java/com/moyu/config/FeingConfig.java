package com.moyu.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeingConfig {
    @Bean
    Logger.Level feignConfig(){
        return  Logger.Level.FULL;
    }
}
