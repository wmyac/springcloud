package com.mou.controller;

import com.mou.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/provide/testHystrix1/{id}")
    public String testHystrix1(@PathVariable("id") long id){
        return userService.testHystrix1(id);
    }
    @GetMapping("/provide/testHystrix2/{id}")
    public String testHystrix2(@PathVariable("id") long id) throws InterruptedException {
       return userService.testHystrix2(id);
    }
//服务熔断
@GetMapping("/provide/testHystrix3/{id}")
public String testHystrix3(@PathVariable("id") Integer id) throws InterruptedException {
    return userService.userCircuitBreaker(id);
}



    }
