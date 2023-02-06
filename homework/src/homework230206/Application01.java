package homework230206;

public class Application01 {

	public static void main(String[] args) {
		Movie mv = new Movie("추격자", 7, 5, "스릴러");
		mv.setTotalScore(5);
		mv.setTotalScore(3);
		mv.setTotalScore(1);
		mv.setTotalScore(1);
		mv.getInformation();
		System.out.println("=============");
		Performance pfm = new Performance("지킬앤하이드", 9, 10, "드라마");
		pfm.setTotalScore(5);
		pfm.setTotalScore(5);
		pfm.setTotalScore(2);
		pfm.setTotalScore(5);
		pfm.setTotalScore(3);
		pfm.getInformation();
		
	}

}
