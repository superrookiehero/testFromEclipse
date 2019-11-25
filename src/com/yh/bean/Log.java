package com.yh.bean;

import java.util.Date;

public class Log {
	private Integer id;
	private Date visitTime;
	private String userName;
	private String ip;
	private String url;
	private Date executionTime;
	private String method;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getVisitTime() {
		return visitTime;
	}
	public void setVisitTime(Date visitTime) {
		this.visitTime = visitTime;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Date getExecutionTime() {
		return executionTime;
	}
	public void setExecutionTime(Date executionTime) {
		this.executionTime = executionTime;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	@Override
	public String toString() {
		return "Log [id=" + id + ", visitTime=" + visitTime + ", userName=" + userName + ", ip=" + ip + ", url=" + url
				+ ", executionTime=" + executionTime + ", method=" + method + "]";
	}
  
}
