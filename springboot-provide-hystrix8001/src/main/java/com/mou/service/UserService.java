package com.mou.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
@Service
public class UserService {
    public String testHystrix1( Long id){
        return "hello 这里是test的正常方法 传入id为"+id+"正常调用方法方法";
    }

    @HystrixCommand(/*fallbackMethod = "testHystrix3", */commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })
    public String testHystrix2(Long id) throws InterruptedException {
        Thread.sleep(2000);
        return "hello 这里是test的超时方法 传入id为"+id+"超时方法";
    }
    public String testHystrix3(Long id) throws InterruptedException {
        return "hello 这里是test的超时备用方法 传入id为"+id+"超时备用方法";
    }


    //演示服务熔断情况
@HystrixCommand(fallbackMethod = "user_fallback",commandProperties = {
        @HystrixProperty(name = "circuitBreaker.enabled", value ="true" ),
        @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value ="10" ),
        @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value ="10000" ),
        @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value ="60" ),
})
public String userCircuitBreaker(Integer id){
        if (id<0){
            throw new  RuntimeException("/////////////id不能为负数");
        }
        String number= IdUtil.simpleUUID();
        return  "成功了，流水号为："+number;
}


public String user_fallback(Integer id){
        return "id不能为负数，请稍后再试 "+id;
}

}
