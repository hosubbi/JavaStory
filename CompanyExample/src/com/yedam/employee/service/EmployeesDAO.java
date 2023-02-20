package com.yedam.employee.service;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;
import com.yedam.departments.service.Departments;

public class EmployeesDAO extends DAO{
	
	private static EmployeesDAO employeeDao = null;
	
	public void EmployeesDAO() {
		
	}
	
	public static EmployeesDAO getInstance() {
		if(employeeDao == null) {
			employeeDao = new EmployeesDAO();
		}
		return employeeDao;
	}
	
	//모든 직원 조회
	public List<Employees> getEmployeesList(){
		List<Employees> list = new ArrayList<>();
		Employees employee = null;
		try {
			conn();
			String sql = "select * from employees";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				employee = new Employees();
				employee.setEmployeeId(rs.getInt("employee_id"));
				employee.setEmployeeName(rs.getString("last_name"));
				employee.setJobId(rs.getString("job_id"));
				
				list.add(employee);
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	//직원 한명 조회
	public Employees getEmployee(int employeeKey) {
		Employees employee = null;
		try {
			conn();
			String sql = "select * from employees where employee_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, employeeKey);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				employee = new Employees();
				employee.setEmployeeId(rs.getInt("employee_id"));
				employee.setEmployeeName(rs.getString("employee_name"));
				employee.setJobId(rs.getString("job_id"));
			}			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return employee;
	}
	
	//직원 삭제
	

	
	
	
}
