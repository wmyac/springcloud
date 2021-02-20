package com.moyu.controller;

import com.moyu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class UserController {
    @Autowired
    private RestTemplate RestTemplate;

    private String Url="http://SPRINGCLOUD-PROVIDER";


    @PostMapping("/saveUser")
    public int saveUser(@RequestBody User user) {

        return RestTemplate.postForObject(Url+"/user/saveUser",user,Integer.class);
    }

    @GetMapping("/getUserById/{id}")
    public User getUserById(@PathVariable Integer id) {

        return RestTemplate.getForObject(Url+"/user/getUserById/"+id,User.class);
    }

}
