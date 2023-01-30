package homework;

import java.util.Scanner;

public class day02homework {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			//Q1
			boolean flag = true;
			while(flag) {
				System.out.println("x값을 입력하시오>");
				int x = Integer.parseInt(sc.nextLine());
				System.out.println("y값을 입력하시오>");
				int y = Integer.parseInt(sc.nextLine());
				
				if(x>0 && y>0) {
				System.out.println("제1사분면");
				break;
				}
				if(x<0 && y>0) {
				System.out.println("제2사분면");
				break;
				}
				if(x<0 && y<0) {
				System.out.println("제3사분면");
				break;
				}
				if(x>0 && y<0) {
				System.out.println("제4사분면");
				break;
				}
			}
			
			//Q2
			while(true) {
				System.out.println("연도를 입력하시오>");
				int year = Integer.parseInt(sc.nextLine());
				
				if(year%4 == 0 && year%100 != 0) {
					System.out.println(year +"년 = "+ "윤년" );
				} else if (year % 400 == 0) {
					System.out.println(year +"년 = "+ "윤년" );
				}else {
					System.out.println(year +"년 = "+ "윤년이 아닙니다" );
				}
				break;
			}
			
			//Q3
			
			
			
			
			
			
			
			
			

	}

}
