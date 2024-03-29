package com.yh.bean;

public class Passenger {
	private Integer id;
	private String name;
	private String sex;
	private String phoneNum;
	private Integer credentialsType;
	private String credentialsNum;
	private Integer travellerType;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public Integer getCredentialsType() {
		return credentialsType;
	}
	public void setCredentialsType(Integer credentialsType) {
		this.credentialsType = credentialsType;
	}
	public String getCredentialsNum() {
		return credentialsNum;
	}
	public void setCredentialsNum(String credentialsNum) {
		this.credentialsNum = credentialsNum;
	}
	public Integer getTravellerType() {
		return travellerType;
	}
	public void setTravellerType(Integer travellerType) {
		this.travellerType = travellerType;
	}
	@Override
	public String toString() {
		return "Passenger [id=" + id + ", name=" + name + ", sex=" + sex + ", phoneNum=" + phoneNum
				+ ", credentialsType=" + credentialsType + ", credentialsNum=" + credentialsNum + ", travellerType="
				+ travellerType + "]";
	}

}
