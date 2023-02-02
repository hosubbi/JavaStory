package test;

import java.util.Scanner;

public class test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Dice[] = {1,2,3,4,5,6};
		boolean blean = true;
		int random = 0;
		while(blean) {
			System.out.println("===1.주사위 크기 2.주사위 굴리기 3.결과 보기 4.가장 많이 나온 수 5.종료===");
			System.out.println("메뉴>");
			int diceNum = Integer.parseInt(sc.nextLine());
			switch(diceNum) {
				case 1:
					System.out.println("주사위 크기>");
					int diceSize = Integer.parseInt(sc.nextLine());
						if (diceSize < 5 || diceSize > 10) {
							System.out.println("주사위의 크기는 5~10입니다. 다시입력하세요");
						}
						break;
							
				case 2:
					int count = 0;
					boolean a = true;
					while(a) {			
						random = Dice[(int)(Math.random()*5)];
						if(random == 5) {
							count += 1;
							a = false;
						}else {
							count += 1;
						}
					}
					System.out.printf("5가 나올 때까지 주사위를 %d번 굴렸습니다\n" ,count);
					break;
				case 3:
					System.out.println(random);
				case 4:
					
					
				case 5:
					System.out.println("프로그램 종료");								
			}
		}
	}
	
	
}
