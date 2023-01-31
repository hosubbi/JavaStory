package com.yedam.array;

import java.util.Scanner;

public class Exam04 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------------");
			System.out.println("선택> ");
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				System.out.println("학생수> ");
				studentNum = Integer.parseInt(scanner.nextLine());
			} else if(selectNo == 2) {
				//1번 메뉴를 변경하고 싶을 때 혹시나 상황을 대비해서
				scores = new int[studentNum];
				
				for(int i =0; i<scores.length; i++) {
					System.out.println("scores[" + i + "]>");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
			} else if(selectNo == 3) {
				for(int var : scores) {
					int i = 0;
					System.out.println("scores[" + i + "]>" + var);
				}
			} else if(selectNo == 4) {
				//최고값, 평균
				int max = scores[0];
				int sum = 0;
				double avg;
				for(int i = 0; i<scores.length; i++) {
					//최고값 구하기
					if(scores[i] > max) {
						max = scores[i];
					}
					//합계 구하기(평균 구하기 위해)
					sum += scores[i];
				}
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + sum/(double)scores.length);
			} else if(selectNo == 5) {
				System.out.println("프로그램 종료");
				run = false;
			}
		}
	}
}

