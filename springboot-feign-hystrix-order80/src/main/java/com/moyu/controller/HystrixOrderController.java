package com.moyu.controller;

import com.moyu.service.HystrixOrder;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
/**
 * 全局配置备用方案
 */
@DefaultProperties(defaultFallback = "testHystrix4")
public class HystrixOrderController {
    @Autowired
  private HystrixOrder hystrixOrder;

    @GetMapping("/hystrix1/{id}")
    public String order1(@PathVariable("id") Integer id){
        return  hystrixOrder.testHystrix1(id);
    }
    @GetMapping("/hystrix2/{id}")
  /*  @HystrixCommand(fallbackMethod = "testHystrix3", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })*/
  @HystrixCommand(commandProperties = {
          @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")})
    public String order2(@PathVariable("id") Integer id) throws InterruptedException {
      /*  Thread.sleep(5000);*/
        return  hystrixOrder.testHystrix2(id);
    }

    public String testHystrix3(@PathVariable("id") Integer id) throws InterruptedException {
        return "hello 这里是order测的超时备用方法 传入id为"+id+"超时备用方法";
    }

    public String testHystrix4() throws InterruptedException {
        return "这里是全局备用方案";
    }

}
