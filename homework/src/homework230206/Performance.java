package homework230206;

public class Performance extends Culture{
	String genre;

	public Performance(String title, int directorCount, int actorCount, String Genre) {
		super(title,directorCount,actorCount);
		this.genre = genre;
	}
	
	@Override
	public void getInformation() {
		System.out.println("공연제목 : " + title);
		System.out.println("감독 : " + directorCount);
		System.out.println("배우 : " + actorCount);
//		System.out.println("관객수 : " + audienceCount);
		System.out.println("공연총점 : " + totalScore);
		System.out.print("공연평점 : ");
		super.getGrade();
	}
}
