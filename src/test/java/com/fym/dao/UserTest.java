package com.fym.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fym.entity.User;

public class UserTest {

	@Test
	public void test1() {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("application.xml");
		UserMapper mapper=applicationContext.getBean(UserMapper.class);
		
		User user=new User();
		user.setUsername("明");
//		user.setUserrole(1l);
		List<User> list=mapper.selectAll(user);
		System.out.println(list);
		
	}
}	
