package com.yh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yh.bean.Role;
import com.yh.bean.User;
import com.yh.mapper.UserMapper;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
	private UserMapper mapper;
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
        mapper.addUser(user);
	}

	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return mapper.findAllUser();
	}

	@Override
	public Role findTheRole(Integer id) {
		// TODO Auto-generated method stub
		return mapper.findTheRole(id);
	}

	@Override
	public User findToLogin(User user) {
		// TODO Auto-generated method stub
		return mapper.findToLogin(user);
	}

}
