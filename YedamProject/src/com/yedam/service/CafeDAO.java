package com.yedam.service;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class CafeDAO extends DAO{
	private static CafeDAO cDao = new CafeDAO();
	
	private CafeDAO() {
		
	}
	
	public static CafeDAO getInstance() {
		return cDao;
	}
	
	//1. 로그인 기능
	public Cafe login(String id) {
		Cafe cf = null;
		try {
			conn();
			String sql ="SELECT *\r\n"
					+ "FROM cafe\r\n"
					+ "WHERE cafe_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				cf = new Cafe();
				cf.setCafeId(rs.getString("cafe_id"));
				cf.setCafeName(rs.getString("cafe_name"));
				cf.setCafePw(rs.getString("cafe_pw"));
				cf.setCafeEmail(rs.getString("cafe_email"));
				cf.setJoinDate(rs.getDate("cafe_joindate"));
				cf.setCafeGrade(rs.getString("cafe_grade"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return cf;
	}
	
	//2. 회원가입 기능
	public int joinCafe(Cafe cafe) {
		int result = 0;
		try {
			conn();
			String sql ="insert into cafe (cafe_id, cafe_name, cafe_pw, cafe_email)\r\n"
					+ "values (?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cafe.getCafeId());
			pstmt.setString(2, cafe.getCafeName());
			pstmt.setString(3, cafe.getCafePw());
			pstmt.setString(4, cafe.getCafeEmail());
			
			result = pstmt.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//회원가입 중복처리
	public int disticntJoin(Cafe cafe) {
		int result = 0;
		
		try{
			conn();
			String sql = "select cafe_id\r\n"
						  + "from cafe\r\n"
						  + "where cafe_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cafe.getCafeId());
			rs = pstmt.executeQuery(sql);
			result = pstmt.executeUpdate();
			System.out.println(rs);
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}

	
	//관-1. 전체 회원 정보 조회
	public List<Cafe> getCafeList(){
		List<Cafe> list = new ArrayList<>();
		Cafe cafe = null;
		try {
			conn();
			String sql = "select * from cafe";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				cafe = new Cafe();
				cafe.setCafeId(rs.getString("cafe_id"));
				cafe.setCafeName(rs.getString("cafe_name"));
				cafe.setCafePw(rs.getString("cafe_pw"));
				cafe.setCafeEmail(rs.getString("cafe_email"));
				cafe.setJoinDate(rs.getDate("cafe_joindate"));
				cafe.setCafeGrade(rs.getString("cafe_grade"));  
				list.add(cafe);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
	
		return list;
	}
	
	//관-2. 특정 회원 정보 조회
	public Cafe getCafe(String id) {
		Cafe cafe = null;
		try {
			conn();
			String sql = "SELECT *\r\n"
					+ "FROM cafe\r\n"
					+ "WHERE cafe_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				cafe = new Cafe();
				cafe.setCafeId(rs.getString("cafe_id"));
				cafe.setCafeName(rs.getString("cafe_name"));
				cafe.setCafePw(rs.getString("cafe_pw"));
				cafe.setCafeEmail(rs.getString("cafe_email"));
				cafe.setJoinDate(rs.getDate("cafe_joindate"));
				cafe.setCafeGrade(rs.getString("cafe_grade"));  
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return cafe;
	}
	
	//관-3. 회원 등록 메뉴
	public int insertCafe(Cafe cafe) {
		int result = 0;
		try {
			conn();
			String sql ="insert into cafe (cafe_id, cafe_name, cafe_pw, cafe_email, cafe_grade)\r\n"
					+ "values (?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cafe.getCafeId());
			pstmt.setString(2, cafe.getCafeName());
			pstmt.setString(3, cafe.getCafePw());
			pstmt.setString(4, cafe.getCafeEmail());
			pstmt.setString(5, cafe.getCafeGrade());
			
			result = pstmt.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//관-4-1회원 정보 수정 (비밀번호 수정)
	public int modifyCafePw(Cafe cafe) {
		int result = 0;
		try {
			conn();
			String sql = "UPDATE cafe\r\n"
					+ "SET cafe_pw = ?\r\n"
					+ "WHERE cafe_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cafe.getCafePw());
			pstmt.setString(2, cafe.getCafeId());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//관-4-2회원 정보 수정 (이메일 수정)
	public int modifyCafeEmail(Cafe cafe) {
		int result = 0;
		try {
			conn();
			String sql = "UPDATE cafe\r\n"
					+ "SET cafe_email = ?\r\n"
					+ "WHERE cafe_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cafe.getCafeEmail());
			pstmt.setString(2, cafe.getCafeId());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//관-5 회원 강퇴
	public int deleteCafe(String cafeId) {
		int result = 0;
		try {
			conn();
			String sql = "delete from cafe where cafe_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cafeId);
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	

		

}		
