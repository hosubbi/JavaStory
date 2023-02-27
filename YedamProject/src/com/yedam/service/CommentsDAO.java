package com.yedam.service;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class CommentsDAO extends DAO{
	private static CommentsDAO cmdao = new CommentsDAO();
	
	private CommentsDAO() {
		
	}
	
	public static CommentsDAO getInstance() {
		return cmdao;
	}
	
	//댓글 리스트
	public List<Comments> getCommentsList(String inputGenre){
		List<Comments> list = new ArrayList<>();
		Comments ct = null;
		try {
			conn();
			String sql = "select *\r\n"
					+ "from comments\r\n"
					+ "where comments_genre = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, inputGenre);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ct = new Comments();
				
				ct.setBoardNum(rs.getInt("board_num"));
				ct.setComentsNum(rs.getInt("comments_num"));
				ct.setCafeId(rs.getString("cafe_id"));
				ct.setCommentsGenre(rs.getString("comments_genre"));
				ct.setComments(rs.getString("comments"));
				ct.setCommentsDate(rs.getDate("comments_date"));
			
				list.add(ct);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
}
