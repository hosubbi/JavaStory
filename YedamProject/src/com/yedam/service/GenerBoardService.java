package com.yedam.service;

import java.util.Scanner;

public class GenerBoardService {
	Scanner sc = new Scanner(System.in);
	public void insertGBoard() {
		System.out.println("====================게시판 생성====================");
		System.out.println("게시판 번호 >");
		int gboardNum = Integer.parseInt(sc.nextLine());
			
		System.out.println("게시판 이름 >");
		String gboardName = sc.nextLine();

		GenerBoard board = new GenerBoard();
			
		board.setBoardNum(gboardNum);
		board.setBoardName(gboardName);
			
		int result = GenerBoardDAO.getInstance().insertGBoard(board);
			
		if(result > 0) {
			System.out.println("게시판 등록 완료");
		} else {
			System.out.println("게시판 등록 실패");
		}
	}
}
