package com.yedam.inheritance;

public class Child extends Parent{
	//필드
	//lastName, 혈액형, 나이, 취미
	private String lastName;
	private char bloodType;
	private int age;
	private String habbit;
	
	
	
	//메소드
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("내이름 : " + lastName);
		System.out.println("혈액형 : " + bloodType + "형");
		System.out.println("나이 : " + age);
		System.out.println("취미 : " + habbit);
	}
//	VIPPerson vip = new VIPPerson();
//	vip.memberInfo();

	
	
}

