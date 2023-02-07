package com.yedam.API;

public class StringAPIExample {

	public static void main(String[] args) {
		//1) 문자열 뒤집기
//		String str = "abcdefg" -> "gfedcba"
		
//		String subject = "자바 프로그래밍";
//		int index = subject.indexOf("그래밍");
//		System.out.println(index);
		
		
		String str = "abcdefg";
//		char gender = str.charAt(6);
//		System.out.print(gender);
//		char gender1 = str.charAt(5);
//		System.out.print(gender1);
//		char gender2 = str.charAt(4);
//		System.out.print(gender2);
//		char gender3 = str.charAt(3);
//		System.out.print(gender3);
//		char gender4 = str.charAt(2);
//		System.out.print(gender4);
//		char gender5 = str.charAt(1);
//		System.out.print(gender5);
//		char gender6 = str.charAt(0);
//		System.out.print(gender6);
//		
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}

}
