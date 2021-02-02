package com.moyu.mapper;


import com.moyu.entity.User;

public interface UserMapper {
    public User getUserById(Integer id);

    public int saveUser(User user);
}
