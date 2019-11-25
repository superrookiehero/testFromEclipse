package com.yh.mapper;

import java.util.List;

import com.yh.bean.Permission;

public interface PermissionMapper {
	public void addPermission(Permission permission);
	public List<Permission> findAllPermission();

}
