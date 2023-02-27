package com.yedam.service;

import com.yedam.common.DAO;

//회원 서비스 정보


public class MemDAO extends DAO{
	private static MemDAO mDao = new MemDAO();
		
		private MemDAO() {
			
		}
		
		public static MemDAO getInstance() {
			return mDao;
		}
		//본인 정보 조회
		public Cafe getMem(String id) {
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
		
		
		
		//본인 비밀번호 수정
		public int modifyMemPw(Cafe member) {
			int result = 0;
			try {
				conn();
				String sql = "UPDATE cafe\r\n"
						+ "SET cafe_pw = ?\r\n"
						+ "WHERE cafe_id = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, member.getCafePw());
				pstmt.setString(2, member.getCafeId());
				
				result = pstmt.executeUpdate();
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				disconn();
			}
			return result;
		}
		
		//본인 이메일 수정
		public int modifyMemEmail(Cafe member) {
			int result = 0;
			try {
				conn();
				String sql = "UPDATE cafe\r\n"
						+ "SET cafe_email = ?\r\n"
						+ "WHERE cafe_id = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, member.getCafeEmail());
				pstmt.setString(2, member.getCafeId());
				
				result = pstmt.executeUpdate();
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				disconn();
			}
			return result;
		}
		
		//본인 계정 탈퇴
		public int deleteMemOut(Cafe member) {
			int result = 0;
			try {
				conn();
				String sql = "delete from cafe where cafe_id = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, member.getCafeId());
				result = pstmt.executeUpdate();
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				disconn();
			}
			return result;
		} 
		
}
