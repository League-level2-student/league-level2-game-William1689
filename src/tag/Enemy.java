package tag;

import java.awt.Color;
import java.awt.Graphics;

public class Enemy extends GameObject {

	public Enemy(int x, int y, int width, int height, Color color) {
		super(x, y, width, height, color);
		speed = 8;
	}
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillOval(x, y, width, height);
}
}