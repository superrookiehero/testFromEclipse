package com.yh.bean;

import java.util.List;

public class OrderAndPassengerVo {
	private List<Passenger> plist;
	private Order order;
	public List<Passenger> getPlist() {
		return plist;
	}
	public void setPlist(List<Passenger> plist) {
		this.plist = plist;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}

}
