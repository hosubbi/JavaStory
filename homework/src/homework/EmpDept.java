package homework;

public class EmpDept extends Employee {
	//필드
	public String department;
	
	//생성자
	public EmpDept (String name, int anuIncome, String department) {
		this.name = name;
		this.anuIncome = anuIncome;
		this.department = department;
	}
	
	//메소드
	@Override
	public void getInformation() {
		super.getInformation();
	}

	@Override
	public void print() {
		super.print();
		System.out.println("서브클래스");
	}
	
	
	
	
	
	

}
