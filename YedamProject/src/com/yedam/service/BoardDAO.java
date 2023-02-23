package com.yedam.service;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class BoardDAO extends DAO{
	private static BoardDAO bDao = new BoardDAO();
	
	private BoardDAO() {
		
	}
	
	static BoardDAO getInstance() {
		return bDao;
	}
	
	//1. 게시판 만들기
	public int insertBoard(Board bd) {
		int result = 0;
		try {
			conn();
			String sql ="insert into board \r\n"
					+ "values (?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bd.getBoardNum());
			pstmt.setString(2, bd.getBoardName());
			
			result = pstmt.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//2. 게시판 이름 수정
	public int modifyBoardName(Board bd) {
		int result = 0;
		try {
			conn();
			String sql = "UPDATE board\r\n"
					+ "SET board_name = ?\r\n"
					+ "WHERE board_num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bd.getBoardName());
			pstmt.setInt(2, bd.getBoardNum());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//3. 게시판 삭제
	public int deleteBoard(String bd) {
		int result = 0;
		try {
			conn();
			String sql = "delete from board where board_num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bd);
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//4. 게시판 리스트
	public List<Board> enterBoard(){
		List<Board> list = new ArrayList<>();
		Board bd = null;
		try {
			conn();
			String sql = "select * from board order by board_num";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				bd = new Board();
				bd.setBoardNum(rs.getInt("board_num"));
				bd.setBoardName(rs.getString("board_name"));
				list.add(bd);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
	
		return list;
	}
}
