package homework;

public class Application02y23m02d03 {

	public static void main(String[] args) {
		Human hu = new StandardWeightInfo("홍길동", 168, 45);
		hu.getInformation();
		
		Human hu2 = new ObesityInfo("박둘이", 168, 90);
		hu2.getInformation();
	}

}
