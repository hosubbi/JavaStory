package homework;

public class Human {
	public String name;
	public int height;
	public int weight;
	
	public Human (String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}		
	public void getInformation() {
		System.out.printf("이름:%s 키:%d 몸무게:%d\n",name,height,weight);
	}
	
}
