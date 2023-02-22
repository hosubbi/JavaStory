package com.yedam.exe;

import java.util.Scanner;

import com.yedam.service.CafeService;


public class App {
	
	CafeService cf = new CafeService();
	Scanner sc = new Scanner(System.in);
	
	String menu = "";
	boolean run = true;
	
	public App() {
		run();
	}

	private void run() {
		String menu = "";
		while(run) {
			if(CafeService.cafeInfo != null) { //로그인 되었다.
				//로그인 후 메뉴
				if(CafeService.grade == "host") {
					loginMenu();
				}else {
					memloginMenu();
				}
				
			}else if(CafeService.cafeInfo == null) { //로그인 안되었다.
				//로그인 전 메뉴
				logoutMenu();
			}
		}
				
	}
	


	private void loginMenu() {
		//회원정보 등록, 조회, 수정, 삭제,
			System.out.println("====================================================");
			System.out.println("=======1. 모든 회원 조회 | 2. 회원 조회 | 3. 회원 등록 ======");
			System.out.println("=======4. 회원 정보 수정 | 5. 회원 강퇴 | 6. 게시판 접속======");
			System.out.println("=======================7. 종    료===================");
			System.out.println("====================================================");
			System.out.println("입력 >");
			menu = sc.nextLine();
			while(run) {
				switch (menu) {
				case "1":
				//모든 회원 조회
					cf.getCafeList();
					break;
				case "2":
				//특정 회원 조회
					cf.getCafe();
					break;		
				case "3":
				//회원 등록
					cf.insertCafe();
					break;
				case "4":
				//회원 정보 수정
					cf.modifyCafe();
					break;
				case "5":
				//회원 강퇴
					break;
				case "6":
				//게시판 접속
					break;				
				case "7":
					System.out.println("종료합니다.");
					run = false;
					break;
				}
			}
		
	}
	
	private void memloginMenu() {
		System.out.println("==================================================");
		System.out.println("===1. 비밀번호 수정 2. 이메일 수정  3. 게시판 이동  4. 탈퇴===");
		System.out.println("==================================================");
		System.out.println("입력>");
		menu = sc.nextLine();
			
		switch (menu) {
		case "1":
		//비밀번호 수정
		//ms.getMember();
			break;
		case "2":
		//이메일 수정
			break;		
		case "3":
		//게시판 들어가기
			break;
		case "4":
		//탈퇴
			break;
		}
	}

	private void logoutMenu() {
		System.out.println("1. 로그인 | 2. 회원가입 | 3. 종료");
		System.out.println("입력 >");
		menu = sc.nextLine();
		if(menu.equals("1")) {
			cf.login();			
		}else if(menu.equals("2")) {
			cf.joinCafe();
		}else if(menu.equals("3")) {
			run = false;
			System.out.println("프로그램 종료");
		}
	}

}
