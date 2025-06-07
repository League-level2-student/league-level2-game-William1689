package tag;

import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject {


public Projectile(int x, int y, int width, int height) {
	super(x,y,width,height, Color.BLACK);
	speed = 10;
	
}
public void update() {
y=(y-=speed);
	super.update();
}
public void draw(Graphics g) {
	g.setColor(color);
	g.fillOval(x, y, width, height);
	











}


}
