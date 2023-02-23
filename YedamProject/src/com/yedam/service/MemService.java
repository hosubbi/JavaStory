package com.yedam.service;

import java.util.Scanner;

//회원 서비스


public class MemService {
	Scanner sc = new Scanner(System.in);
	
	//회원 본인 비밀번호 변경
	public void modifyMemPw() {	
		Cafe member = new Cafe();
		System.out.println("회원님의 ID는 "+ CafeService.cafeInfo.getCafeId() + " 입니다.");
		member.setCafeId(CafeService.cafeInfo.getCafeId());
		System.out.println("바꿀 비밀번호 입력 >");
		member.setCafePw(sc.nextLine());
		
		int result = MemDAO.getInstance().modifyMemPw(member);
		
		if(result > 0) {
			System.out.println("비밀번호 수정 완료");
		}else {
			System.out.println("비밀번호 수정 실패");
		}
	}
	
	//회원 본인 이메일 변경
	public void modifyMemEmail() {	
		Cafe member = new Cafe();
		System.out.println("회원님의 ID는 "+ CafeService.cafeInfo.getCafeId() + " 입니다.");
		member.setCafeId(CafeService.cafeInfo.getCafeId());
		System.out.println("바꿀 이메일 입력 >");
		member.setCafeEmail(sc.nextLine());
		
		int result = MemDAO.getInstance().modifyMemEmail(member);
		
		if(result > 0) {
			System.out.println("이메일 수정 완료");
		}else {
			System.out.println("이메일 수정 실패");
		}
	}
}
