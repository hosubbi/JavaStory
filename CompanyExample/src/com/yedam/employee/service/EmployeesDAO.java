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
				employee.setEmployeeName(rs.getString("last_name"));
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
	public int deleteEmp(Employees emp) {
		int result = 0;
		try {
			conn();
			String sql = "DELETE FROM emp WHERE employee_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getEmployeeId());
			
			result = pstmt.executeUpdate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//수정
	public int modifyEmp(Employees emp) {
		int result = 0;
		try {
			conn();
			String sql = "update emp set employee_id = ? where employee_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,  emp.getEmployeeId());
			pstmt.setInt(2,  emp.getEmployeeId());
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//등록
	public int insertEmp(Employees emp) {
		int result = 0;
		try {
			conn();
			String sql = "insert into emp values (?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getEmployeeId());
			pstmt.setString(2, emp.getEmployeeName());
			pstmt.setString(3, emp.getJobId());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	
}
