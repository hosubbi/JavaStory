package com.yedam.array;

public class Exam05 {
	public static void main(String[] args) {
		//최대값 또는 최소값이 위치하는 인덱스 구하기
		int[] array = {20,50,70,80,30,10,90,100};
		
		int max = array[0];
		int min = array[0];
		int maxIndex = 0;
		int minIndex = 0;
		
		//최대값, 최대값 인덱스 구하기
		for(int i=0; i<array.length; i++) {
			if(array[i]>max) {
				max = array[i];
				maxIndex = i;
			}			
		}
		System.out.println("최대값은 : " + max +" 인덱스는 " + maxIndex);
		
		//최소값, 최소값 인덱스 구하기
		for(int i=0; i<array.length; i++) {			
			if(array[i]<min){				
				min = array[i];
				minIndex = i;
			}			
		}
		System.out.println("최소값은 : " + min +" 인덱스는 " + minIndex);	
		
		
		//명령 라인 출력
		for(int i = 0; i<args.length; i++) {
			System.out.println("명령 라인 출력 : " + args[i]);
		}
		
		
		
		
		
		
	}

}
