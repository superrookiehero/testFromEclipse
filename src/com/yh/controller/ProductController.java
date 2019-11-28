package com.yh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.yh.bean.Product;
import com.yh.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
    private ProductService ps;
	@RequestMapping("/addProduct.action")
	public String addProduct(Product product){
		ps.addProduct(product);
		//System.out.println("dddd");
		return "forward:/product/findAll.action";
	}
	
	@RequestMapping("/findAll.action")
	public String findAll(Model m,@RequestParam(name="pageNum",required=true,defaultValue="1")Integer pageNum,@RequestParam(name="pageSize",required=true,defaultValue="2")Integer pageSize){
		PageInfo<Product> pi=ps.findAllByPage(pageNum, pageSize);
		m.addAttribute("PageInfo", pi);
		return "/product/list";
	}
	/*@RequestMapping("/findAll.action")
	public String findAll(Model m){
		List<Product> list=ps.findAll();
		m.addAttribute("list", list);
		return "/product/list";
	}*/
	
	@RequestMapping("/findAllById.action")
	public String findAllById(Integer id,Model m) {
		System.out.println("��");
		Product list=ps.findAllById(id);
		m.addAttribute("product", list);
		return "/product/edit";
	}

	@RequestMapping("/upProductById.action")
	public String upProduct(Product product) {
		ps.upProductById(product);
		return "forward:/product/findAll.action";
	}

	@RequestMapping("/delProductById.action")
	public String delProductById(Integer id) {
		ps.delProductById(id);
		return "/success";
	} 
	
	@RequestMapping("/findAllByName")
	public String findAllByName(String productName,Model m){
		List<Product> list=ps.findAllByName(productName);
		m.addAttribute("list", list);
		System.out.println(list);
		return "/product/list";
	}
	
	
}
