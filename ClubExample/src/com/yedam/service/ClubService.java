package com.yedam.service;

import java.util.Scanner;

public class ClubService {
	public static Club clubInfo = null;
	
	Scanner sc = new Scanner(System.in);
	
	//1.로그인
	public void login() {
		Club club = null;
		System.out.println("아이디를 입력하시오 >");
		String clubId = sc.nextLine();
		
		club = ClubDAO.getInstance().login(clubId);
		
		//id를 통해 조회가 되지 않았다. -> 회원의 정보가 없다.
		//따라서, login 실패
		//clubInfo에는 null이 유지
		
		if(club != null) { //관리자로 로그인을 했다
			if(club.getClubId() == "king") {
				System.out.println("정상 로그인 되었습니다.");
				System.out.println("관리자 " + club.getClubId() + " 계정으로 접속하였습니다✔");
				clubInfo = club;
			}else {
				System.out.println("관리자 아이디를 입력해주세요.");
			}
		} else{
			System.out.println("해당 아이디는 존재하지 않습니다.");
		}
		
	}
	
	//회원 등록
}
