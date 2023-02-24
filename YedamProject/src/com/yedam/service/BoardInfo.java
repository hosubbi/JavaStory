package com.yedam.service;

import java.sql.Date;

public class BoardInfo {
//	CAFE_ID       NOT NULL VARCHAR2(15)  --참조
//	SINGER        NOT NULL VARCHAR2(60)  
//	MUSIC         NOT NULL VARCHAR2(90)  
//	ALBUM                  VARCHAR2(90)  
//	GENRE                  VARCHAR2(30)  
//	MUSIC_EXPLAIN          VARCHAR2(300) 
//	LINK_SERVICE           VARCHAR2(300) 
//	WRITE_DATE             DATE          
//	CAFE_GRADE             VARCHAR2(30)   --참조
//	RECOMEND_NUM           NUMBER(5)     
//	ACCUSATION             NUMBER(3)
	
	String cafeId;
	String singer;
	String music;
	String album;
	String genre;
	String musicExplain;
	String link;
	Date writeDate;
	String cafeGrade;
	int recomendNum;
	int accusation; 
	
	public String getCafeId() {
		return cafeId;
	}
	public void setCafeId(String cafeId) {
		this.cafeId = cafeId;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getMusic() {
		return music;
	}
	public void setMusic(String music) {
		this.music = music;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getMusicExplain() {
		return musicExplain;
	}
	public void setMusicExplain(String musicExplain) {
		this.musicExplain = musicExplain;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	public String getCafeGrade() {
		return cafeGrade;
	}
	public void setCafeGrade(String cafeGrade) {
		this.cafeGrade = cafeGrade;
	}
	public int getRecomendNum() {
		return recomendNum;
	}
	public void setRecomendNum(int recomendNum) {
		this.recomendNum = recomendNum;
	}
	public int getAccusation() {
		return accusation;
	}
	public void setAccusation(int accusation) {
		this.accusation = accusation;
	}
	
	

}
