package com.yedam.test;

public interface Payment {
	public double ONLINE_PAYMENT_RATIO = 0.05;
	public double OFFLINE_PAYMENT_RATIO = 0.03;
	
	public abstract int online(int price);
	public abstract int offline(int price);
	public abstract void showinfo();
}
