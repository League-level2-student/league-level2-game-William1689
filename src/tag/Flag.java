  package tag;
import java.awt.Color;
import java.awt.Graphics;
public class Flag extends GameObject {

Color color;

	public Flag(int x, int y, int width, int height,Color color){
		super(x, y, width, height);
		this.color = color;
		
	}

	public void draw(Graphics g) {
		g.setColor(color);
		g.fillOval(x, y, width, height);

	
	}






}
