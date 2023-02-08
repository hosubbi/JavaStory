package com.yedam.test;

public class SimplePayment implements Payment{
	double simplePaymentRatio;
	
	public SimplePayment (double simplePaymentRatio) {
		this.simplePaymentRatio = simplePaymentRatio;
		System.out.println("*** 간편결제 시 할인정보");
	}

	@Override
	public int online(int price) {
		return price - (int) (price * (simplePaymentRatio + Payment.ONLINE_PAYMENT_RATIO));
	}

	@Override
	public int offline(int price) {
		return price - (int) (price * (simplePaymentRatio + Payment.OFFLINE_PAYMENT_RATIO));
	}

	@Override
	public void showinfo() {
		double result = (double) simplePaymentRatio + Payment.ONLINE_PAYMENT_RATIO;
		System.out.println("온라인 결제시 총 할인율 : " + result);
		double result2 = (double) simplePaymentRatio + Payment.OFFLINE_PAYMENT_RATIO;
		System.out.println("온라인 결제시 총 할인율 : " + result2);
	}
	
}
