package homework230207;

import java.util.Scanner;

public class Application03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String inputAlphabet = sc.nextLine();
		System.out.println("---------------------------------");
		System.out.print("입력 : 첫번째 문자 : ");
		String firstChar = sc.nextLine();
		System.out.print("입력 : 두번째 문자 : ");
		String secondChar = sc.nextLine();
		int firstIndex = inputAlphabet.indexOf(firstChar);
		int secondIndex = inputAlphabet.indexOf(secondChar);
		if(firstIndex > secondIndex) {
			System.out.printf("출력 : 두 문자간의 거리 : %d", (firstIndex-secondIndex)-1);
		}else {
			System.out.printf("출력 : 두 문자간의 거리 : %d", (secondIndex-firstIndex)-1);
		}
	}

}
