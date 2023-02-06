package homework230206;

public class Application02 {

	public static void main(String[] args) {
		RPGgame rGame = new RPGgame(0);
		rGame.leftUpButton();
		rGame.rightUpButton();
		rGame.changeMode();
		rGame.rightUpButton();
		rGame.rightDownButton();
		rGame.leftDownButton();
		rGame.changeMode();
		rGame.rightDownButton();
		System.out.println("====================");
		ArcadeGame aGame = new ArcadeGame(0);
		aGame.leftUpButton();
		aGame.rightUpButton();
		aGame.leftDownButton();
		aGame.changeMode();
		aGame.rightUpButton();
		aGame.leftUpButton();
		aGame.rightDownButton();
	}

}
