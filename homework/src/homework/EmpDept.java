package homework;

public class EmpDept extends Employee {
	//필드
	public String department;
	
	//생성자
	public EmpDept (String name, int anuIncome, String department) {		
		super(name, anuIncome);
		this.department = department;		
	}

	public String getDepartment() {
		return department;
	}

	//메소드
	@Override	
	public void getInformation() {
		super.getInformation();
		System.out.printf("부서:%s\n",department);
	}

	@Override
	public void print() {
		super.print();
		System.out.println("서브클래스");
	}
}