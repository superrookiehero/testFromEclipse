package com.yh.mapper;



import java.util.List;
import java.util.Map;

import com.yh.bean.Order;
import com.yh.bean.OrderQueryVo;

public interface OrderMapper {
	
	
	public void addOrder(Order order);
	public List<Order> findOrder();
	
	public OrderQueryVo findOrderDetail(Integer id);
	
	public void insertOrderAndPassenger(Map<String,Integer> map);
	
	
	/*public void addALL(OrderAndPassengerVo oav);*/
	
	

}
