package com.yedam.service;

import java.util.List;
import java.util.Scanner;

import com.yedam.exe.App;

public class BoardService {
	//1. 게시판 만들기
	BoardInfoService bi = new BoardInfoService();
	public static int enterBoardNum = 0;
	
	Scanner sc = new Scanner(System.in);
	
	//게시판 생성
	public void insertBoard() {
		System.out.println("====================게시판 생성====================");
		System.out.println("게시판 번호 >");
		int boardNum = Integer.parseInt(sc.nextLine());
			
		System.out.println("게시판 이름 >");
		String boardName = sc.nextLine();

		Board board = new Board();
			
		board.setBoardNum(boardNum);
		board.setBoardName(boardName);
			
		int result = BoardDAO.getInstance().insertBoard(board);
			
		if(result > 0) {
			System.out.println("게시판 등록 완료");
		} else {
			System.out.println("게시판 등록 실패");
		}
	}
	
	//2. 게시판 명 수정
	public void modifyBoardName() {		
		Board bd = new Board();
		System.out.println("이름 변경 할 게시판 번호 >");
		bd.setBoardNum(Integer.parseInt(sc.nextLine()));
		System.out.println("변경할 이름을 입력하세요 >");
		bd.setBoardName(sc.nextLine());
		
		int result = BoardDAO.getInstance().modifyBoardName(bd);
		
		if(result > 0) {
			System.out.println("게시판 이름 수정 완료");
		}else {
			System.out.println("게시판 이름 수정 실패");
		}
	}
	
	//3. 게시판 삭제
	public void deleteBoard() {
		System.out.println("게시판 번호 > ");
		int result = BoardDAO.getInstance().deleteBoard(sc.nextLine());
		
		//자신의 ID를 넣었다.
		//로그인 되어 있는 상태에서 회원 탈퇴 -> 로그아웃.
		if(result > 0) {
			System.out.println("게시판 삭제 완료");
		} else {
			System.out.println("게시판 삭제 실패");
		}
	}
	
	//4. 게시판 리스트
	public void enterBoard() {
//		App ap = new App();
		List<Board> list = BoardDAO.getInstance().enterBoard();
		System.out.println("=========================================================================");
		for(int i=0; i<list.size(); i++) {
			System.out.print("==================" + list.get(i).getBoardNum() + "☞☞☞☞☞☞☞☞☞☞☞");
			System.out.println(list.get(i).getBoardName());
		}
		System.out.println("=========================================================================");
		System.out.print("입장할 게시판 번호를 입력하시오 > ");
		enterBoardNum = Integer.parseInt(sc.nextLine());
		
		
		if(enterBoardNum == 1) {
			System.out.println(list.get(enterBoardNum-1).getBoardName() + "에 입장합니다");
			connKMusic();
		}else if (enterBoardNum == 2){
			System.out.println(list.get(enterBoardNum-1).getBoardName() + "에 입장합니다");
			connFMusic();
		}else {
			System.out.println("게시판이 없습니다.");
			enterBoard();
		}
		
	}
	
	//5. 국내 음악 추천 게시판 리스트
	public void connKMusic() {
		System.out.println("☆★☆★☆★☆★☆★☆★☆★국내 음악 추천 게시판입니다★☆★☆★☆★☆★☆★☆★☆★☆");
		System.out.println("=========1. 발라드 | 2. 댄스 | 3. 랩/힙합 | 4. R&B========");
		System.out.println("=====5. 인디 음악 | 6. 록/메탈 | 7. 트로트 | 8. 기타장르======");
		System.out.println("======================9. 이전 화면======================");
		bi.getBoardInfoList();
	}
	
	public void connFMusic() {
		System.out.println("☆★☆★☆★☆★☆★☆★☆★해외 음악 추천 게시판입니다★☆★☆★☆★☆★☆★☆★☆★☆");
		System.out.println("==========1. 해외 음악 추천 리스트 | 2. 이전 화면============");
		System.out.println("입력 >");
		enterBoardNum = Integer.parseInt(sc.nextLine());
		switch (enterBoardNum) {
		case 1:
		//1번 게시판 접속
			
			break;
		case 2:
		//2번 게시판 접속
			enterBoard();
			break;
		}
	}
	
}
