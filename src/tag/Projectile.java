package tag;

import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject {


public Projectile(int x, int y, int width, int height, Color color) {
	super(x,y,width,height, color);
	speed = 10;
	
}
public void draw(Graphics g) {
	g.setColor(color);
	g.fillOval(x, y, width, height);
	











}


}
