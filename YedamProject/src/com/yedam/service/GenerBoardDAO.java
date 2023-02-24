package com.yedam.service;

import com.yedam.common.DAO;

public class GenerBoardDAO extends DAO{
	private static GenerBoardDAO gDao = new GenerBoardDAO();
	
	private GenerBoardDAO() {
		
	}
	
	static GenerBoardDAO getInstance() {
		return gDao;
	}
	
	//게시판 만들기
	public int insertGBoard(GenerBoard gb) {
		int result = 0;
		try {
			conn();
			String sql ="insert into generboard \r\n"
					+ "values (?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, gb.getBoardNum());
			pstmt.setString(2, gb.getBoardName());
			
			result = pstmt.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
}
