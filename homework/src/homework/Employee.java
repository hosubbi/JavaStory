package homework;

public class Employee {
	//필드
	public String name;
	public int anuIncome;
		
	//생성자
	
	
	public String getName() {
		return name;
	}
	
	public int getAnuIncome() {
		return anuIncome;
	}
	
	//메소드
	public void getInformation() {
		System.out.println("이름 : " + name + " 연봉 : " + anuIncome);
	}	
	public void print() {
		System.out.println("수퍼클래스");
	}
	
	
}
