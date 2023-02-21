package com.yedam.employee.service;

import java.sql.Date;

public class Employees {
//	EMPLOYEE_ID             NUMBER(6)    
//	LAST_NAME      NOT NULL VARCHAR2(25) 
//	EMAIL          NOT NULL VARCHAR2(25) 
//	HIRE_DATE      NOT NULL DATE         
//	JOB_ID         NOT NULL VARCHAR2(10) 
	
	private int employeeId;
	private String lastName;
	private String email;
	//java.sql.Date vs java.util.Date 차이
	//연월일             연월일시분초
	//사용하는 방식이 서로 좀 ... 다릅니다.
	private Date hireDate;
	private String jobID;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public String getJobID() {
		return jobID;
	}
	public void setJobID(String jobID) {
		this.jobID = jobID;
	}
	//toString
	@Override
	public String toString() {
		return "Employees [사번=" + employeeId + ",\t이름=" + lastName + ",\t이메일=" + email + ",\t입사일="
				+ hireDate + ",\t직책=" + jobID + "]";
	}
	
	
}
