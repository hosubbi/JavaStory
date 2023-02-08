package com.yedam.test;

public class Q03Test {
	public static void main(String[] args) {
		int price = 10000;
		
		Payment card = new CardPayment(0.08);
		card.showinfo();
		
		System.out.println("온라인 결제 금액 : " + card.online(price));
		System.out.println("오프라인 결제 금액 : " + card.offline(price));
		
		Payment simple = new CardPayment(0.05);
		simple.showinfo();
		
		System.out.println("온라인 결제 금액 : " + simple.online(price));
		System.out.println("오프라인 결제 금액 : " + simple.offline(price));
		
		
	}

}
