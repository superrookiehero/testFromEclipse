package com.yh.mapper;

import java.util.List;

import com.yh.bean.Role;
import com.yh.bean.User;

public interface UserMapper {
	
	public void addUser(User user);
	public List<User> findAllUser();
	
	public Role findTheRole(Integer id);
	
	public User findToLogin(User user);
	
	public void addTheRole(Role role);
	
	

}
