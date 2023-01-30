package homework;

import java.util.Scanner;

public class day02homework {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			//Q1
			System.out.println("=====사분면 구하기=====");
			System.out.println("x값을 입력하시오>");
			int x = Integer.parseInt(sc.nextLine());
			System.out.println("y값을 입력하시오>");
			int y = Integer.parseInt(sc.nextLine());
			if(x>0 && y>0) {
				System.out.println("제1사분면");
			}else if(x<0 && y>0) {
				System.out.println("제2사분면");
			}else if(x<0 && y<0) {
				System.out.println("제3사분면");
			}else if(x>0 && y<0) {
				System.out.println("제4사분면");
			}

			//Q2
			System.out.println("=====윤년인지 구하기=====");
			System.out.println("연도를 입력하시오>");
			int year = Integer.parseInt(sc.nextLine());			
			if(year%4 == 0 && year%100 != 0) {
				System.out.println(year +"년 : "+ "윤년" );
			}else if (year % 400 == 0) {
				System.out.println(year +"년 : "+ "윤년" );
			}else {
				System.out.println(year +"년은 "+ "윤년이 아닙니다" );
			}
			
			//Q3
			System.out.println("=====가위!바위!보!=====");
			System.out.println("1.가위 | 2.바위 | 3.보");
			int rsp = Integer.parseInt(sc.nextLine());
			switch(rsp) {
			case 1:
				System.out.println("이기기 위해선 바위를 내야합니다.");
				break;
			case 2:
				System.out.println("이기기 위해선 보를 내야합니다.");
				break;
			case 3:
				System.out.println("이기기 위해선 가위를 내야합니다.");
				break;
			}
			
			//Q4
			System.out.println("=====m*n단을 구하시오=====");
			System.out.println("m값을 입력하시오>");
			int m = Integer.parseInt(sc.nextLine());
			System.out.println("n값을 입력하시오>");
			int n = Integer.parseInt(sc.nextLine());		
			for(int j=m; j<=m; j++) {
				for(int i=1; i<=n; i++) {
					System.out.println(j + "x" + i + "=" + (j*i));
				}
			}
			
			//Q5
			System.out.println("=====얼음요정의 n*n단=====");
			System.out.println("얼음요정의 n*n단을 입력하시오>");	
			int a = Integer.parseInt(sc.nextLine());
			for(int i=1; i<=a; i++) {
				for(int j=1; j<=a; j++) {
					if(i%10 == 9 || i/10 == 9 || j%10 == 9 || j/10 == 9 || i*j%10 == 9 || i*j/10 == 9) {
						System.out.print(i + "*" + j + "=" + (i*j) + "\t");
					}else {
					System.out.print(i + "*" + j + "=" + "9" + "\t");
					}
				}
				System.out.println();
			}
				

	}

}
