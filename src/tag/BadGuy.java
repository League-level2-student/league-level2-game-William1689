package tag;
import java.awt.Color;
public class BadGuy extends GameObject {

Color color;

	public BadGuy(int x, int y, int width, int height, int speed,Color color){
		super(x, y, width, height);
		this.color = color;
		speed = 8;
	}








}
