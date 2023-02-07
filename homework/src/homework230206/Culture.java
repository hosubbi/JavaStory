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
		audienceCount++; // audienceCount += 1;
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
	
	/* 첫번째 방법
	 * public String getGrade() {
		int avg = totalScore/audienceCount;
		String grade = "";
		switch (avg) {
		case 1:
			grade = "☆"
			break;
		case 2:
			grade = "☆☆"
			break;
		case 3:
			grade = "☆☆☆"
			break;
		case 4:
			grade = "☆☆☆☆"
			break;
		case 5:
			grade = "☆☆☆☆☆"
			break;
		}
		return grade;
	}
		두번째 방법
		for(int i = 0; i<avg; i++) {
			grade += "☆"
		}
		return grade;
	}

	*/
	public abstract void getInformation();
		
}
