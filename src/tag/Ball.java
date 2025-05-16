package tag;
import java.awt.Color;
import java.awt.Graphics;
public class Ball extends GameObject {

Color color;

	public Ball(int x, int y, int width, int height,Color color){
		super(x, y, width, height);
		this.color = color;
		
	}

	public void draw(Graphics g) {
		g.setColor(color);
		g.fillOval(x, y, width, height);

	
	}






}
