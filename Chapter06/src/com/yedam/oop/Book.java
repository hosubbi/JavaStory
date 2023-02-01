package com.yedam.oop;

public class Book {
	//book이라는 클래스는 아래의 정보를 가져야합니다.
	//책이름, 책종류, 가격, 도서번호, 출판사
	//생성자는 아무런 행동을 하지 않습니다.
	//메소드는 getInfo() 메소드를 가지는데, 아무런 기능이 없습니다.
	
	
	//필드
	//책이름, 책종류, 가격, 도서번호, 출판사
	String bookName;
	String bookKind;
	int bookPrice;
	int isbn;
	String publisher;
		
	//생성자 3개정도 생성
	//1) 기본 생성자
	
	//데이터(매개변수) -> 필드를 초기화 할 수 있게끔 생성자
	//2) 모든 데이터를 초기화 할 수 있는 생성자
	//3) 책이름, 가격, 도서번호를 받아오는 생성자
	
	
	
	//1) 기본 생성자
	public Book() {
		
	}
	//2) 모든 데이터를 초기화 할 수 있는 생성자
	public Book(String bookName, String bookKind, int bookPrice, int isbn, String publisher) {
		this.bookName = bookName;
		this.bookKind = bookKind;
		this.bookPrice = bookPrice;
		this.isbn = isbn;
		this.publisher = publisher;
	}
	//3) 책이름, 가격, 도서번호
	public Book(String bookName, int bookPrice, int isbn) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.isbn = isbn;
	}
	
	
	
	
	
	//메소드
	//메소드는 getInfo() 메소드를 가짐.
	//getInfo() 메소드를 클래스 외부에서 실행 하였을 때,
	//다음과 같은 출력물이 나오도록 구현.
	/* System.out.println()
	 * 책 이름 : 혼자 공부하는 자바
	 * # 내용
	 * 1) 종류 : 학습서
	 * 2) 가격 : 24000원
	 * 3) 출판사 : 한빛 미디어
	 * 4) 도서번호 : 0001
	 */
	void getInfo(/*String bookName, String bookKind, int bookPrice, String publisher, int isbn*/) {
		System.out.println("책 이름 : " + bookName);
		System.out.println("# 내용");
		System.out.println("1) 종류 : " + bookKind);
		System.out.println("2) 가격 : " + bookPrice);
		System.out.println("3) 출판사 : " + publisher);
		System.out.println("4) 도서번호 : " + isbn);
	}

}
