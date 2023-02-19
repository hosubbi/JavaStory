package homework230209;

import java.util.Scanner;

public class StringGame {
	Scanner sc = new Scanner(System.in);
	String list[] = {"orange", "game", "phone", "smart"};
	String gameWord;
	String answerString = "";
	char inputChar;
	int count = 0;
	
	public void setCharData() {
		char answerChar[] = new char[gameWord.length()];
		gameWord =list[(int)(Math.random()*4)];
		System.out.println(gameWord);
		System.out.print("입력값 >>");
		inputChar = sc.next().charAt(0);
			for(int i=0; i<gameWord.length(); i++) {				
				if(gameWord.charAt(i) == inputChar) {
					answerString = "문자열을 구성하는 문자입니다.";
					answerChar[count] = inputChar;
					count++;
					break;
				}else {
					answerString = "문자열을 구성하는 문자가 아닙니다.";
				}
				
			}
			System.out.println("현재까지 확인된 문자열의 문자값은 다음과 같습니다.");
			for(char temp : answerChar) {
				System.out.print(temp + " ");
			}
			System.out.println();
			System.out.println(answerString);	
	}
	
	public void setStrdata() {
		
	}
	
	public void showCharData() {
		
	}
	
	public void init() {
		
	}
}
