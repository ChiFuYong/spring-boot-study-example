package com.chifuyong.entity;

public class Student {
	private Integer userid;
	private String username;
	private Integer userage;

	public Student(Integer userid, String username, Integer userage) {
		this.userid = userid;
		this.username = username;
		this.userage = userage;
	}

	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getUserage() {
		return userage;
	}
	public void setUserage(Integer userage) {
		this.userage = userage;
	}

	
}