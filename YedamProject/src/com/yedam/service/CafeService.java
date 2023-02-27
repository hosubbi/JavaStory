package com.yedam.service;

import java.util.List;
import java.util.Scanner;


public class CafeService {
	
	public static Cafe cafeInfo = null;
	public static String grade = null;
	Scanner sc = new Scanner(System.in);
	//1 로그인 메뉴
	public void login() {  
		Cafe cafe = null;
		
		System.out.println("아이디를 입력하세요 >");
		String cafeId = sc.nextLine();
		System.out.println("비밀번호를 입력하세요 >");
		String cafePw = sc.nextLine();
		
		cafe = CafeDAO.getInstance().login(cafeId);
		
		
		
		if(cafe != null) { //데이터가 조회 되었다.
			if(cafe.getCafeId().equals("king")  && cafe.getCafePw().equals(cafePw)) {
				System.out.println(cafe.getCafeId() + "님은 관리자입니다.");
				System.out.println("관리자 로그인 성공✔");
				cafeInfo = cafe;
				grade = "host";
			}else if(cafe.getCafePw().equals(cafePw)){
				System.out.println(cafe.getCafeId() + "님은 회원입니다");
				System.out.println("회원 로그인 성공✔");
				cafeInfo = cafe;
				grade = "member";
			}
			else {
				System.out.println("비밀번호가 틀립니다.");
			}
		} else {
			System.out.println("해당 아이디는 존재하지 않습니다.");
		}
	}
		
	//2 회원가입 메뉴	
	public void joinCafe() {
		

		System.out.println("====================회원 가입====================");
		System.out.println("회원 아이디>");
		String cafeId = sc.nextLine();
				
		System.out.println("회원 이름>");
		String cafeName = sc.nextLine();
				
		System.out.println("회원 비밀번호>");
		String cafePw = sc.nextLine();
				
		System.out.println("회원 이메일>");
		String cafeEmail = sc.nextLine();
			
		Cafe cafe = new Cafe();
				
		cafe.setCafeId(cafeId);
		cafe.setCafeName(cafeName);
		cafe.setCafePw(cafePw);
		cafe.setCafeEmail(cafeEmail);
				
				
		int result = CafeDAO.getInstance().joinCafe(cafe);
				
		if(result > 0) {
			System.out.println("회원 가입 완료");
		}else {			
			System.out.println("회원 가입 실패");
		}
				
	}		

	//관-1 전체 회원 정보 조회
	public void getCafeList() {
		List<Cafe> list = CafeDAO.getInstance().getCafeList();
		System.out.println("=====================================");
		for(int i=0; i<list.size(); i++) {
			System.out.println("ID : " + list.get(i).getCafeId());
			System.out.println("이름 : " + list.get(i).getCafeName());
			System.out.println("비밀번호 : " + list.get(i).getCafePw());
			System.out.println("이메일 : " + list.get(i).getCafeEmail());
			System.out.println("가입날짜 : " + list.get(i).getJoinDate());
			System.out.println("카페등급 : " + list.get(i).getCafeGrade());
			System.out.println("=====================================");
		}
	}
	
	//관-2 회원 정보 조회
	public void getCafe() {
		System.out.println("회원ID 입력 >");
		Cafe cafe = CafeDAO.getInstance().getCafe(sc.nextLine());
		if(cafe == null) {
			System.out.println("조회된 결과 없음.");
		} else {
			System.out.println("회원 번호    : " + cafe.getCafeId());
			System.out.println("회원 이름    : " + cafe.getCafeName());
			System.out.println("회원 비밀번호 : " + cafe.getCafePw());
			System.out.println("회원 이메일   : " + cafe.getCafeEmail());
			System.out.println("회원 가입일   : " + cafe.getJoinDate());
			System.out.println("회원 등급    : " + cafe.getCafeGrade());
		}
		System.out.println("==================================");
	}
	
	//관-3. 회원등록 메뉴	
	public void insertCafe() {
		System.out.println("====================회원 등록====================");
		System.out.println("회원 아이디>");
		String cafeId = sc.nextLine();
			
		System.out.println("회원 이름>");
		String cafeName = sc.nextLine();
			
		System.out.println("회원 비밀번호>");
		String cafePw = sc.nextLine();
			
		System.out.println("회원 이메일>");
		String cafeEmail = sc.nextLine();

		Cafe cafe = new Cafe();
			
		cafe.setCafeId(cafeId);
		cafe.setCafeName(cafeName);
		cafe.setCafePw(cafePw);
		cafe.setCafeEmail(cafeEmail);
			
		int result = CafeDAO.getInstance().joinCafe(cafe);
			
		if(result > 0) {
			System.out.println("회원 등록 완료");
		} else {
			System.out.println("회원 등록 실패");
		}
	}
	
	//관-4. 회원 정보 수정
	public void modifyCafe() {		
		System.out.println("====================================================");
		System.out.println("==========1.회원 비밀번호 수정 | 2. 회원 이메일 수정==========");
		System.out.println("====================================================");
		System.out.println("입력 >");
		int menu = Integer.parseInt(sc.nextLine());
		switch(menu){
		case 1:
			modifyCafePw();
			break;
		case 2:
			modifyCafeEmail();
			break;
		}
	}
	
	//관-4-1. 회원 정보 수정 (비밀번호 수정)
	public void modifyCafePw() {		
		Cafe cafe = new Cafe();
		System.out.println("비밀번호 변경 할 회원ID >");
		cafe.setCafeId(sc.nextLine());
		System.out.println("변경할 비밀번호를 입력하세요 >");
		cafe.setCafePw(sc.nextLine());
		
		int result = CafeDAO.getInstance().modifyCafePw(cafe);
		
		if(result > 0) {
			System.out.println("비밀번호 수정 완료");
		}else {
			System.out.println("비밀번호 수정 실패");
		}
	}
	
	//관-4-2. 회원 이메일 수정 (비밀번호 수정)
	public void modifyCafeEmail() {
		Cafe cafe = new Cafe();
		System.out.println("이메일 변경 할 회원ID >");
		cafe.setCafeId(sc.nextLine());
		System.out.println("변경할 이메일을 입력하세요 >");
		cafe.setCafeEmail(sc.nextLine());
		
		int result = CafeDAO.getInstance().modifyCafeEmail(cafe);
		
		if(result > 0) {
			System.out.println("이메일 수정 완료");
		}else {
			System.out.println("이메일 수정 실패");
		}	
	}
	
	//관-5  회원 강퇴
	public void deleteCafe() {
		System.out.println("회원 ID >");
		int result = CafeDAO.getInstance().deleteCafe(sc.nextLine());
		
		//자신의 ID를 넣었다.
		//로그인 되어 있는 상태에서 회원 탈퇴 -> 로그아웃.
		if(result > 0) {
		//  CafeService.cafeInfo = null; --자신의 아이디 로그아웃 할 때
			System.out.println("회원 ID 삭제 완료");
		} else {
			System.out.println("회원 ID 삭제 실패");
		}
	}
	

}
