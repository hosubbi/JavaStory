package com.yedam.employee.service;

import java.util.List;
import java.util.Scanner;

import com.yedam.departments.service.Departments;
import com.yedam.departments.service.DepartmentsDAO;

public class EmployeesService {

	Scanner sc = new Scanner(System.in);
	
	//모든 직원 조회
	public void getEmployeesList() {
		List<Employees> list = EmployeesDAO.getInstance().getEmployeesList();
		System.out.println("==================================");
		for(int i=0; i<list.size(); i++) {
			System.out.println("직원 ID : " + list.get(i).getEmployeeId());
			System.out.println("직원 이름 : " + list.get(i).getEmployeeName());
			System.out.println("직원 업무 : " + list.get(i).getJobId());
			System.out.println("==================================");
		}		
	}
	
	//직원 조회
	public void getEmployee() {
		System.out.println("직원 번호>");
		int empNo = Integer.parseInt(sc.nextLine());
		Employees emp = EmployeesDAO.getInstance().getEmployee(empNo);
		if(emp == null) {
			System.out.println("조회된 결과 없음.");
		} else {
			System.out.println("직원 번호 : " + emp.getEmployeeId());
			System.out.println("직원 이름 : " + emp.getEmployeeName());
			System.out.println("직원 업무 : " + emp.getJobId());
		}
		System.out.println("==================================");
	}
	
	//등록
	public void insertEmp() {
		System.out.println("====================직원 생성====================");
		System.out.println("직원 번호>");
		int empNo = Integer.parseInt(sc.nextLine());
		
		System.out.println("직원 이름>");
		String empName = sc.nextLine();
		
		System.out.println("직원 업무>");
		String empJob = sc.nextLine();
		
		Employees emp = new Employees();
		
		emp.setEmployeeId(empNo);
		emp.setEmployeeName(empName);
		emp.setJobId(empJob);
		
		int result = EmployeesDAO.getInstance().insertEmp(emp);
		
		if(result > 0) {
			System.out.println("직원 등록 완료");
		} else {
			System.out.println("직원 등록 실패");
		}
	}
	
	//수정
	public void modifyEmp() {
		System.out.println("====================직원 수정====================");
		System.out.println("수정할 직원 번호>");
		int empNo = Integer.parseInt(sc.nextLine());
		System.out.println("어떤 번호로 수정 하시겠습니까>");
		int empNo1 = Integer.parseInt(sc.nextLine());
		
		Employees emp = new Employees();
		
		emp.setEmployeeId(empNo);
		emp.setEmployeeId(empNo1);
		
		int result = EmployeesDAO.getInstance().modifyEmp(emp);
		
		if(result > 0) {
			System.out.println("직원번호 수정 완료");
		}else {
			System.out.println("직원번호 수정 실패");
		}
	}
	
	//삭제
		public void deleteEmp() {
			System.out.println("====================직원 삭제====================");
			System.out.println("삭제 직원 번호>");
			int empNo = Integer.parseInt(sc.nextLine());
			
			Employees emp = new Employees();
			
			emp.setEmployeeId(empNo);
			
			int result = EmployeesDAO.getInstance().deleteEmp(emp);
			
			if(result > 0) {
				System.out.println("직원 삭제 완료");
			}else {
				System.out.println("직원 삭제 실패");
			}
			
		}
		
}
