package com.yedam.service;

import java.util.Scanner;

import com.yedam.common.DAO;

public class ClubDAO extends DAO{
	//싱글톤
		private static ClubDAO cDao = new ClubDAO();
		Scanner sc = new Scanner(System.in);
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
				String sql = "select * from club where club_id = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, id);
				
				rs = pstmt.executeQuery();
				
				if(rs.next()) {
					cb = new Club();
					cb.setClubId(rs.getString("club_id"));
					cb.setClubName(rs.getString("club_name"));
					cb.setJoinDate(rs.getDate("join_date"));
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
		
		//회원 등록
		public int insertClub() {
			int cb = (Integer) null;
			try {
				conn();
				String sql = "INSERT INTO club\n"
							 + "VALUES (?, ?, ?, ?, ?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, ClubService.clubInfo.getClubId());
				pstmt.setString(2, ClubService.clubInfo.getClubName());
				pstmt.setDate(3, ClubService.clubInfo.getJoinDate());
				pstmt.setString(4, ClubService.clubInfo.getClubMail());
				pstmt.setInt(5, ClubService.clubInfo.getClubAge());
				
				cb = pstmt.executeUpdate();
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				disconn();
			}
			return cb;
		}
		
		
		//모든 회원 정보 조회 (가입 날짜 순서대로 조회);
		public Club getClub() {
			Club club = null;
			try {
				conn();
				String sql = "select *\n"
						+ "from club\n"
						+ "where club_id = ?\n"
						+ "order by join_date DESC";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, ClubService.clubInfo.getClubId());
				
				rs = pstmt.executeQuery();
				
				if(rs.next()) {
					club = new Club();
					club.setClubId(rs.getString("club_id"));
					club.setClubName(rs.getString("club_name"));
					club.setJoinDate(rs.getDate("join_date"));
					club.setClubMail(rs.getString("club_mail"));
					club.setClubAge(rs.getInt("club_age"));
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				disconn();
			}
			return club;
		}
}
