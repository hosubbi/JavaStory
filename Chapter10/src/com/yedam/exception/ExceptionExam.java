package com.yedam.exception;

public class ExceptionExam {
	public static void main(String[] args) {
		// nullpointexception
//		String data = null;
//		System.out.println(data.toString());
//		Example example = null;
//		System.out.println(example.toString());
		
		//ArrayIndexOutOfBoundsException
		//배열의 범위를 벗어난 인덱스를 호출 할 때 발생
		//index 0~2
//		int[] intAry = new int[3];
//		
//		intAry[0] = 1;
////		intAry[10] = 10;
//		
//		for(int i = 0; i<=intAry.length; i++) {
//			System.out.println(intAry[i]);
		
		//NumberFormatException
		//숫자로 바꿀 수 없는 문자를 숫자로 바꾸려고 할 때
//		String str = "123";
//		int val = Integer.parseInt(str);
//		System.out.println(val);
		//예외
//		String str2 = "자바";
//		val = Integer.parseInt(str2);
//		System.out.println(val);
//		String str3 = ""; //empty
//		val = Integer.parseInt(str3);
//		System.out.println(val);
		
		//ClassCastException
		//자동타입변환 된 객체를 강제타입변환할 때 발생
		
		//정상
		Example exam = new Exam();
		Exam exam02 = (Exam)exam;
		
		//예외
		Example exam03 = new Exam();
		Exam02 exam04 = (Exam02) exam03;
		
		if(exam03 instanceof Exam) {
			Exam exam05 = (Exam) exam03;
		}
		
		//ClassNotFoundException -> Class 파일 찾지 못할때
		//실행메소드 -> main 못 찾을때 자주 발생
		
		//ArithmeticException -> 분모가 0일떄 나오는 오류
		//double a = 1/0;
		
		//(반복문 종료하지 못하고 무한 루프 등등)
		//OutofMemoryError -> 메모리 부족할때
		//memory leak
		
		//IOException -> 입출력 오류
		//				 file reading/write
				
		//FileNotFoundException
		//java -> file reading -> 경로를 찾아서 file 읽어야함.
		//해당 경로 찾아 갔는데 파일이 존재 하지 않음.
		
	}

}
