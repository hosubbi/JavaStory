package com.yedam.service;

import java.sql.Date;

public class Cafe {
//	cafe_id varchar2(15) Primary key,
//	cafe_name varchar2(12) not null,
//	cafe_pw varchar2(15) not null,
//	cafe_email varchar2(30),
//	cafe_joindate date default sysdate
	
	private String cafeId;
	private String cafeName;
	private String cafePw;
	private String cafeEmail;
	private String cafeGrade;
	

	public String getCafeId() {
		return cafeId;
	}
	public void setCafeId(String cafeId) {
		this.cafeId = cafeId;
	}
	public String getCafeName() {
		return cafeName;
	}
	public void setCafeName(String cafeName) {
		this.cafeName = cafeName;
	}
	public String getCafePw() {
		return cafePw;
	}
	public void setCafePw(String cafePw) {
		this.cafePw = cafePw;
	}
	public String getCafeEmail() {
		return cafeEmail;
	}
	public void setCafeEmail(String cafeEmail) {
		this.cafeEmail = cafeEmail;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	private Date joinDate;
	
	public String getCafeGrade() {
		return cafeGrade;
	}
	public void setCafeGrade(String cafeGrade) {
		this.cafeGrade = cafeGrade;
	}
	
	@Override
	public String toString() {
		return "Cafe [cafeId=" + cafeId + ", cafeName=" + cafeName + ", cafePw=" + cafePw + ", cafeEmail=" + cafeEmail
				+ ", cafeGrade=" + cafeGrade + ", joinDate=" + joinDate + "]";
	}
	
	
	
	
}
