package homework;

import java.util.Scanner;


public class day04homework {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int keybordCount = 0;
		Keybord[] kbdAry = null;
		
		while(true) {
			System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			System.out.println("입력>");
			int inputNum = Integer.parseInt(sc.nextLine());
			
			if(inputNum == 1) {
				System.out.println("상품 수 입력");
				keybordCount = Integer.parseInt(sc.nextLine());
							
			}else if(inputNum == 2) {
				//배열의 크기(학생의 데이터를 넣을 수 있는 크기 설정)
				kbdAry = new Keybord[keybordCount];
				for(int i = 0; i<kbdAry.length; i++) {
					//각 방(각 배열)에 있는 객체를 초기화 해준다.
					kbdAry[i] = new Keybord();
					System.out.println("상품명>");
					String name = sc.nextLine();
					kbdAry[i].name = name;
					
					System.out.println("가격>");
					int kbdPrice = Integer.parseInt(sc.nextLine());
					kbdAry[i].price = kbdPrice;
				}				
			}else if(inputNum == 3) {
				for(int i = 0; i<kbdAry.length; i++) {
					System.out.println("상품명 : " + kbdAry[i].name + "  가격 : " +  kbdAry[i].price);
				}
				
			}else if(inputNum == 4) {
				int max = kbdAry[0].price;
				int sum = 0;
				int exsum = 0;
				int maxindex = 0;
				for(int i = 0; i<kbdAry.length; i++) {
					if(max < kbdAry[i].price) {
						max = kbdAry[i].price;
						maxindex = i;
					}
					sum += kbdAry[i].price;
					exsum = sum - kbdAry[maxindex].price;
				}
				System.out.println("최고 가격을 가지는 제품 : " + kbdAry[maxindex].name + "  해당 제품을 제외한 제품들의 총합 : " + exsum);							
			}else if(inputNum == 5) {
				System.out.println("프로그램 종료");
				return;
			}
		}
		
		
		
	}
}
