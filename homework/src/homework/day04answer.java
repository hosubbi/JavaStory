//package homework;
//
//import java.util.Scanner;
//
//public class day04answer {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Keybord[] list = null;
//		
//		int productNo = 0;
//		
//		boolean run = true;
//		
//		while(run) {
//			System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
//			System.out.println("입력>");
//			int selectNo = Integer.parseInt(sc.nextLine());
//			
//			switch (selectNo) {
//			case 1:
//				System.out.println("상품 수>");
//				productNo = Integer.parseInt(sc.nextLine());
//				list = new Keybord[productNo];
//				break;
//			case 2:
//				for(int i=0; i<list.length; i++) {
//					list[i] = new Keybord();
//					System.out.println("상품명>");
//					list[i].name = Integer.parseInt(sc.nextLine());
//					System.out.println("가격");
//					list[i].price = Integer.parseInt(sc.nextLine());
//					System.out.println("=================");
//				}
//				break;
//			case 3:
//				for(Keybord product = list) {
//					System.out.println("상품 명 : " + product.name);
//					System.out.println("가격 : " + product.price);
//					System.out.println("=================");
//				}
//				break;
//			case 4:
//				int max = list[0].price;
//				int idx = 0;
//				for(int i = 1; i<list.length; i++) {
//					if(list[i].price > max) {
//						max = list[i].price;
//						idx = i;
//					}
//				}
//				int sum = 0;
//				for(Keybord product : list) {
//					if(product.price != max) {
//						sum += product.price;
//					}
//					//if(product.price == max) {
//						//continue;}
//				}
//				System.out.println("최고 가격 제품명 : " + list[idx].name);
//				System.out.println("최고 가격 제외한 제품 가격의 합 : " + sum);
//				break;
//			case 5:
//				run = false;
//				System.out.println("end of program");
//				break;
//			default:
//				System.out.println("없는 메뉴 선택. \n맞는 메뉴를 선택하세요");
//				break;
//			}
//		}
//	}
//
//}
