package com.fym.service;

import java.util.Map;

import com.fym.entity.User;
import com.github.pagehelper.PageInfo;

public interface UserService extends BaseService<User>{
	
	public User selectByLogin(User user);
	
	 PageInfo<User> selectAll(Map<String, Object> map);
}
