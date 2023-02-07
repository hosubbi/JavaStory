package homework230207;

import java.util.Scanner;

public class Application01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("입력>");
		String first = sc.nextLine();
		System.out.printf("입력>");
		String second = sc.nextLine();
		System.out.printf("입력>");
		String third = sc.nextLine();
		
		if(first.length()<second.length() && first.length()<third.length()) {
			System.out.println("가장 짧은 단어는" + first + "이며, 길이는 " + first.length() + " 입니다." );
		}else if(second.length()<first.length() && second.length()<third.length()) {
			System.out.println("가장 짧은 단어는" + second + "이며, 길이는 " + second.length() + " 입니다." );
		}else if(third.length()<first.length() && third.length()<second.length()) {
			System.out.println("가장 짧은 단어는 " + third + "이며, 길이는 " + third.length() + " 입니다." );
		}

	}
}