package com.fym.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fym.entity.User;
import com.fym.service.UserService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController<UserService> {
	
	@RequestMapping("/tologin")
	public String toLogin() {
		return "login";
	}
	
	@RequestMapping("/adminlogin")
	public String login(@RequestParam("userCode")String code,@RequestParam("userPassword")String pwd,HttpSession session) {
		User oldUser=new User();
		oldUser.setUsercode(code);
		oldUser.setUserpassword(pwd);
		User newUser=baseService.selectByLogin(oldUser);
		if(newUser!=null){
			session.setAttribute("user", newUser);
			return "main";
		}else {
			return "login";
		}
	}
	
	@RequestMapping("/to_user_all")
	public String toUserAll() {
		
		return "user/userAll";
	}
	
	@RequestMapping("/to_user_all_list")
	public String toUserAllList(@RequestParam(value="pageNum",required=false,defaultValue="1")int pageNum
			,ModelMap modelMap,@RequestParam(value="userName",required=false,defaultValue="")String name
			,@RequestParam(value="userRole",required=false,defaultValue="0")String userRole
			,@RequestParam(value="id",required=false,defaultValue="0")int id) {
		
		if(id!=0) {
			baseService.delete(id);
		}
		
		Map<String, Object> map=new HashMap<>();
		map.put("name", name);
		map.put("userRole", userRole);
		map.put("pageNum", pageNum);
		PageInfo<User> info=baseService.selectAll(map);
		modelMap.put("info", info);
		return "user/userAllList";
	}
	
	@RequestMapping("/to_add_user")
	public String toAddUser() {
		
		return "user/addUser";
	}
	
	@RequestMapping("/add_user")
	public String AddUser(HttpSession session, User userFrom) {
		String userCode=userFrom.getUsercode();
		String userName=userFrom.getUsername();
		String userPsw=userFrom.getUserpassword();
		int gender=userFrom.getGender();
		Date birthday=userFrom.getBirthday();
		String phone=userFrom.getPhone();
		String address=userFrom.getAddress();
		long userRole=userFrom.getUserrole();
		
		User user=new User();
		User newUser=(User) session.getAttribute("user");
		
		user.setAddress(address);
		user.setBirthday( birthday);
		user.setGender(gender);
		user.setPhone(phone);
		user.setUsername(userName);
		user.setUserpassword(userPsw);
		user.setUsercode(userCode);
		user.setUserrole(userRole);
		user.setCreationdate();
		user.setCreatedby(newUser.getId());
		baseService.insert(user);
		
		return "user/addUser";
	}
	
	@RequestMapping("/to_update_user")
	public String toUpdateUser(@RequestParam("id")int id,ModelMap modelMap) {
		modelMap.put("updateUser", baseService.selectOne(id));
		return "user/updateUser";
	}
	
	@RequestMapping("/update_user")
	public String UpdateUser(User userFrom) {
		long id=userFrom.getId();
		String userCode=userFrom.getUsercode();
		String userName=userFrom.getUsername();
		String userPsw=userFrom.getUserpassword();
		int gender=userFrom.getGender();
		Date birthday=userFrom.getBirthday();
		String phone=userFrom.getPhone();
		String address=userFrom.getAddress();
		long userRole=userFrom.getUserrole();
		
		User user=new User();
		
		user.setId(id);
		user.setAddress(address);
		user.setBirthday( birthday);
		user.setGender(gender);
		user.setPhone(phone);
		user.setUsername(userName);
		user.setUserpassword(userPsw);
		user.setUsercode(userCode);
		user.setUserrole(userRole);
		user.setCreationdate();
		user.setModifyby(user.getId());
		user.setModifydate(new Date());
		baseService.update(user);
		
		return "redirect:/user/to_user_all";
	}
	
	@RequestMapping("/to_get_user")
	public String toGetUser(@RequestParam("id")int id,ModelMap modelMap) {
		System.out.println(id);
		modelMap.put("updateUser", baseService.selectOne(id));
		return "user/getUser";
	}
	
	@RequestMapping("/to_revise_psw")
	public String toRevisePsw() {
		
		return "user/revisePsw";
	}
	
	@RequestMapping("/revise_psw")
	public String RevisePsw(HttpSession session
			,@RequestParam("oldpassword")String oldPsw
			,@RequestParam("newpassword")String newPsw
			) {
		User user=(User) session.getAttribute("user");
		String alert="";
		if(oldPsw.equals(user.getUserpassword())) {
			user.setUserpassword(newPsw);
			baseService.update(user);
			return "redirect:/user/to_get_user?id="+user.getId();
		}else {
			return "user/revisePswErro";
		}
		
	}
}
