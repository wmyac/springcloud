package com.moyu.service;

import org.springframework.stereotype.Service;

@Service
public class HystrixOrderService implements HystrixOrder {
    @Override
    public String testHystrix1(long id) {
        return "使用openFeign接口的降级解耦方法";
    }

    @Override
    public String testHystrix2(long id) {
        return "使用openFeign接口的降级解耦方法";
    }
}
