package homework;

public class Employee {
	//필드
	public String name;
	public int anuIncome;
		
	//생성자
	
	public Employee (String name, int anuIncome) {
		this.name = name;
		this.anuIncome = anuIncome;
	}
	
	public Employee () {
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getAnuIncome() {
	return anuIncome;
	}
	

	 

	//메소드
	public void getInformation() {
		System.out.printf("이름:%s 연봉:%d ",name,anuIncome );
	}	
	public void print() {
		System.out.println("수퍼클래스");
	}
	
	
}
