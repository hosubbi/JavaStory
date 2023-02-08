package com.yedam.test;

public class Q02Test {

	public static void main(String[] args) {
		
		System.out.println("===========TossCard===========");
		Card Tcard = new TossCard("5432-4567-9534-3657", 20251203, 253, "신빛용");		
		Tcard.showCardInfo();
		
		System.out.println("============DGBCard===========");
		Card Dcard = new DGBCard("5432-4567-9534-3657", 20251203, 253, "신빛용");		
		Dcard.showCardInfo();
	}

}
