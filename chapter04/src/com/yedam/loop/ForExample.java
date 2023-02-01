package com.yedam.loop;

public class ForExample {
	public static void main(String[] args) {
		//반복문
		//일정한 행동을 계속 반복
		//반복을 할 때 어떠한 규칙에 따라 행동 반복
		//규칙 찾는게 중요.
		
		//1~5까지 누적의 합
		int sum = 0;
		
//		sum = sum +1;
//		sum = sum +2;
//		sum = sum +3;
//		sum = sum +4;
//		sum = sum +5;
		
		
		//for문
		for(int i=1; i<=5; i++) {
			sum += i;
		}
		
		System.out.println("누적 합 : " + sum);
		
		//1~100 사이에서 짝수 구하는 반복문
		//1~100 -> 1~100까지 반복
		//1 2 3 4 5 6......
		// 2 % 2 ,, 4 % 2 ,, 6 % 2 ,,
		
		for(int i=1; i<=100; i++) {
			if(i % 2 == 0) {
				System.out.print(i + "\t");
			}
		}
		
		//1~100 사이의 홀수 구하는 반복문
		//1 3 5 7 9 11 13.....
		//1 % 2 == 1, 3 % 2 == 1,,
		for(int i=1; i<=100; i++) {
			if(i % 2 == 1) {
				System.out.print(i + "\t");
			}
		}
		System.out.println();
		//1~100 사이에서 2의 배수 또는 3의 배수 찾기
		//2의 배수 => 어떤 값을 2로 나누었을 때 0인 애들.
		//3의 배수 => 어떤 값을 3로 나누었을 때 0인 애들.
		for(int i=1; i<=100; i++) {
			if(i%2 == 0 || i%3 == 0) {
				System.out.println("2 또는 3의 배수 : " + i);
			}
		}
		
		//구구단 출력하기
		//2*1 = 2
		//2*2 = 4
		//2*3 = 6...
		
		for(int i=1; i<10; i++) {
			System.out.println("2 x " + i + " = " + (2*i));
		}
		
		//중첩 for문
		//반복문 안에 반복문이 들어가는 형태
		
		//for() {
		//	for() {
		//		for() {
		//					
		//		}
		//				
		//	}
		//}
			
		//2단 -> 2*1, 2*2, 2*3...
		//3단 -> 3*1, 3*2, 3*3...
		//4단 -> 4*1, 4*2, 4*3...
		
		//2단 ~ 9단까지를 출력하는 반복문
		//i = 2~9
//		for(int i=2; i<=9; i++) {
//			//j = 1~9
//			for(int j=1; j<=9; j++) {
//				System.out.println(i + " * " + j + " = " + (i*j));
//			}
//		}
		
		//구구단 세로 찍기
		for(int i=1; i<=9; i++) {
			for (int j=2; j<=5; j++) {
				System.out.print(j + " * " + i + " = " + (j*i) + "\t");
			}
				System.out.print("\n");
		}
		
		//줄수를 의미하는 for문 -교수님 version-
//		for(int i=1; i<=9; i++) {
//			//해당 줄수에서 한칸씩 늘어나는 for문
//			for(int j=2; j<6; j++) {
//				System.out.print(j + " x " + i + " = " + (j*i) + "\t");
//			}
//				System.out.println();
//		}
		
		//공포의 별찍기
		
		//*****
		//*****
		//*****
		//*****
		//*****
		//한칸씩 내려 갈 때 쓰는 반복문
		for(int i=0; i<5; i++) {
			String star = "";
			for(int j=0; j<5; j++) {
//				star = star + "*";
				System.out.print("*");
			}
//			System.out.println(star);
			System.out.println();
		}
		
		//*
		//**
		//***
		//****
		//*****
		for (int i=1; i<6; i++) {
			String star = "";
			for(int j=1; j<=i; j++) {
				star = star + "*";
			}
			System.out.println(star);
		}
		
		
		//*****
		//****
		//***
		//**
		//*
		
		for (int i=1; i<6; i++) {
			String star = "";
			for(int j=0; j<6-i; j++) {
				star += "*";
			}
			System.out.println(star);
		}
		
		//교수님 -version-
//		for(int i=5; i>0; i--) {
//			String star = "*";
//			for(int j=i; j>0; j++) {
//				star += "*";
//			}
//			System.out.println(star);
//		}
		
		//-문제-
		//    *
		//   **
		//  ***
		// ****
		//*****
		
		for (int i=1; i<6; i++) {
			String star = "";
			for(int j=1; j<6-i; j++) {
				star += " ";
			}
			for(int stars=1; stars<=i; stars++) {
				star += "*";
			}
			System.out.println(star);
		}
		
		//교수님 -version-
		for(int i=5; i>0; i--) {
			for(int j=1; j<=5; j++) {
				if(i>j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
