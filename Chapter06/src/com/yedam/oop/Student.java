package com.yedam.oop;

public class Student {
	
	//정보 - 학생이름, 학번, 국어,영어,수학 점수
	//기본 생성자, 모든 데이터를 초기화 생성자
	//학생의 정보를 출력해주는 getInfo()
	//sum(),avg()메소드 활용 해보자
	/*
	 * 이름 : 김또치
	 * 학번 : 20230201
	 * 총점 : 200
	 * 평균 : 68.xx
	 * 
	 */
	
	//필드
	String name;
	int studentId;
	int kor;
	int eng;
	int math;
	
	//생성자
	public Student() {
		
	}
	public Student (String name, int studentId, int kor, int eng, int math) {
		this.name = name;
		this.studentId = studentId;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	
	
	//메소드
	int sum() {
		return kor+eng+math;
	}
	double avg() {
		return sum()/3.0;
	}
	
//	void sum() {
//		System.out.println("총점 : " + (kor+eng+math));
//		return;
//	}
//	
//	void avg() {
//		System.out.printf("평균 : %5.2f\n", (kor+eng+math)/(double)3);
//	}
//	
	void getInfo() {
		System.out.println("이름 : " + name);
		System.out.println("학번 : " + studentId);
		System.out.println("총점 : " + sum());
		System.out.println("평균 : " + avg());
	}
}
