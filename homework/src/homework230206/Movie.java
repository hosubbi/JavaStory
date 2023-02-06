package homework230206;

public class Movie extends Culture{
	String genre;
	

	public Movie(String title, int directorCount, int actorCount, String Genre) {
		super(title,directorCount,actorCount);
		this.genre = genre;
	}
	
	@Override
	public void getInformation() {
		System.out.println("영화제목 : " + title);
		System.out.println("감독 : " + directorCount);
		System.out.println("배우 : " + actorCount);
//		System.out.println("관객수 : " + audienceCount);
		System.out.println("영화총점 : " + totalScore);
		System.out.print("영화평점 : ");
		super.getGrade();
	}
	
	
}
