package com.yh.service;

import java.util.List;

import com.yh.bean.Permission;
import com.yh.bean.Role;
import com.yh.bean.RoleVo;

public interface RoleService {
	public void addRole(Role role);
	public List<Role> findAllRole();
	
	public List<Permission> findThePermission(Integer id);

}
