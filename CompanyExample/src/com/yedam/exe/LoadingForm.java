package com.yedam.exe;

import java.util.Scanner;

import com.yedam.departments.service.DepartmentsService;
import com.yedam.employee.service.EmployeesService;

public class LoadingForm {
	
		Scanner sc = new Scanner(System.in);
		
		//run 메소드 안에 메뉴 선택 용도
		int selectNo = 0;
		
		public LoadingForm() {
			run();
		}
		
		private void run() {
			
			
			while(selectNo != 3){
				
				menu();
				
				switch(selectNo) {
				case 1:
					//부서 관련 프로그램 메뉴 출력.
					departments();
					break;
				case 2:
					//사원 관련 프로그램 메뉴 출력
					employees();
					break;
				case 3:
					System.out.println("프로그램 종료");
					break;
				}
				
			}
			
			
			
		}
		
		//메뉴 선택 출력
		private void menu() {
			System.out.println("☆★☆★☆★☆★☆★또치's 회사 프로그램★☆★☆★☆★☆★☆");
			System.out.println("☆ 1. 부서        2. 사원        3. 종료★");
			System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
			System.out.println("입력>");
			selectNo = Integer.parseInt(sc.nextLine());
		}
		
		//부서 정보 출력
		private void departments() {
			
			int departmentMenu = 0;
			DepartmentsService ds = new DepartmentsService();
			
			while(departmentMenu != 6) {
				//1. 부서관련 프로그램 - 모든 부서 조회, 한 부서 조회, 부서 삭제, 수정, 등록
				System.out.println("============================================================");
				System.out.println("1. 모든 부서 조회 | 2. 부서 조회 | 3. 삭제 | 4. 수정 | 5. 등록 | 6. 종료");
				System.out.println("============================================================");
				departmentMenu = Integer.parseInt(sc.nextLine());
			
				switch (departmentMenu) {
				case 1:
					ds.getDepartmentsList();
					break;
				case 2:
					ds.getDepartment();
					break;
				case 3:
					ds.deleteDept();
					break;
				case 4:
					ds.modifyDept();
					break;
				case 5:
					ds.insertDept();
					break;
				case 6:
					System.out.println("☞부서 업무 종료");
					break;
				}
			}
			
			
		}
		
		//사원 정보 출력
		private void employees() {
			
			int employeesMenu = 0;
			EmployeesService es = new EmployeesService();
			
			while(employeesMenu != 6) {
				//1. 직원관련 프로그램 - 모든 직원 조회, 한명의 직원 조회, 직원 삭제, 수정, 등록
				System.out.println("============================================================");
				System.out.println("1. 모든 직원 조회 | 2. 직원 한 명 조회 | 3. 삭제 | 4. 수정 | 5. 등록 | 6. 종료");
				System.out.println("============================================================");
				employeesMenu = Integer.parseInt(sc.nextLine());
			
				
				switch (employeesMenu) {
				case 1:
					es.getEmployeesList();
					break;
				case 2:
					//한명의 사원 조회
					break;
				case 3:
					es.insertEmp();
					break;
				case 4:
					//종료
					break;

				}
		
			}
		}
}
