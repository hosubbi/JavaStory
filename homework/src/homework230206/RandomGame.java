package homework230206;

import java.util.Scanner;

public class RandomGame {
//	Question 1]을 이용하여 랜덤게임 프로그램을 구현하라.
//1) 프로그램을 실행할 경우 50% 확률로 두 개의 게임 중 하나가 셋팅된다.
//	( RPGgame or ArcadeGame )
	public static Keypad getRandomGame() {
		Keypad game = null;
		int random = (int)(Math.random()*2) + 1;
		return (random == 1) ? new RPGgame() : new ArcadeGame(); //3항연산자 if로 표현가능
	}
		

	public static void main(String[] args) {
		
		boolean run = true;
		
		Scanner sc = new Scanner(System.in);
		//인터페이스 다형성, 자동타입변환 -> 하나의 객체로 두개 또는 여러개의 객체 만들어 사용
		//game = new RPGgame();
		//game = new ArcadeGame();
		Keypad game = getRandomGame(); //중요한 한줄!!!
		
		while(run) {
			System.out.println("=====================================================================================");
			System.out.println("<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>");
			System.out.println("=====================================================================================");
			System.out.println("입력>");
			int menuNo = Integer.parseInt(sc.nextLine());
			
			switch(menuNo) {
			case 1:
				game.leftUpButton();
				break;
			case 2:
				game.leftDownButton();
				break;
			case 3:
				game.rightUpButton();
				break;
			case 4:
				game.rightDownButton();
				break;
			case 5:
				game.changeMode();
				break;
			case 0:
				game = getRandomGame();
				break;
			case 9:
				System.out.println("EXIT>>");
				run = false;
				break;
			}
			
		}
	}

}
