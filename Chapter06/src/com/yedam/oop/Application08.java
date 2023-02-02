package com.yedam.oop;

public class Application08 {

	public static void main(String[] args) {
		Person p1 = new Person("111111-2111111", "김또치");
		//개명
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//지구의 반지름
		System.out.println("지구의 반지름 : " + StaticCal.PI);
		//지구의 표면적(pi*r*r)
		System.out.println("지구의 표면적 : " + StaticCal.PI * StaticCal.EARTH_RADIUS * StaticCal.EARTH_RADIUS);
		

	}

}
