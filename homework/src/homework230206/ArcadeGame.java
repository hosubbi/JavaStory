package homework230206;

public class ArcadeGame implements Keypad{
	int mode = NORMAL_MODE;
	
	public ArcadeGame (int mode) {
		this.mode = mode;
		System.out.println("ArcadeGame 실행");
	}

	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 앞쪽으로 이동한다.");		
	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 뒤쪽으로 이동한다.");
	}

	@Override
	public void rightUpButton() {
		if(mode == 0) {
			System.out.println("캐릭터가 일반 공격.");
		}else if(mode == 1) {
			System.out.println("캐릭터가 연속 공격.");
		}
	}

	@Override
	public void rightDownButton() {
		if(mode == 0) {
			System.out.println("캐릭터가 HIT 공격.");
		}else if(mode == 1) {
			System.out.println("캐릭터가 Double HIT 공격.");
		}
	}

	@Override
	public void changeMode() {
		if(mode == 0) {
			mode = 1;
			System.out.println("현재모드 : HARD_MODE");
		}else if(mode == 1){
			mode = 0;
			System.out.println("현재모드 : NORMAL_MODE");
		}		
	}
}
