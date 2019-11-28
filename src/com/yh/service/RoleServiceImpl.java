package com.yh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yh.bean.Permission;
import com.yh.bean.Role;
import com.yh.bean.RoleVo;
import com.yh.mapper.RoleMapper;
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
	private RoleMapper mapper;
	@Override
	public void addRole(Role role) {
		// TODO Auto-generated method stub
        mapper.addRole(role);
	}

	@Override
	public List<Role> findAllRole() {
		// TODO Auto-generated method stub
		return mapper.findAllRole();
	}

	@Override
	public List<Permission> findThePermission(Integer id) {
		// TODO Auto-generated method stub
		return mapper.findThePermission(id);
	}

}
