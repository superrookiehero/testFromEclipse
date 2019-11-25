package com.yh.service;

import java.util.List;

import com.yh.bean.Role;
import com.yh.bean.User;

public interface UserService {
	public void addUser(User user);
	public List<User> findAllUser();
	
	public Role findTheRole(Integer id);
	
	public User findToLogin(User user);

}
