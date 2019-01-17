package com.demo.ssm.service;

import com.demo.ssm.entity.User;
import org.springframework.stereotype.Service;

public interface RegistService {
    User addOneUser(User user);
}
