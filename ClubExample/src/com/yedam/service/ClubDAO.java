package com.yedam.service;

import com.yedam.common.DAO;

public class ClubDAO extends DAO{
	//싱글톤
		private static ClubDAO cDao = new ClubDAO();
		
		private ClubDAO() {
			
		}
		
		public static ClubDAO getInstance() {
			return cDao;
		}
		
		//1. 로그인 기능
		public Club login(String id) {
			Club cb = null;
			try {
				conn();
				String sql ="select *\r\n"
						+ "from club\r\n"
						+ "where club_id = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, id);
				
				rs = pstmt.executeQuery();
				
				if(rs.next()) {
					cb = new Club();
					cb.setClubId(rs.getString("club_id"));
					cb.setClubName(rs.getString("club_name"));
					cb.setJoinDate(rs.getInt("join_date"));
					cb.setClubMail(rs.getString("club_email"));
					cb.setClubAge(rs.getInt("club_age"));
				}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				disconn();
			}
			return cb;
		}
}
