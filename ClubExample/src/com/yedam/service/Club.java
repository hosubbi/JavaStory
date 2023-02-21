package com.yedam.service;

public class Club {
//	CLUB_ID   NOT NULL VARCHAR2(30) 
//	CLUB_NAME NOT NULL VARCHAR2(12) 
//	JOIN_DATE          DATE         
//	CLUB_MAIL          VARCHAR2(40) 
//	CLUB_AGE           NUMBER(2) 
	
	private String clubId;
	private String clubName;
	private int joinDate;
	private String clubMail;
	private int clubAge;
	public String getClubId() {
		return clubId;
	}
	public void setClubId(String clubId) {
		this.clubId = clubId;
	}
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	public int getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(int joinDate) {
		this.joinDate = joinDate;
	}
	public String getClubMail() {
		return clubMail;
	}
	public void setClubMail(String clubMail) {
		this.clubMail = clubMail;
	}
	public int getClubAge() {
		return clubAge;
	}
	public void setClubAge(int clubAge) {
		this.clubAge = clubAge;
	}
	
	
	
}
