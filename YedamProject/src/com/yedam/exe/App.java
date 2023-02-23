package com.yedam.exe;

import java.util.Scanner;

import com.yedam.service.BoardService;
import com.yedam.service.CafeService;
import com.yedam.service.MemService;


public class App {
	
	CafeService cf = new CafeService();
	MemService ms = new MemService();
	BoardService bd = new BoardService();
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
	

	//관리자 로그인 메뉴
	private void loginMenu() {
	//회원정보 등록, 조회, 수정, 삭제,
		System.out.println("====================================================");
		System.out.println("=======1. 모든 회원 조회 | 2. 회원 조회 | 3. 회원 등록 ======");
		System.out.println("=======4. 회원 정보 수정 | 5. 회원 강퇴 | 6. 게시판 메뉴======");
		System.out.println("=======================7. 종    료===================");
		System.out.println("====================================================");
		System.out.println("입력 >");
		menu = sc.nextLine();
		while(run) {
			switch (menu) {
			case "1":
			//모든 회원 조회
				cf.getCafeList();
				loginMenu();
				break;
			case "2":
			//특정 회원 조회
				cf.getCafe();
				loginMenu();
				break;		
			case "3":
			//회원 등록
				cf.insertCafe();
				loginMenu();
				break;
			case "4":
			//회원 정보 수정
				cf.modifyCafe();
				loginMenu();
				break;
			case "5":
			//회원 강퇴
				cf.deleteCafe();
				loginMenu();
				break;
			case "6":
			//게시판 접속
				BoardMenu();
				break;				
			case "7":
				System.out.println("종료합니다.");
				run = false;
				break;
			}
		}
	
	}
	
	//회원으로 로그인 했을 때의 메뉴
	private void memloginMenu() {
		System.out.println("==================================================");
		System.out.println("===1. 비밀번호 수정 2. 이메일 수정  3. 게시판 이동  4. 탈퇴===");
		System.out.println("==================================================");
		System.out.println("입력>");
		menu = sc.nextLine();
		switch (menu) {
		case "1":
		//비밀번호 수정
			ms.modifyMemPw();
			break;
		case "2":
		//이메일 수정
			ms.modifyMemEmail();
			break;		
		case "3":
		//게시판 들어가기
			
			break;
		case "4":
		//탈퇴
			break;
		}
	}
	
	//로그인 안되어있을 때 메뉴
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
	//관리자 게시판 메뉴 접속 
	//1. 게시판 만들기 2. 게시판 명 수정 3. 게시판 삭제 4.번호에 맞는 게시판으로 이동, 5.돌아가기
	private void BoardMenu() {
		System.out.println("====================================================================");
		System.out.println("1. 게시판 생성 | 2. 게시판 명 수정 | 3. 게시판 삭제 | 4. 게시판 리스트 | 5. 이전 화면");
		System.out.println("====================================================================");
		menu = sc.nextLine();
		switch(menu){
		case "1":
			//게시판 생성
			bd.insertBoard();
			BoardMenu();
			break;
			
		case "2":
			//게시판 명 수정
			bd.modifyBoardName();
			BoardMenu();
			break;
		case "3":
			//게시판 삭제
			bd.deleteBoard();
			BoardMenu();
			break;
		case "4":
			//게시판 리스트
			bd.enterBoard();
			break;
		case "5":
			//이전 화면
			loginMenu();
			break;
		}
	}
	
	
	
	
	
	
	//국내 음악 추천 게시판 접속(공통)
	private void connBoard() {
		System.out.println("☆★☆★☆★☆★☆★☆★☆★국내 음악 추천 게시판입니다★☆★☆★☆★☆★☆★☆★☆★☆");
		System.out.println("=======1. 발라드 | 2. 댄스 | 3. 랩/힙합 | 4. R&B=======");
		System.out.println("====5. 인디 음악 | 6. 록/메탈 | 7. 트로트 | 8. 그 외...===");
		System.out.println("==================================================");
		System.out.println("입력 >");
		menu = sc.nextLine();
		switch (menu) {
		case "1":
		//1번 게시판 접속
			break;
		case "2":
		//2번 게시판 접속
			break;		
		case "3":
		//3번 게시판 접속
			break;
		case "4":
		//4번 게시판 접속
			break;
		case "5":
		//4번 게시판 접속
			break;
		case "6":
		//6번 게시판 접속
			break;
		case "7":
		//7번 게시판 접속
			break;
		case "8":
		//8번 게시판 접속
			break;
		}
	}

}
