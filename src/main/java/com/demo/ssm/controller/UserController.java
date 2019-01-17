package com.demo.ssm.controller;

import com.demo.ssm.entity.User;
import com.demo.ssm.service.RegistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/*import org.apache.commons.codec.digest.DigestUtils;
import javax.servlet.http.HttpSession;*/

@Controller
public class UserController {

    @Autowired
    private RegistService registService;

    @RequestMapping("/regist")
    public @ResponseBody Map regist(User user){
        //http://localhost:8089/regist.do?username=wewr342&password=wew322p3342
        Map map =new HashMap();
        String username=user.getUsername();
        String password=user.getPassword();

        System.out.println("==username==:"+username);
        System.out.println("==password==:"+password);
        //登录校验，返回user对象

        String id = UUID.randomUUID().toString().replaceAll("-", "");
        user.setId(id);
        registService.addOneUser(user); //注册添加

        map.put("isRegist",true);
        return map;
    }



}
