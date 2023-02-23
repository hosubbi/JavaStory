package com.yedam.service;

public class Board {
	
//	BOARD_NUM  NOT NULL NUMBER(2)    
//	BOARD_NAME NOT NULL VARCHAR2(60) 
		
	int boardNum;
	String boardName;
	
	
	public int getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	public String getBoardName() {
		return boardName;
	}
	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}
	

}
