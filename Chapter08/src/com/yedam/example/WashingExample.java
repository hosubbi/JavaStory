package com.yedam.example;


public class WashingExample {

	public static void main(String[] args) {
		LgWashingMachine LGws = new LgWashingMachine();
		LGws.start();
		LGws.stop();
		System.out.println("세탁기 속도 : " + LGws.speedChange(2));
		LGws.stop();
		LGws.dry();
		

	}

}
