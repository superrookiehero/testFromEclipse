package com.yh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.yh.bean.Member;
import com.yh.bean.Order;
import com.yh.bean.OrderQueryVo;
import com.yh.bean.Product;
import com.yh.service.MemberService;
import com.yh.service.OrderService;
import com.yh.service.ProductService;

@Controller
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderService osi;
	@Autowired
	private ProductService pservice;
	@Autowired
	private MemberService mservice;
	
	
	
	@RequestMapping("/addOrder.action")
	public String addOrder(Order order){
		
		System.out.println(order);
		
		osi.addOrder(order);
		return "forward:/order/findOrder.action";
	}
	@RequestMapping("/findOrder.action")
	public String findOrder(Model m,@RequestParam(name="pageNum",required=true,defaultValue="1")Integer pageNum,@RequestParam(name="pageSize",required=true,defaultValue="5")Integer pageSize){
		PageInfo<Order> list=osi.findOrder(pageNum, pageSize);
		System.out.println(list);		
		m.addAttribute("li", list);		
		return "/order/list";
	}
	@RequestMapping("/findOrderDetail.action")
	public String findOrderDetail(Integer id,Model m){
		OrderQueryVo vo=osi.findOrderDetail(id);//vo为空   ×
		System.out.println(vo);
		m.addAttribute("detail", vo);
		return "/order/show";
	}
	@RequestMapping("/findoption.action")
	public String findoption(Model m){		
		
		List<Member> mlist=mservice.findAllMember();		
		List<Product> list=pservice.findAll();
		
		m.addAttribute("prolist", list);
		m.addAttribute("mmlist", mlist);
		
		return "/order/add";
	}

}
