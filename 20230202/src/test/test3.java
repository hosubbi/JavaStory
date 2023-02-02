package test;

public class test3 {
	public static void main(String[] args) {
		// 큰 금액부터 동전을 우선적으로 거슬러 줘야한다.
		int[] coinUnit = new int[4];
		int money = 2680;
		System.out.println("money= " + money);
		for (int i = 0; i < coinUnit.length; i++) {
			if(i==0) {
				coinUnit[i] = money/500;
				money = money-(coinUnit[i]*500);				
			}
			if(i==1) {
				coinUnit[i] = money/100;
				money = money-(coinUnit[i]*100);
			}
			if(i==2) {
				coinUnit[i] = money/50;
				money = money-(coinUnit[i]*50);
			}
			if(i==3) {
				coinUnit[i] = money/10;
				money = money-(coinUnit[i]*10);
			}
		
		}
		System.out.println("500원 :" + coinUnit[0] +"개");
		System.out.println("100원 :" + coinUnit[1] +"개");
		System.out.println("500원 :" + coinUnit[2] +"개");
		System.out.println("10원 :" + coinUnit[3] +"개");
		
		
	}	
}
