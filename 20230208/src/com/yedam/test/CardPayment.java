package com.yedam.test;

public class CardPayment implements Payment{
	double cardRatio;
	
	public CardPayment (double cardRatio) {
		this.cardRatio = cardRatio;
		System.out.println("***카드로 결제 시 할인정보");
	}

	@Override
	public int online(int price) {
		return price - (int) (price * (cardRatio + Payment.ONLINE_PAYMENT_RATIO));
	}


	@Override
	public int offline(int price) {
		return price - (int) (price * (cardRatio + Payment.OFFLINE_PAYMENT_RATIO));
	}

	@Override
	public void showinfo() {
		double result = (double) cardRatio + Payment.ONLINE_PAYMENT_RATIO;
		System.out.println("온라인 결제시 총 할인율 : " + result);
		double result2 = (double) cardRatio + Payment.OFFLINE_PAYMENT_RATIO;
		System.out.println("온라인 결제시 총 할인율 : " + result2);
		
	}
}