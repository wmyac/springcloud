package com.moyu.service;

import com.moyu.entity.User;

public interface UserService {
    public int saveUser(User user);

    public User getUserById(Integer id);
}
