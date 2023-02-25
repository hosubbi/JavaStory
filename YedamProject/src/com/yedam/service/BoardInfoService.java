package com.yedam.service;

import java.util.List;
import java.util.Scanner;


public class BoardInfoService {
	Scanner sc = new Scanner(System.in);
	boolean run = true;
	int enterGenre = 0;
	String gener = null;
//	public void getBoardInfoList() {
//		
//		List<BoardInfo> list = BoardInfoDAO.getInstance().getBoardInfoList();
//		System.out.println("=======================================================================");
//		for(int i=0; i<list.size(); i++) {
//			System.out.print("◎ID : " + list.get(i).getCafeId() + " ");
//			System.out.print("◎가수 : " + list.get(i).getSinger() + " ");
//			System.out.print("◎노래 제목 : " + list.get(i).getMusic() + " ");
//			System.out.print("◎앨범 제목 : " + list.get(i).getAlbum() + " ");
//			System.out.println("◎장르 : " + list.get(i).getGenre() + " ");
//			System.out.println("◎추천 이유 : " + list.get(i).getMusicExplain() + " ");
//			System.out.println("◎링크 : " + list.get(i).getLink() + " ");
//			System.out.print("◎작성일 : " + list.get(i).getWriteDate() + " ");
//			System.out.print("◎카페 등급 : " + list.get(i).getCafeGrade() + " ");
//			System.out.print("◎추천수 : " + list.get(i).getRecomendNum() + " ");
//			System.out.println("◎신고수 : " + list.get(i).getAccusation() + " ");
//			System.out.println("=======================================================================");
//		}
	
//	}
	
//----------------------------------------잠시 보류
//	public void getBoardInfo() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("게시판 번호 입력 >");
//		BoardInfo bi = BoardInfoDAO.getInstance().getBoardInfo(Integer.parseInt(sc.nextLine()));
//		//반복문 주기
//		if(bi == null) {
//			System.out.println("조회된 결과 없음.");
//		} else {
//			System.out.print("◎ no : " + bi.getBoardNum() + " ");
//			System.out.print("◎ ID : " + bi.getCafeId() + " ");
//			System.out.print("◎ 가수 이름 : " + bi.getSinger() + " ");
//			System.out.print("◎ 노래 제목 : " + bi.getMusic() + " ");
//			System.out.print("◎ 앨범 제목 : " + bi.getAlbum() + " ");
//			System.out.println("◎ 장르 : " + bi.getGenre() + " ");
//			System.out.println("◎ 추천 이유 : " + bi.getMusicExplain() + " ");
//			System.out.println("◎ 링크 : " + bi.getLink() + " ");
//			System.out.print("◎ 작성일 : " + bi.getWriteDate() + " ");
//			System.out.print("◎ 카페 등급 : " + bi.getCafeGrade() + " ");
//			System.out.print("◎ 추천수 : " + bi.getRecomendNum() + " ");
//			System.out.println("◎ 신고수 : " + bi.getAccusation() + " ");
//		}
//		System.out.println("====================================================");
//	}
//-------------------------------------------여기까지
	
	//장르별 게시판 입장 후 게시판에 대한 메뉴 들어가기
	public void getBoardInfoList() {
		System.out.println("입장할 게시판 번호를 입력하시오 >");
		enterGenre = Integer.parseInt(sc.nextLine());
		List<BoardInfo> list = BoardInfoDAO.getInstance().getBoardInfoList(enterGenre);
		System.out.println("=========================================================================");
//		System.out.println("========================" + list.get(enterGenre-1).getGenre() +" 추천 게시판 입니다================================");
		for(int i=0; i<list.size(); i++) {
			System.out.println("◎No : " + list.get(i).getBoardNum() + " ");
			System.out.print("◎ID : " + list.get(i).getCafeId() + " ");
			System.out.print("◎가수 : " + list.get(i).getSinger() + " ");
			System.out.print("◎노래 제목 : " + list.get(i).getMusic() + " ");
			System.out.print("◎앨범 제목 : " + list.get(i).getAlbum() + " ");
			System.out.println("◎장르 : " + list.get(i).getGenre() + " ");
			System.out.println("◎추천 이유 : " + list.get(i).getMusicExplain() + " ");
			System.out.println("◎링크 : " + list.get(i).getLink() + " ");
			System.out.print("◎작성일 : " + list.get(i).getWriteDate() + " ");
			System.out.print("◎카페 등급 : " + list.get(i).getCafeGrade() + " ");
			System.out.print("◎추천수 : " + list.get(i).getRecomendNum() + " ");
			System.out.println("◎신고수 : " + list.get(i).getAccusation() + " ");
			gener = list.get(i).getGenre();
			System.out.println("=========================================================================");
		}
		while (run) {		
			System.out.println("=========================================================================");
			System.out.println("==========1. 게시글 등록 | 2. 게시글 수정 | 3. 게시글 삭제 | 4. 추천하기=============");
			System.out.println("======================|5. 댓글 남기기  | 6. 이전 화면==========================");
			System.out.println("=========================================================================");
			System.out.print("메뉴 >");
			int inputNum = Integer.parseInt(sc.nextLine());

			BoardService bs = new BoardService();
			switch (inputNum) {
				case 1:
					// 게시글 등록
					insertMusic();
					break;
				case 2:
					// 게시글 수정
					break;
				case 3:
					// 게시글 삭제
					break;
				case 4:
					//추천하기
					break;
				case 5:
					//댓글 남기기
					break;
				case 6:
					//이전 화면
					bs.connKMusic();
					break;
				default:
					System.out.println("※잘못 입력된 번호 입니다. 다시 입력해주세요.");
					continue;
					
			}	
		}
		
	}
	
	//추천 음악 등록
	public void insertMusic() {
		System.out.println("===================================●====================================");
		System.out.println("================================음악 등록==================================");
		
		//게시판 번호 자동으로 입력 ---수정해야함
		System.out.println("게시판 번호 > "); // 수정
		int boardNum = Integer.parseInt(sc.nextLine());
			
		//자기 아이디 가져오기
		String cafeId = CafeService.cafeInfo.getCafeId();

		
		System.out.println("가수 이름 >");
		String singer = sc.nextLine();
		
		System.out.println("노래 제목 >");
		String music = sc.nextLine();
		
		
		System.out.println("앨범 제목 (생략은 '0' 입력) >");
		String album = sc.nextLine();	
		if (album == "0") {
			album = "";
		}
		//장르 가져오기 ---수정
		GenerBoard gb = new GenerBoard();
		String genre1 = gener;
		
		System.out.println("추천 이유 (생략은 '0' 입력) >");
		String musicEx = sc.nextLine();
		if (musicEx == "0") {
			musicEx = "";
		}
		
		System.out.println("유튜브 or 멜론 링크 (생략은 '0' 입력) >");
		String link = sc.nextLine();
		if (link == "0") {
			link = "";
		}
		
		String cafeGrade = CafeService.cafeInfo.getCafeGrade();
		
		BoardInfo bi = new BoardInfo();
		
		bi.setBoardNum(boardNum);
		bi.setCafeId(cafeId);
		bi.setSinger(singer);
		bi.setMusic(music);		
		bi.setAlbum(album);
		bi.setGenre(genre1);
		bi.setMusicExplain(musicEx);
		bi.setLink(link);
		bi.setCafeGrade(cafeGrade);
		
		int result = BoardInfoDAO.getInstance().insertMusic(bi);
			
		if(result > 0) {
			System.out.println("음악 등록 완료");
		} else {
			System.out.println("음악 등록 실패");
		}
	}


	
	
}
