package com.yh.bean;

import java.util.Date;
import java.util.List;

public class Order {
	private Integer id;
	private String orderNum;
	private Date orderTime;
	private Integer peopleCount;
	private String orderDesc;
	private Integer payType;
	private Integer orderStatus;
	private Integer productId;
	private Integer memberId;
	private List<Passenger> passengerList;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public Integer getPeopleCount() {
		return peopleCount;
	}
	public void setPeopleCount(Integer peopleCount) {
		this.peopleCount = peopleCount;
	}
	public String getOrderDesc() {
		return orderDesc;
	}
	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}
	public Integer getPayType() {
		return payType;
	}
	public void setPayType(Integer payType) {
		this.payType = payType;
	}
	public Integer getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getMemberId() {
		return memberId;
	}
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	
	@Override
	public String toString() {
		return "Order [id=" + id + ", orderNum=" + orderNum + ", orderTime=" + orderTime + ", peopleCount="
				+ peopleCount + ", orderDesc=" + orderDesc + ", payType=" + payType + ", orderStatus=" + orderStatus
				+ ", productId=" + productId + ", memberId=" + memberId + ", passengerList=" + passengerList + "]";
	}
	public List<Passenger> getPassengerList() {
		return passengerList;
	}
	public void setPassengerList(List<Passenger> passengerList) {
		this.passengerList = passengerList;
	}
	
	

}
