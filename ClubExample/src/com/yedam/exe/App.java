package com.yedam.exe;

import java.util.Scanner;

import com.yedam.service.ClubService;

public class App {
	Scanner sc = new Scanner(System.in);
	
	ClubService cb = new ClubService();
	
	String menu = "";
	boolean run = true;
	
	public App() {
		run();
	}

	private void run() {
		//내정보 조회, 탈퇴, 수정 
		//static -> 로그인, 로그아웃
		String menu = "";
		while(run) {
			//1. 로그인이 되어 있을 때 메뉴
			
			//2. 로그인이 되어 있지 않을때 메뉴창
			if(ClubService.clubInfo != null) { //로그인 되었다.
				//로그인 후 메뉴
				loginMenu();
			}else if(ClubService.clubInfo == null) { //로그인 안되었다.
				//로그인 전 메뉴
				logoutMenu();
			}
	
		}
	}
	
	private void loginMenu() {
		//내정보 조회, 탈퇴, 수정
		System.out.println("==============================================");
		System.out.println("====1. 회원 등록 | 2. 모든 회원 조회 | 3. 회원 조회====");
		System.out.println("========4. 회원 이메일 변경 | 5. 회원 강퇴 ==========");
		System.out.println("==============================================");
		System.out.println("입력>");
		menu = sc.nextLine();
		
		switch (menu) {
		case "1":
			//등록
			break;
		case "2":
			//모든 회원 조회
			break;		
		case "3":
			//회원 조회(아이디로 조회)
			break;
		case "4":
			//이메일 변경
			break;
		case "5":
			//회원 강퇴
			break;
		}
		
	}
	
	private void logoutMenu() {
		System.out.println("1. 로그인 | 2. 종료");
		System.out.println("입력 >");
		menu = sc.nextLine();
		if(menu.equals("1")) {
			cb.login();			
		}else if(menu.equals("2")) {
			run = false;
			System.out.println("프로그램 종료");
		}
		
	}
	
}
