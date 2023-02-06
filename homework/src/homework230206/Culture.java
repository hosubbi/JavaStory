package homework230206;

public abstract class Culture {
	String title;
	int directorCount;
	int actorCount;
	int audienceCount;
	int totalScore;

	public Culture (String title, int directorCount, int actorCount, int audienceCount, int totalScore) {
			this.title = title;
			this.directorCount = directorCount;
			this.actorCount = actorCount;
			this.audienceCount = audienceCount;
			this.totalScore = totalScore;
	}
	public void setTotalScore(int score) {
		totalScore += score;
		audienceCount += 1;
	}
//	public String getGrade() {
//		int result = (totalScore/audienceCount);
//		return result;
////		swich(result) {
////			case 1:
////				System.out.println("☆");
////				break;
////			case 2:
////				pirntln("☆☆");
////				break;
////			cese 3:
////				break;
////			case 4:
////				break;
////			case 5:
////				break;
////				
////			
////		}
//	}
	
	public abstract void getInformation();
//		System.out.println("영화제목 : " + title);
//		System.out.println("감독 : " + directorCount);
//		System.out.println("배우 : " + actorCount);
//		System.out.println("영화총점 : " + totalScore);
//		System.out.println("영화평점 : " + getGrade());
		
}
