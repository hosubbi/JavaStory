package BaekJoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		int test[] = new int[c];
		int a;
		for(int i=0; i<c; i++) {
			int n = sc.nextInt();
			int count = 0;
			int arr[] = new int[n];
			for(int j=0; j<n; j++) {
				a = sc.nextInt();
				arr[j] = a;
				test[i] += a;
			}
			test[i] = test[i] / n;
			for(int z=0; z<n; z++) {
				
				if(arr[z] > test[i]) {
					count += 1;
				}
				
			}
			System.out.printf("%.3f%%\n",(count/(double) n)*100);
		}	
	}
}