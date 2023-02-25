package com.yedam.service;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class BoardInfoDAO extends DAO{
	BoardService bs = new BoardService();
	
	private static BoardInfoDAO biDao = new BoardInfoDAO();
	
	private BoardInfoDAO() {
		
	}
	
	static BoardInfoDAO getInstance() {
		return biDao;
	}
	
//	String cafeId;
//	String singer;
//	String music;
//	String album;
//	String genre;
//	String musicExplain;
//	String link;
//	String writeDate;
//	String cafeGrade;
//	String accusation; 

	
//----------------------------------------잠시 보류	
//	public BoardInfo getBoardInfo(int num) {
//		BoardInfo bi = null;
//		try {
//			conn();
//			String sql = "select *\r\n"
//					+ "from boardinfo\r\n"
//					+ "where genre = (\r\n"
//					+ "                select board_name\r\n"
//					+ "                from generboard\r\n"
//					+ "                where board_num = ?\r\n"
//					+ "                )";
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, num);
//			
//			rs = pstmt.executeQuery();
//			
//			while(rs.next()) {
//				bi = new BoardInfo();
//				bi.setBoardNum(rs.getInt("board_num"));
//				bi.setCafeId(rs.getString("cafe_id"));
//				bi.setSinger(rs.getString("singer"));
//				bi.setMusic(rs.getString("music"));
//				bi.setAlbum(rs.getString("album"));
//				bi.setGenre(rs.getString("genre"));
//				bi.setMusicExplain(rs.getString("music_explain"));  
//				bi.setLink(rs.getString("link_service"));
//				bi.setWriteDate(rs.getDate("write_date"));
//				bi.setCafeGrade(rs.getString("cafe_grade"));
//				bi.setRecomendNum(rs.getInt("recomend_num"));
//				bi.setAccusation(rs.getInt("accusation"));
//			}
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			disconn();
//		}
//		return bi;
//	
//	}
//----------------------------------------여기까지
	
	public List<BoardInfo> getBoardInfoList(int num){
		List<BoardInfo> list = new ArrayList<>();
		BoardInfo bi = null;
		try {
			conn();
			String sql = "select *\r\n"
					+ "from boardinfo\r\n"
					+ "where genre = (\r\n"
					+ "                select board_name\r\n"
					+ "                from generboard\r\n"
					+ "                where board_num = ?\r\n"
					+ "                )";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				bi = new BoardInfo();
				bi.setBoardNum(rs.getInt("board_num"));
				bi.setCafeId(rs.getString("cafe_id"));
				bi.setSinger(rs.getString("singer"));
				bi.setMusic(rs.getString("music"));
				bi.setAlbum(rs.getString("album"));
				bi.setGenre(rs.getString("genre"));
				bi.setMusicExplain(rs.getString("music_explain"));  
				bi.setLink(rs.getString("link_service"));
				bi.setWriteDate(rs.getDate("write_date"));
				bi.setCafeGrade(rs.getString("cafe_grade"));
				bi.setRecomendNum(rs.getInt("recomend_num"));
				bi.setAccusation(rs.getInt("accusation"));
				list.add(bi);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	public int insertMusic(BoardInfo bi) {
		int result = 0;
		try {
			conn();
			String sql ="Insert into boardinfo (board_num, cafe_id, singer, music, album, genre, music_explain, link_service, cafe_grade)\n"
					+ "values (?, ?, ?, ?, ?, ?, ?, \n"
					+ "?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bi.getBoardNum());
			pstmt.setString(2, bi.getCafeId());
			pstmt.setString(3, bi.getSinger());
			pstmt.setString(4, bi.getMusic());
			pstmt.setString(5, bi.getAlbum());
			pstmt.setString(6, bi.getGenre());
			pstmt.setString(7, bi.getMusicExplain());
			pstmt.setString(8, bi.getLink());
			pstmt.setString(9, bi.getCafeGrade());
			result = pstmt.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
}
