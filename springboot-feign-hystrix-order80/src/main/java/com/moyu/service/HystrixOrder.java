package com.moyu.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@Service
@FeignClient(name = "SPRINGBOOT-HYSTRIX-PROVIDE",fallback = HystrixOrderService.class)
public interface HystrixOrder {
    @GetMapping("/user/provide/testHystrix1/{id}")
    public String testHystrix1(@PathVariable("id") long id);

    @GetMapping("/user/provide/testHystrix2/{id}")
    public String testHystrix2(@PathVariable("id") long id);
}
