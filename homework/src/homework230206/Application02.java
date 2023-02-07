package homework230206;

public class Application02 {

	public static void main(String[] args) {
		Keypad rGame = new RPGgame();
		rGame.leftUpButton();
		rGame.rightUpButton();
		rGame.changeMode();
		rGame.rightUpButton();
		rGame.rightDownButton();
		rGame.leftDownButton();
		rGame.changeMode();
		rGame.rightDownButton();
		System.out.println("====================");
		Keypad aGame = new ArcadeGame();
		aGame.leftUpButton();
		aGame.rightUpButton();
		aGame.leftDownButton();
		aGame.changeMode();
		aGame.rightUpButton();
		aGame.leftUpButton();
		aGame.rightDownButton();
	}

}
