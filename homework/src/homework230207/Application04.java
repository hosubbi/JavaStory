package homework230207;

import java.util.Scanner;

public class Application04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String strList = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		//indexOf, charAt
		//aaabbccceedddd
		//1)charAt(0)~charAt(문자열.length()-1)
		//2)charAt(0) - > a
		//3)indexOf(a) -> a의 위치 -> index : 0
		//4)indexOf(charAt(i)) == i
		
		System.out.print("출력 : ");
		for(int i=0; i<strList.length(); i++) {
			if(strList.indexOf(strList.charAt(i)) == i) {
//				System.out.println(i);
				sb.append(strList.charAt(i));
			}
		}
		System.out.println(sb);
		
	
	
	}
}