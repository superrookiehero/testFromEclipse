package com.yh.service;

import java.util.List;

import com.yh.bean.Permission;

public interface PermissionService {
	public void addPermission(Permission permission);
	public List<Permission> findAllPermission();
}
