package com.yedam.example;

public class LgWashingMachine implements WashingMachine{

	@Override
	public void dry() {
		System.out.println("건조 기능");
		
	}

	@Override
	public void start() {
		System.out.println("빨래 시작");
		
	}

	@Override
	public void stop() {
		System.out.println("빨래 중지");
		
	}

	@Override
	public void end() {
		System.out.println("빨래 종료");
		
	}

	@Override
	public int speedChange(int speed) {
		int nowSpeed = 0;
		switch(speed) {
			case 1:
				nowSpeed = 20;
				break;
			case 2:
				nowSpeed = 50;
				break;
			case 3:
				nowSpeed = 100;
				break;
		}
		return nowSpeed;
	} 
	
		
	
}
