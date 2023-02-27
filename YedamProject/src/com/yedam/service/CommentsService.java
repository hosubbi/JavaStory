package com.yedam.service;

import java.util.List;
import java.util.Scanner;

public class CommentsService {
	Scanner sc = new Scanner(System.in);
	public void getCommentsList() {
		BoardInfoService bis = new BoardInfoService();
		List<Comments> list = CommentsDAO.getInstance().getCommentsList(bis.genre);
		System.out.println("================================●●●댓글●●●================================");
		for(int j=0; j<list.size(); j++) {
			System.out.print("◎게시글 번호 : " + list.get(j).getBoardNum() + " ");
			System.out.print("◎댓글 번호 : " + list.get(j).getComentsNum() + " ");
			System.out.print("◎ID : " + list.get(j).getCafeId() + " ");
			System.out.println("◎장르 : " + list.get(j).getCommentsGenre() + " ");
			System.out.println("◎댓글 내용 : " + list.get(j).getComments() + " ");
			System.out.println("◎작성일 : " + list.get(j).getCommentsDate() + " ");
			System.out.println("-------------------------------------------------------------------------");
		}
		System.out.println("=========================================================================");
		System.out.println("=============1. 댓글 달기 | 2. 댓글 수정 | 3. 댓글 삭제 | 4. 이전 화면==============");
		System.out.println("=========================================================================");
		System.out.println("어떤 메뉴로 이동하시겠습니까 > ");
		int commentsMenu = Integer.parseInt(sc.nextLine());
		switch(commentsMenu) {
			case 1:
				//댓글 달기
				break;
			case 2:
				//댓글 수정
				break;
			case 3:
				//댓글 삭제
				break;
			case 4:
				//이전 화면
				break;
			default :
				//잘못입력했을때
				break;
		}
	}
}
