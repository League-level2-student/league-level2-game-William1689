  package tag;
import java.awt.Color;
import java.awt.Rectangle;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
	Color color;
	int speed = 0;
	boolean isActive = true;
	Rectangle collisionBox;

	public void update() {
		collisionBox.setBounds(x,y,width,height);
	}




	public GameObject(int x, int y, int width, int height, Color color) {
		this.x =x;
		this.y = y;
		this.width = width;
		this.height = height;
		collisionBox = new Rectangle(x,y,width,height);







	}
}
