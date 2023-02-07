package homework230207;

import java.util.Scanner;

public class Application02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String inputString = sc.nextLine();
		byte[] inputByte = inputString.getBytes();
		int alphabetCount = 0;
		int numCount = 0;
		int blankCount = 0;
		for(int i = 0; i <= inputByte.length-1; i++) {
			if(inputByte[i] >= 97 && inputByte[i] <= 122) {
				alphabetCount++;
			} else if(inputByte[i] >= 48 && inputByte[i] <= 57) {
				numCount++;
			} else if(inputByte[i] == 32) {
				blankCount++;
			}
		}
		System.out.printf("출력 : 문자 : %d개, 숫자 : %d개, 공백 : %d개", alphabetCount, numCount, blankCount);
	}

}
