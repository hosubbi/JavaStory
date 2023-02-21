package com.yedam.employee.service;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class EmployeesService {
	
	Scanner sc = new Scanner(System.in);
	
	//전체 조회
	public void getEmployeesList() {
		List<Employees> list = EmployeesDAO.getInstance().getEmployeesList();
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		
	}
	
	//등록
	public void insertEmp() {
		Employees emp = new Employees();
		
		System.out.println("=====사원 등록=====");
		
		System.out.println("사번>");
		//변수 지정 -> 객체 대입
		emp.setEmployeeId(Integer.parseInt(sc.nextLine()));
		
		System.out.println("이름>");
		emp.setLastName(sc.nextLine());
		
		System.out.println("이메일>");
		emp.setEmail(sc.nextLine());
		
		//데이터가 등록된 기준으로 정할껀지 -> sysdate
		//데이터를 입력을 해서 날짜를 지정 -> 입력
		System.out.println("입사일>");
		
		emp.setHireDate(Date.valueOf(sc.nextLine()));
		
		System.out.println("직책>");
		emp.setJobID(sc.nextLine());
		
		int result = EmployeesDAO.getInstance().insertEmp(emp);
		
		if(result > 0 ) {
			System.out.println("사원 입력 완료");
		} else {
			System.out.println("사원 입력 실패");
		}
		
	}
	
	
	
	
	
	
	
	
}
