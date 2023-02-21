package com.yedam.student;

import java.util.List;
import java.util.Scanner;


public class StudentService {
	
	Scanner sc = new Scanner(System.in);
	
	//전체 학생 정보 조회
	public void getStudentList() {
		List<Student> list = StudentDAO.getInstance().getStudentList();
		System.out.println("==================================");
		for(int i=0; i<list.size(); i++) {
			System.out.println("학생 학번 : " + list.get(i).getStdId());
			System.out.println("학생 이름 : " + list.get(i).getStdName());
			System.out.println("학생 학과 : " + list.get(i).getStdMajor());
			System.out.println("학생 학점 : " + list.get(i).getStdPoint());
		}
		
	}
	
	//학번 조회
	public void getStudent() {
		System.out.println("학생 학번>");
		int stdNo = Integer.parseInt(sc.nextLine());
		Student std = StudentDAO.getInstance().getStudent(stdNo);
		if(std == null) {
			System.out.println("조회 결과 없음");
		}else {
			System.out.println("학생 학번 : " + std.getStdId());
			System.out.println("학생 이름 : " + std.getStdName());
			System.out.println("학생 학과 : " + std.getStdMajor());
			System.out.println("학생 학점 : " + std.getStdPoint());
		}
		System.out.println("==================================");
	}
	
	//학생 등록
	public void insertStd() {
		System.out.println("=================학생 등록=================");
		Student std = new Student();
		System.out.println("학생 학번>");
		std.setStdId(Integer.parseInt(sc.nextLine()));
		System.out.println("학생 이름>");
		std.setStdName(sc.nextLine());
		System.out.println("학생 전공>");
		std.setStdMajor(sc.nextLine());
		System.out.println("학생 학점>");
		std.setStdPoint(Double.parseDouble(sc.nextLine()));
		
		int result = StudentDAO.getInstance().insertStd(std);
		
		if(result > 0) {
			System.out.println("학생 등록 완료");
		}else {
			System.out.println("학생 등록 실패");
		}
		
		
	}
	
	//학생 제적
	public void deleteStd() {
		System.out.println("=================학생 삭제=================");
		System.out.println("학생 학번>");
		int stdNo = Integer.parseInt(sc.nextLine());
		
		Student std = new Student();
		std.setStdId(stdNo);
		
		int result = StudentDAO.getInstance().deleteStd(stdNo);
		
		if(result > 0) {
			System.out.println("학생 제적 완료");
		}else {
			System.out.println("학생 제적 실패");
		}
	}
	
	//학생 전공 변경
	public void updateStd() {
		System.out.println("=================학생 수정=================");
		System.out.println("수정 학생 번호>");
		int stdNo = Integer.parseInt(sc.nextLine());
		System.out.println("수정 전공 이름>");
		String stdMajor = sc.nextLine();
		
		Student std = new Student();
		std.setStdId(stdNo);
		std.setStdMajor(stdMajor);
		
		int result =StudentDAO.getInstance().updateStd(std);
		
		if(result > 0) {
			System.out.println("학생 전공 수정 완료");
		}else {
			System.out.println("학생 전공 수정 실패");
		}
	}
	
	public void getAnalyze() {
		List<Student> list = 
		StudentDAO.getInstance().getAnalyze();
		
		for(int i=0; i<list.size(); i++) {
			System.out.println("================전공별 분석=================");
			System.out.println("전공명 : " + list.get(i).getStdMajor());
			System.out.println("합 계 : " + list.get(i).getStdSum());
			System.out.println("평 균 : " + list.get(i).getStdAvg());
		}
	}
	
}
