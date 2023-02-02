package com.yedam.access;

public class Application03 {

	public static void main(String[] args) {
		Member mb = new Member();
		
		mb.setId("yedam");
		mb.setPwd("1234");
		mb.setName("김또치");
		mb.setAge(50);
		
		System.out.println("아이디 : " + mb.getId());
		System.out.println("비밀번호 : " + mb.getPwd());
		System.out.println("이름 : " + mb.getName());
		System.out.println("나이 : " + mb.getAge());
	}

}
