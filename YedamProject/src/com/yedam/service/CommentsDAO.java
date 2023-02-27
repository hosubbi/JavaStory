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
	public List<Comments> getCommentsList(int num, String inputGenre){
		List<Comments> list = new ArrayList<>();
		Comments ct = null;
		try {
			conn();
			String sql = "select *\n"
					+ "from comments\n"
					+ "where board_num = ?\n"
					+ "and comments_genre = ?\n"
					+ "order by comments_num";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.setString(2, inputGenre);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ct = new Comments();
				
				ct.setBoardNum(rs.getInt("board_num"));
				ct.setCommentsNum(rs.getInt("comments_num"));
				ct.setMusic(rs.getString("music"));
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
	
	//댓글 달기
	public int insertComments(Comments cm) {
		int result = 0;
		try {
			conn();
			String sql ="insert into comments(board_num, comments_num, music, cafe_id, comments_genre, comments)\n"
					+ "values (1, (select count(*)+1 from comments where board_num = ? and comments_genre = ?),\n"
					+ "(select music from boardinfo where board_num = ? and genre = ?), ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, cm.getBoardNum());
			pstmt.setString(2, cm.getCommentsGenre());
			pstmt.setInt(3, cm.getBoardNum());
			pstmt.setString(4, cm.getCommentsGenre());
			pstmt.setString(5, cm.getCafeId());
			pstmt.setString(6, cm.getCommentsGenre());
			pstmt.setString(7, cm.getComments());
			result = pstmt.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//나의 게시글 리스트
	public List<Comments> myCommentList(int board, String id, String genre){
		List<Comments> list = new ArrayList<>();
		Comments cm = null;		
		try {
			conn();
			String sql = "select *\n"
					+ "from comments\n"
					+ "where board_num = ?\n"
					+ "and cafe_id = ?\n"
					+ "and comments_genre = ?\n"
					+ "order by comments_num";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, board);
			pstmt.setString(2, id);
			pstmt.setString(3, genre);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				cm = new Comments();
				cm.setBoardNum(rs.getInt("board_num"));
				cm.setCommentsNum(rs.getInt("comments_num"));
				cm.setMusic(rs.getString("music"));
				cm.setCafeId(rs.getString("cafe_id"));
				cm.setCommentsGenre(rs.getString("comments_genre"));
				cm.setComments(rs.getString("comments"));
				cm.setCommentsDate(rs.getDate("comments_date"));			
				list.add(cm);
			}									
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	//나의 댓글 수정
	
	//나의 댓글 삭제 + 업데이트 (넘버)
	
}
