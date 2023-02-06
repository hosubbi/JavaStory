package homework230206;

public abstract class Culture {
	String title;
	int directorCount;
	int actorCount;
	int audienceCount = 0;
	int totalScore = 0;

	
	public Culture (String title, int directorCount, int actorCount) {
			this.title = title;
			this.directorCount = directorCount;
			this.actorCount = actorCount;
	}
	public void setTotalScore(int score) {
		totalScore += score;		
		audienceCount += 1;
	}
	public void getGrade() {
		int result = (int)(totalScore/audienceCount);
		if(result >= 5) {
			System.out.println("☆☆☆☆☆");
		}else if(result >= 4) {
			System.out.println("☆☆☆☆");
		}else if(result >= 3) {
			System.out.println("☆☆☆");
		}else if(result >= 2) {
			System.out.println("☆☆");
		}else if(result >= 1) {
			System.out.println("☆");
		}
		
	}

	public abstract void getInformation();
		
}
