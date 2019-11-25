package com.yh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yh.bean.Permission;
import com.yh.bean.Role;
import com.yh.bean.RoleVo;
import com.yh.service.RoleService;

@Controller
@RequestMapping("/role")
public class RoleController {
	@Autowired
	private RoleService service;	 
	@RequestMapping("/addRole.action")
	public String addRole(Role role) {
		// TODO Auto-generated method stub
        service.addRole(role);
        return "/success";
	}
    @RequestMapping("/findAllRole.action")
	public String findAllRole(Model m) {
		// TODO Auto-generated method stub
		List<Role> list=service.findAllRole();
		m.addAttribute("list", list);
		return "/role/list";
	}
    @RequestMapping("/findThePermission.action")
    public String findThePermission(Integer id,Model m){
    	List<Permission> permission=service.findThePermission(id);
    	m.addAttribute("permission", permission);
    	return "/role/show";
    }

}
