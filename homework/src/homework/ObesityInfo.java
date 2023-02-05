package homework;

public class ObesityInfo extends StandardWeightInfo {
	public ObesityInfo(String name, int height, int weight) {
		super(name, height, weight);
	}


	
	public double getObesity(double weight) {
		return (weight - getStandarWeight())/getStandarWeight() * 100;
	}
	
	public void getInformation() {
		String obesityDegree = null;
		if(getObesity(weight) >= 50) {
			obesityDegree="고도비만";
		}else if(getObesity(weight) >= 30) {
			obesityDegree="중등도비만";
		}else if(getObesity(weight) >= 20) {
			obesityDegree="경도비만";
		}else {
			obesityDegree="과체중";
		}
		System.out.printf("이름:%s 키:%d 몸무게:%d 비만도:%4.1f 현재상태:%s",name,height,weight,getObesity(weight),obesityDegree);
	}
}
