package com.yh.mapper;

import java.util.List;

import com.yh.bean.Permission;
import com.yh.bean.Role;

public interface RoleMapper {
	public void addRole(Role role);
	public List<Role> findAllRole();
	
	public List<Permission> findThePermission(Integer id);

}
