package tag;

import java.awt.Color;
import java.awt.Graphics;

public class Enemy extends GameObject {

	public Enemy(int x, int y, int width, int height) {
		super(x, y, width, height, Color.RED);
		speed = 8;
	}
	public void update() {
		y=(y+=speed);
		super.update();
	}
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillOval(x, y, width, height);
}
}
