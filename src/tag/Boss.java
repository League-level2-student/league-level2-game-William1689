package tag;

import java.awt.Color;
import java.awt.Graphics;

public class Boss extends GameObject {

	public Boss(int x, int y, int width, int height, Color color) {
		super(x, y, width, height,color);
		
	
}
public void update() {
	super.update();
}
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillOval(x, y, width, height);
}

}
