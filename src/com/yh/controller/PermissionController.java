package com.yh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yh.bean.Permission;
import com.yh.service.PermissionService;

@Controller
@RequestMapping("/permission")
public class PermissionController {
	@Autowired
	private PermissionService service;
	@RequestMapping("/addPermission.action")
	public String addPermission(Permission permission){
		service.addPermission(permission);
		return "/success";
		
	}
	@RequestMapping("/findAllPermission.action")
	public String findAllPermission(Model m){
		List<Permission> list=service.findAllPermission();
		m.addAttribute("list", list);
		return "/permission/list";
	}

}
