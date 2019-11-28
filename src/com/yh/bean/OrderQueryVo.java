package com.yh.bean;

import java.util.List;

public class OrderQueryVo {
	
	private Order order;
	private Member member;
	private Product product;
	private List<Passenger> passengers;
	private User user;
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "OrderQueryVo [order=" + order + ", member=" + member + ", product=" + product + ", passengers="
				+ passengers + ", user=" + user + "]";
	}
	public List<Passenger> getPassengers() {
		return passengers;
	}
	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}
	
	
	

}
