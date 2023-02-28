package com.yedam.service;

import java.util.List;
import java.util.Scanner;

public class CommentsService {
	Scanner sc = new Scanner(System.in);
	private int boardNum = 0;
	private boolean run = true;
	private int deleteCommentNum = 0;
	private boolean deleteSuccess = true;
	public void getCommentsList() {
		BoardInfoService bis = new BoardInfoService();		
		System.out.println("몇 번 게시글의 댓글방에 참여하시겠습니까? (게시글 번호 입력 > )");
		boardNum = Integer.parseInt(sc.nextLine());
		while (run) {
			List<Comments> list = CommentsDAO.getInstance().getCommentsList(boardNum, bis.genre);
			System.out.println("================================●●●댓글●●●================================");
			for(int j=0; j<list.size(); j++) {
				System.out.print("◎게시글 No." + list.get(j).getBoardNum() + " ");
				System.out.println("◎댓글 No." + list.get(j).getCommentsNum() + " ");
				System.out.print("◎ID : " + list.get(j).getCafeId() + " ");
				System.out.print("◎노래 제목 : " + list.get(j).getMusic() + " ");
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
					insertComments();
					break;
				case 2:
					//본인 댓글 리스트 확인 후 댓글 수정
					myCommentList();
					modifyMyComment();
					break;
				case 3:
					//본인 댓글 리스트 확인 후 댓글 삭제
					myCommentList();
					deleteMyComment();
					if(deleteSuccess == true) {
						delCommentAfterUpdate();
					}
					break;
				case 4:
					//이전 화면
					bis.getBoardInfoList();
					break;
				default :
					//잘못입력했을때
					
					break;
			}
		}
	}
	
	public void insertComments() {
		System.out.println("===================================●====================================");
		System.out.println("================================댓글 등록=================================");

		//자기 아이디 가져오기
		String cafeId = CafeService.cafeInfo.getCafeId();

		System.out.println("댓글을 입력하세요 > ");
		String comments = sc.nextLine();
		
		
		
		BoardInfoService bis = new BoardInfoService();
		Comments cm = new Comments();
		
		cm.setBoardNum(boardNum);
		cm.setCafeId(cafeId);		
		cm.setCommentsGenre(bis.genre);
		cm.setComments(comments);
		
		
		int result = CommentsDAO.getInstance().insertComments(cm);
		
		if(result > 0) {
			System.out.println("댓글 등록 완료");
		} else {
			System.out.println("댓글 등록 실패");
		}
	}
	
	//나의 댓글 리스트
	public void myCommentList() {
		String myId = CafeService.cafeInfo.getCafeId();
		BoardInfoService bis = new BoardInfoService();
		List<Comments> list = CommentsDAO.getInstance().myCommentList(boardNum, myId, bis.genre);
		System.out.println("=============================●●●나의  댓글●●●=============================");
		for(int i=0; i<list.size(); i++) {
			System.out.print("◎게시글 No." + list.get(i).getBoardNum() + " ");
			System.out.println("◎댓글 No." + list.get(i).getCommentsNum() + " ");
			System.out.print("◎ID : " + list.get(i).getCafeId() + " ");
			System.out.print("◎노래 제목 : " + list.get(i).getMusic() + " ");
			System.out.println("◎장르 : " + list.get(i).getCommentsGenre() + " ");
			System.out.println("◎댓글 내용 : " + list.get(i).getComments() + " ");
			System.out.println("◎작성일 : " + list.get(i).getCommentsDate() + " ");
			System.out.println("-------------------------------------------------------------------------");
		}		
	}
	
	//나의 댓글 수정
	public void modifyMyComment() {
		BoardInfoService bis = new BoardInfoService();
		Comments cm = new Comments();
		System.out.println("변경 할 내 댓글 번호 ※본인 게시글만 가능 >");
		cm.setCommentsNum(Integer.parseInt(sc.nextLine()));	
		//본인 카페 아이디
		String cafeId = CafeService.cafeInfo.getCafeId();
		
		System.out.println("-----------------------댓글을 수정 합니다----------------------");
		System.out.println("댓글을 입력해주세요 > ");
		String comment = sc.nextLine();
		
		cm.setCafeId(cafeId);
		cm.setComments(comment);
		cm.setBoardNum(boardNum);
		cm.setCommentsGenre(bis.genre);
	
		
		int result = CommentsDAO.getInstance().modifyMyComment(cm);
		

		//게시글 id != 로그인아이디 일경우 조건제시!!!!!!!!!!! --수정중--
		
		if(result > 0) {
			System.out.println("댓글 수정 완료");
		} else {
			System.out.println("※본인 댓글이 아니거나 댓글이 없습니다※");
		}
		
	}
	
	
	
	//나의 댓글 삭제
	public void deleteMyComment() {	
		BoardInfoService bis = new BoardInfoService();
		Comments cm = new Comments();
		System.out.println("=================================내 댓글 삭제=================================");
		System.out.println("삭제 댓글 번호 > ");
		deleteCommentNum = Integer.parseInt(sc.nextLine());
		
		
		String myId = CafeService.cafeInfo.getCafeId();		
		
		cm.setCommentsNum(deleteCommentNum);
		cm.setCafeId(myId);
		cm.setCommentsGenre(bis.genre);
		cm.setBoardNum(boardNum);
		
		int result = CommentsDAO.getInstance().deleteMyComment(cm);
		
		if(result > 0) {
			System.out.println("댓글 삭제 완료");
			deleteSuccess = true;
		}else {
			System.out.println("※본인 댓글이 아니거나 댓글이 없습니다※");
			deleteSuccess = false;
		}
	}
	
	//삭제 후 업데이트 댓글 no. +1
	public void delCommentAfterUpdate() {
		Comments cm = new Comments();
		BoardInfoService bis = new BoardInfoService();
		
		//장르
		
		
		
//		pstmt.setInt(1, cm.getCommentsNum());
//		pstmt.setString(2, cm.getCommentsGenre());
//		pstmt.setInt(3, cm.getBoardNum());
		
		cm.setCommentsNum(deleteCommentNum);
		cm.setCommentsGenre(bis.genre);
		cm.setBoardNum(boardNum);
		
		//게시글 id != 로그인아이디 일경우 조건제시!!!!!!!!!!! --수정중--
		int result = CommentsDAO.getInstance().delCommentAfterUpdate(cm);
		
		if(result > 0) {
			System.out.println("댓글 번호 갱신");
			deleteSuccess = true;
		} else {
			System.out.println("...");
			deleteSuccess = false;
		}
		
	}
	
}
