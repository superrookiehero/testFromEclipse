package com.yh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yh.bean.Permission;
import com.yh.mapper.PermissionMapper;
@Service
public class PermissionImpl implements PermissionService {
    @Autowired
	private PermissionMapper mapper;
	@Override
	public void addPermission(Permission permission) {
		// TODO Auto-generated method stub
        mapper.addPermission(permission);
	}

	@Override
	public List<Permission> findAllPermission() {
		// TODO Auto-generated method stub
		return mapper.findAllPermission();
	}

}
