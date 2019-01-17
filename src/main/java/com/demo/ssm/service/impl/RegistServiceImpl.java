package com.demo.ssm.service.impl;

import com.demo.ssm.dao.UserDao;
import com.demo.ssm.entity.User;
import com.demo.ssm.service.RegistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RegistServiceImpl implements RegistService {

    @Autowired
    private UserDao userDao;
    @Override
    public User addOneUser(User user) {
        //注册成功返回主键id

        String id =UUID.randomUUID().toString().replaceAll("-", "");
        user.setId(id);
        userDao.insert(user);
        return null;
    }
}
