package com.moyu.service.impl;

import com.moyu.entity.User;
import com.moyu.mapper.UserMapper;
import com.moyu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int saveUser(User user) {
        return userMapper.saveUser(user);
    }

    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }
}
