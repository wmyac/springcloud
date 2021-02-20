package com.moyu.service;

import com.moyu.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@FeignClient(name = "SPRINGCLOUD-PROVIDER")
public interface FeignOrder {

    @PostMapping("/user/saveUser")
    public int saveUser(@RequestBody User user);

    @GetMapping("/user/getUserById/{id}")
    public User getUserById(@PathVariable("id") Integer id);
}
