package test;

import java.util.Scanner;

public class test4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단 입력>");
		int a = Integer.parseInt(sc.nextLine());
		for(int i=2; i<=a; i++) {			
			for(int j=1; j<=a; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
	}
}


