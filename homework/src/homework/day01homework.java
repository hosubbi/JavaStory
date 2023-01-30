package homework;

public class day01homework {
	
	public static void main(String[] args) {
		
				//Q1
				int x = 37;
				int y = 91;
				System.out.println("변수명1: " + x + " 변수명2: " + y);
				
				//Q2-1
				System.out.println(y+x);
				
				//Q2-2
				System.out.println(y-x);
				
				//Q2-3
				System.out.println(y*x);
				
				//Q2-4
				System.out.println(y/x);
				
				//Q3-1 byte var1 = 128;
				int var1 = 128;
				System.out.printf("%d, int\n",var1);
				
				//Q3-2 char var2 = "b";
				String var2 = "b";
				System.out.printf("%s, String\n",var2);
				
				//Q3-3 String var3 = 44032;
				int var3 = 44032;
				System.out.printf("%d, int\n",var3);
				
				//Q3-4 int var4 = 100000000000;
				long var4 = 100000000000L;
				System.out.printf("%d, long\n",var4);
				
				//Q3-5 float var5 = 43.93106;
				double var5 = 43.93106;
				System.out.printf("%7.5f, double\n",var5);
				
				//Q3-6 long var6 = 301.3;
				double var6 = 301.3;
				System.out.printf("%5.1f, double\n",var6);
				
				//Q4
				byte a = 35;
				byte b = 25;
				int c = 463;
				long d = 1000L;
				
				//Q4-1
				int result1 = a + c + (int)d;
				System.out.println(result1);
				
				//Q4-2
				int result2 = a + b + c;
				System.out.println(result2);
				
				//Q4-3
				double e = 45.31;
				double result3 = c + d + e;
				System.out.println(result3);
				
				//Q5
				int intValue1 = 24;
				int intValue2 = 3;
				int intValue3 = 8;
				int intValue4 = 10;
				char charValue = 'A';
				String strValue = "번지";		
				System.out.printf("%c%d%d%s%3.1f\n",charValue,intValue1+intValue2,intValue3,strValue,(double)intValue4);
				
				//추가문제
				int value = 485;
				System.out.println(value/100+((value-(value/100*100))/10)+(value-(value/10*10)));
				
	}
}


