package com.demo.ssm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;

import com.demo.ssm.entity.User;
import com.demo.ssm.service.RegistService;

import java.util.UUID;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		RegistService registService=(RegistService) context.getBean("registServiceImpl");
		User user =new User();

		String id = UUID.randomUUID().toString().replaceAll("-", "");
		user.setId(id);
		user.setUsername("1233");
		user.setPassword("123");
		registService.addOneUser(user);
	}
}
