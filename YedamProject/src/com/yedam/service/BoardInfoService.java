package com.yedam.service;

import java.util.Scanner;

public class BoardInfoService {
	
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
	
	public void getBoardInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("게시판 번호 입력 >");
		BoardInfo bi = BoardInfoDAO.getInstance().getBoardInfo(Integer.parseInt(sc.nextLine()));
		if(bi == null) {
			System.out.println("조회된 결과 없음.");
		} else {
			System.out.print("◎ID : " + bi.getCafeId() + " ");
			System.out.print("◎가수 이름 : " + bi.getSinger());
			System.out.print("◎노래 제목 : " + bi.getMusic());
			System.out.print("◎앨범 제목 : " + bi.getAlbum());
			System.out.println("◎장르 : " + bi.getGenre());
			System.out.println("◎추천 이유 : " + bi.getMusicExplain());
			System.out.println("◎링크 : " + bi.getLink());
			System.out.print("◎작성일 : " + bi.getWriteDate());
			System.out.print("◎카페 등급 : " + bi.getCafeGrade());
			System.out.print("◎추천수 : " + bi.getRecomendNum());
			System.out.println("◎신고수 : " + bi.getAccusation());
		}
		System.out.println("==================================");
	}
}
