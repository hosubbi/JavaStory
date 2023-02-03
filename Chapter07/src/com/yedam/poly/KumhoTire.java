package com.yedam.poly;

public class KumhoTire extends Tire{
	//필드
	//생성자
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulateRotation;
		if(accumulateRotation<maxRotation) {
			System.out.println(location + " Kumhotire 수명: " + (maxRotation-accumulateRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " KUmhoTire 펑크 ***");
			return false;
		}
	}
	
	//메소드
	
}
