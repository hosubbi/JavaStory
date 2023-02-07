package com.yedam.API;

public class Student {
	private String stdNum;
	
	public Student(String stdNum) {
		this.stdNum = stdNum;
	}
	
	public String getStdNum() {
		return stdNum;
	}

	@Override
	public int hashCode() {
		return stdNum.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student) obj;
			if(stdNum.equals(std.stdNum)) {
				return true;
			}
		}
		return false;
	}
	
	
}
