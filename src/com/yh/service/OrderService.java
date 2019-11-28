package com.yh.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.yh.bean.Order;
import com.yh.bean.OrderQueryVo;

public interface OrderService {
	
	public void addOrder(Order order); 
	public PageInfo<Order> findOrder(Integer pageNum,Integer pageSize);
	
	public OrderQueryVo findOrderDetail(Integer id);

}
