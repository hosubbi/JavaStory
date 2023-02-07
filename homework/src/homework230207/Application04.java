package homework230207;

import java.util.Scanner;

public class Application04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String input = sc.nextLine();
		System.out.print("출력 : ");
//		System.out.print(input.charAt(3));
		for (int i = 0; i<input.length()-1; i++) {
			for (int j = i+1; j<input.length()-1; j++) {
				if(input.charAt(i) == input.charAt(j)) {
					System.out.print(input.charAt(i));
					break;
				}
			}
		}
	}
}
