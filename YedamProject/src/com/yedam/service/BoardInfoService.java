package com.yedam.service;

import java.util.List;
import java.util.Scanner;


public class BoardInfoService {
	Scanner sc = new Scanner(System.in);
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
	public void getBoardInfoList() {
		System.out.println("입장할 게시판 번호를 입력하시오 >");
		List<BoardInfo> list = BoardInfoDAO.getInstance().getBoardInfoList(Integer.parseInt(sc.nextLine()));
		System.out.println("=========================================================================");
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
			System.out.println("=========================================================================");
		}
		System.out.println("=========================================================================");
		System.out.println("==========1. 게시글 등록 | 2. 게시글 수정 | 3. 게시글 삭제 | 4. 추천하기=============");
		System.out.println("======================|5. 댓글 남기기  | 6. 이전 화면==========================");
		System.out.println("=========================================================================");
		System.out.print("메뉴 >");
		int inputNum = Integer.parseInt(sc.nextLine());
		switch (inputNum) {
			case 1:
				// 게시글 등록
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
				break;
			default:
				System.out.println("※잘못 입력된 번호 입니다. 다시 입력해주세요.");
				getBoardInfoList();
				break;
				
		}
		
	}
	
}
