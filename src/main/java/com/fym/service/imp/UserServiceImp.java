package com.fym.service.imp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fym.dao.UserMapper;
import com.fym.entity.User;
import com.fym.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class UserServiceImp  implements UserService{

	@Autowired
	UserMapper mapper;
	
	public User selectOne(int id) {
		return mapper.selectByPrimaryKey(Long.valueOf(id));
	}

	public PageInfo<User> selectAll(Map<String, Object> map) {
		int pageNum=Integer.parseInt(map.get("pageNum").toString());
		User user=new User();
		user.setUsername(map.get("name").toString());
		user.setUserrole(Long.valueOf(map.get("userRole").toString()));
		
		PageHelper.startPage(pageNum, 5);
		List<User> list=mapper.selectAll(user);
		PageInfo<User> info=new PageInfo<>(list);
		return info;
	}
	
	

	public int insert(User t) {
		return mapper.insert(t);
	}

	public int delete(int id) {
		return mapper.deleteByPrimaryKey(Long.valueOf(id));
	}

	public int update(User t) {
		return mapper.updateByPrimaryKey(t);
	}

	public User selectByLogin(User user) {
		
		return mapper.selectByLogin(user);
	}

	

}
