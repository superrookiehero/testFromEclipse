package com.yh.service;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yh.bean.Order;
import com.yh.bean.OrderQueryVo;
import com.yh.bean.Passenger;
import com.yh.mapper.OrderMapper;
import com.yh.mapper.PassengerMapper;
@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
	private OrderMapper om; 
    @Autowired
    private PassengerMapper pMapper;
	@Override
	public void addOrder(Order order) {
		// TODO Auto-generated method stub
		//添加乘客(List<pid>)
		//从 order中 获取乘客信息
		List<Passenger> passsengers=order.getPassengerList();
		List<Integer> pIds=new ArrayList<>();
		for (Passenger passenger : passsengers) {
			//循环遍历       
			pMapper.insertPassenger(passenger);//添加  乘客   一
			pIds.add(passenger.getId());//获取id
		}
		//添加订单(oid)
		om.addOrder(order);//三
		Integer oid=order.getId();
		//添加订单乘客连接表（需要：新增的乘客的pid(pIds)  orde 的oid ）
		Map<String,Integer> map=new HashMap<>();
		
		for(Integer pid:pIds){
			map.put("orderId", oid);
			map.put("passengerId", pid);
			//把游客id和订单id放到关联表中
			om.insertOrderAndPassenger(map);//二
		}
		
	}




	@Override
	public OrderQueryVo findOrderDetail(Integer id) {
		// TODO Auto-generated method stub
		return om.findOrderDetail(id);
	}

	@Override
	public PageInfo<Order> findOrder(Integer pageNum, Integer pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		List<Order> list=om.findOrder();
		PageInfo<Order> pi=new PageInfo<>(list);
		return pi;
	}

}
