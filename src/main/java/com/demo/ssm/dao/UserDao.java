package com.demo.ssm.dao;

import com.demo.ssm.entity.User;

public interface UserDao {
    User selectOne(User user);
    void insert(User user);
}
