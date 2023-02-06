package homework;

public class StandardWeightInfo extends Human{

	public StandardWeightInfo(String name, int height, int weight) {
		super(name, height, weight);
	}
	
	
	public double getStandarWeight() {
//		return (height-100.0)*0.9;
		double result = (height-100)*0.9;
		return result;
	}
	
	@Override
	public void getInformation() {
		System.out.printf("이름:%s 키:%d 몸무게:%d 표준체중:%4.1f\n",name,height,weight,getStandarWeight());
	}


	
}
