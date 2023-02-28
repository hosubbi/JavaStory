package com.yedam.service;

import java.util.List;
import java.util.Scanner;


public class BoardInfoService {
	Scanner sc = new Scanner(System.in);
	boolean run = true;
	public static int enterGenre = 0;
	private int deleteNum = 0;
	public static String genre = null;
	public static String blank = "-";
	//private에서 바꿈
	private boolean deleteSuccess = true;

	
	//장르별 게시판 선택
	public void getBoardInfoList1() {
		CommentsService cts = new CommentsService();
		BoardService bs = new BoardService();
		System.out.println("입장할 게시판 번호를 입력하시오 >");
		enterGenre = Integer.parseInt(sc.nextLine());		
		switch (enterGenre) {			
		case 1:
			genre = "발라드";
			break;
		case 2:
			genre = "댄스";
			break;
		case 3:
			genre = "랩/힙합";
			break;
		case 4:
			genre = "알앤비";
			break;
		case 5:
			genre = "인디음악";
			break;
		case 6:
			genre = "록/메탈";
			break;
		case 7:
			genre = "트로트";
			break;
		case 8:
			genre = "기타장르";
			break;
		case 9:
			bs.enterBoard();
			break;
		default:
			System.out.println("다시 입력해주세요.");
			
		}
		getBoardInfoList();
	}
	public void getBoardInfoList() {
		
		List<BoardInfo> list = BoardInfoDAO.getInstance().getBoardInfoList(enterGenre);		
		while(run) {
			System.out.println("==========================●●●" + genre +  " 게시판 입니다●●●==========================");
				for(int i=0; i<list.size(); i++) {
					System.out.println("◎No." + list.get(i).getBoardNum() + " ");
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
			System.out.println("===========================================================================");
			System.out.println("==========1. 게시글 등록 | 2. 게시글 수정 | 3. 게시글 삭제 | 4. 댓글방 접속=============");
			System.out.println("=================5. 추천하기 | 6. 신고하기  | 7. 이전 화면=========================");
			System.out.println("===========================================================================");
			System.out.print("메뉴 >");
			int inputNum = Integer.parseInt(sc.nextLine());
			CommentsService cts = new CommentsService();
			BoardService bs = new BoardService();
		
			switch (inputNum) {
				case 1:
					// 게시글 등록
					insertMusic();
					getBoardInfoList();
					break;
				case 2:
					// 본인 게시글 리스트 확인 후 수정
					myBoardList();
					modifyMusic();
					getBoardInfoList();
					break;
				case 3:
					// 본인 게시글 리스트 확인 후 게시글 삭제
					myBoardList();					
					deleteMyBoard();
					if(deleteSuccess == true) {
						delAfterUpdate();
					}
					getBoardInfoList();
					break;
				case 4:
					//댓글방
					cts.getCommentsList();
					break;
				case 5:
					//추천하기
					recommendMem();
					getBoardInfoList();
					break;				
				case 6:
					//신고 하기
					accusationMem();
					getBoardInfoList();
					break;
				case 7:
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
		System.out.println("==============================추천 음악 등록================================");
		//게시판 번호 자동으로 입력 ---수정해야함
//		System.out.println("게시판 번호 > "); // 수정
//		int boardNum = Integer.parseInt(sc.nextLine());
			
		//자기 아이디 가져오기
		String cafeId = CafeService.cafeInfo.getCafeId();

		
		System.out.println("가수 이름 >");
		String singer = sc.nextLine();
		
		System.out.println("노래 제목 >");
		String music = sc.nextLine();
		
		
		System.out.println("앨범 제목 (생략 가능) >");		
		String album = sc.nextLine();	

		
		System.out.println("추천 이유 (생략 가능) >");
		String musicEx = sc.nextLine();
		
		
		System.out.println("유튜브 or 멜론 링크 (생략 가능) >");
		String link = sc.nextLine();
		
		
		String cafeGrade = CafeService.cafeInfo.getCafeGrade();
		
		BoardInfo bi = new BoardInfo();
		
		bi.setCafeId(cafeId);
		bi.setSinger(singer);
		bi.setMusic(music);
		
		if(album == "") {
			bi.setAlbum(blank);
		}else {;
			bi.setAlbum(album);
		}		
		
		bi.setGenre(genre);
		
		if(musicEx == "") {
			bi.setMusicExplain(blank);
		}else {
			bi.setMusicExplain(musicEx);
		}
		
		if(link == "") {
			bi.setLink(blank);
		}else {
			bi.setLink(link);
		}
		
		bi.setCafeGrade(cafeGrade);
		
		int result = BoardInfoDAO.getInstance().insertMusic(bi);
		
		if(result > 0) {
			System.out.println("게시글 등록 완료");
		} else {
			System.out.println("게시글 등록 실패");
		}
	}

	//게시글 수정(본인)
	public void modifyMusic() {
		BoardInfo bi = new BoardInfo();
		System.out.println("변경 할 게시글 번호 ※본인 게시글만 가능 >");
		bi.setBoardNum(Integer.parseInt(sc.nextLine()));
		
		//장르
		bi.setGenre(genre);
		
		//본인 카페 아이디
		String cafeId = CafeService.cafeInfo.getCafeId();
		
		System.out.println("가수 이름 >");
		String singer = sc.nextLine();
		
		System.out.println("노래 제목 >");
		String music = sc.nextLine();
		
		System.out.println("앨범 제목 (생략 가능) >");
		String album = sc.nextLine();	
		
		System.out.println("추천 이유 (생략 가능) >");
		String musicEx = sc.nextLine();		
		
		System.out.println("유튜브 or 멜론 링크 (생략 가능) >");
		String link = sc.nextLine();		
		
		bi.setCafeId(cafeId);
		bi.setSinger(singer);
		bi.setMusic(music);		
		bi.setAlbum(album);
		bi.setGenre(genre);
		bi.setMusicExplain(musicEx);
		bi.setLink(link);
		
		int result = BoardInfoDAO.getInstance().modifyMusic(bi);
		

		//게시글 id != 로그인아이디 일경우 조건제시!!!!!!!!!!! --수정중--
		
		if(result > 0) {
			System.out.println("게시글 수정 완료");
		} else {
			System.out.println("※본인 게시글이 아니거나 게시글이 없습니다※");
		}
		
	}
	
	//rs구문 테스트 --수정중 
//	public void testFuction() {
//		BoardInfo bi = BoardInfoDAO.getInstance().testFunction(genre);
//		if(bi == null) {
//			System.out.println("조회된 결과 없음");
//		} else {
//			System.out.println("이 장르의 갯수는" + genre + bi.getGenre());
//		}
//		System.out.println("================================");
//		
//	}
	
	//나의 게시글 리스트
	public void myBoardList() {
		String myId = CafeService.cafeInfo.getCafeId();
		List<BoardInfo> list = BoardInfoDAO.getInstance().myBoardList(myId, genre);
		System.out.println("=============================●●●나의 게시글●●●=============================");
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
	}
	
	
	//나의 게시글 삭제
	public void deleteMyBoard() {
		System.out.println("=================================내 게시글 삭제=================================");
		System.out.println("삭제 게시글 번호 > ");
		deleteNum = Integer.parseInt(sc.nextLine());
		String myId = CafeService.cafeInfo.getCafeId();
		
		BoardInfo bi = new BoardInfo();
		bi.setCafeId(myId);
		bi.setGenre(genre);
		bi.setBoardNum(deleteNum);
		
		int result = BoardInfoDAO.getInstance().deleteMyBoard(bi);
		
		if(result > 0) {
			System.out.println("게시글 삭제 완료");
			deleteSuccess = true;
		}else {
			System.out.println("※본인 게시글이 아니거나 게시글이 없습니다※");
			deleteSuccess = false;
		}
	}
	
	//게시글 삭제 후 그 글부터 + 1
	public void delAfterUpdate() {
		BoardInfo bi = new BoardInfo();
		bi.setBoardNum(deleteNum);
		//장르
		bi.setGenre(genre);
		int result = BoardInfoDAO.getInstance().delAfterUpdate(bi);
		

		//게시글 id != 로그인아이디 일경우 조건제시!!!!!!!!!!! --수정중--
		
		if(result > 0) {
			System.out.println("게시글 번호가 갱신됩니다.");
		} else {
			System.out.println("게시글이 없습니다.");
		}
		
	}
	
	//추천하기
	public void recommendMem() {
		BoardInfo bi = new BoardInfo();
		System.out.println("추천 할 게시글 번호 ※본인 게시글은 불가 >");
		bi.setBoardNum(Integer.parseInt(sc.nextLine()));

		//본인 카페 아이디
//		String cafeId = CafeService.cafeInfo.getCafeId();
		
		bi.setGenre(genre);
		int result = BoardInfoDAO.getInstance().recommendMem(bi);
		

		//게시글 id != 로그인아이디 일경우 조건제시!!!!!!!!!!! --수정중--
		
		if(result > 0) {			
			System.out.println("게시글 추천 완료");			
		}else {
			System.out.println("※본인 게시글이거나 게시글이 없습니다※");
		}
		
	}
	
	//신고하기
	public void accusationMem() {
		BoardInfo bi = new BoardInfo();
		System.out.println("신고 할 게시글 번호 ※본인 게시글은 불가 >");
		bi.setBoardNum(Integer.parseInt(sc.nextLine()));

		//본인 카페 아이디
//		String cafeId = CafeService.cafeInfo.getCafeId();
		
		bi.setGenre(genre);
		int result = BoardInfoDAO.getInstance().accusationMem(bi);
		

		//게시글 id != 로그인아이디 일경우 조건제시!!!!!!!!!!! --수정중--
		
		if(result > 0) {			
			System.out.println("게시글 신고 완료");			
		}else {
			System.out.println("※본인 게시글이거나 게시글이 없습니다※");
		}
		
	}
	
	
}
