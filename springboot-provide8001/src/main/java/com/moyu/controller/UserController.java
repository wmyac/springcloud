package com.moyu.controller;

import com.moyu.entity.User;
import com.moyu.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/saveUser")
    public int saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/getUserById/{id}")
    public User getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

}
