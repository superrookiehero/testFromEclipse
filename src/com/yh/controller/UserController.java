package com.yh.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yh.bean.Role;
import com.yh.bean.User;
import com.yh.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService service;
	@RequestMapping("/addUser.action")
	public String addUser(User user){
		service.addUser(user);
		return "forward:/user/findAllUser.action";//注意
		
	}
	@RequestMapping("/findAllUser.action")
	public String findAllUser(Model m){
		List<User> list=service.findAllUser();
		System.out.println(list);
		m.addAttribute("user", list);
		return "/user/list";
	}
    @RequestMapping("/findTheRole.action")
	public String findTheRole(Integer id,Model m){
		Role role=service.findTheRole(id);
		System.out.println(role);
		m.addAttribute("role", role);
		return "/user/show";
	}
    @RequestMapping("/login.action")
    public String findToLogin(User user,HttpSession session){
    	User u=service.findToLogin(user);
    	session.setAttribute("uname",u.getUsername());
    	
    	return "redirect:/index.jsp";
    }
    @RequestMapping("/loginout.action")
    public String loginOut(HttpSession session){
    	
    	session.removeAttribute("uname");    	
    	return "redirect:/login.jsp";
    }
}
