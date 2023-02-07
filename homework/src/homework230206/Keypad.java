package homework230206;

public interface Keypad {
	public int NORMAL_MODE = 0;  //public static final int
	public int HARD_MODE = 1; //public static final int 
	
	public abstract void leftUpButton();
	public abstract void leftDownButton();
	public abstract void rightUpButton();
	public abstract void rightDownButton();
	public abstract void changeMode();
}
