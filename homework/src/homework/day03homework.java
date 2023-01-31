package homework;

import java.util.Scanner;

public class day03homework {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr1 = {10, 20, 30, 50, 3, 60, -3};
		//Q1
		for (int i = 0; i<arr1.length; i++) {
			if(arr1[i] == 60) {
				System.out.println("값이 60인 곳의 인덱스 : " + i);
			}
		}
		
		//Q2
		for (int i = 0; i<arr1.length; i++) {
			if (i != 3) {
				System.out.println("arr1["+i+"] : " + arr1[i]);
			}
		}
		
		//Q3
		System.out.println("변경하고 싶은 값의 인덱스 번호를 입력하시오>");
		int indexNum = Integer.parseInt(sc.nextLine());
		arr1[indexNum] = 1000;
		System.out.println(arr1[indexNum]);
		
		//Q4
		int max = arr1[0];
		int min = arr1[0];
		
		for(int i=0; i<arr1.length; i++) {
			if(max>arr1[i]) {
				max = arr1[i];
			}
			if(min<arr1[i]) {
				min = arr1[i];				
			}
		}
		System.out.println("최대값은 : " + max);
		System.out.println("최소값은 : " + min);
		
		//Q5
		int[] array = {1,3,5,16,9,2,20,4,5,10};
		for (int i = 0; i<arr1.length; i++) {
			if(array[i]%3 == 0) {
				System.out.println(array[i]);
			}
		}
		
		//추가문제
			int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
			int[] counter = new int[4];
			
			for (int i = 0; i < answer.length; i++) {
				for(int j=1; j <= counter.length; j++) {
					if(answer[i] == j) {
						counter[j-1] += 1;
					}
				}
			}
			for (int i = 0; i < counter.length; i++) {
				for (int j = 1; j <= counter[i]; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		//***
		//**
		//**
		//****
	}

}
