package com.yedam.service;

import java.sql.Date;

public class Comments {
//	BOARD_NUM         NUMBER(5) 
// 	MUSIC             VARCHAR2(90)
//	CAFE_ID           VARCHAR2(15)  
//	COMMENTS_GENRE    VARCHAR2(30)  
//	COMMENTS          VARCHAR2(600) 
//	COMMENTS_DATE     DATE
	
	private int boardNum;
	private int commentsNum;
	private String music;
	private String cafeId;
	private String commentsGenre;
	private String comments;
	private Date commentsDate;
	
	
	public int getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	public int getCommentsNum() {
		return commentsNum;
	}
	public void setCommentsNum(int commentsNum) {
		this.commentsNum = commentsNum;
	}
	public String getMusic() {
		return music;
	}
	public void setMusic(String music) {
		this.music = music;
	}
	public String getCafeId() {
		return cafeId;
	}
	public void setCafeId(String cafeId) {
		this.cafeId = cafeId;
	}
	public String getCommentsGenre() {
		return commentsGenre;
	}
	public void setCommentsGenre(String commentsGenre) {
		this.commentsGenre = commentsGenre;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Date getCommentsDate() {
		return commentsDate;
	}
	public void setCommentsDate(Date commentsDate) {
		this.commentsDate = commentsDate;
	}

}
