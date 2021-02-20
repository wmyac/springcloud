package com.moyu.controller;

import com.moyu.entity.User;
import com.moyu.service.FeignOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/feignOrder")
public class UserController {

        @Autowired
       private FeignOrder feignOrder;

        @PostMapping("/saveUser")
        public int saveUser(@RequestBody User user) {

            return feignOrder.saveUser(user);
        }

        @GetMapping("/getUserById/{id}")
        public User getUserById(@PathVariable("id") Integer id) {

            return feignOrder.getUserById(id);
        }

}
