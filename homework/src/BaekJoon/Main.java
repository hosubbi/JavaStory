package BaekJoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String num = sc.next();
		int alpabet[] = new int[26];
		for(int i=1; i<alpabet.length; i++) {
			alpabet[0] = 99;
			alpabet[i] = alpabet[i-1]+1;
		}
		
		for(int i=0; i<num.length(); i++) {
			for(int j=0; j<alpabet.length; j++) {
				if(alpabet[j] == (num.charAt(i)-'0'+48)) {
					alpabet[j] = i;
				}
				
			}
			
		}
		for (int obj : alpabet) {
			System.out.println(obj);
		}
	}
}