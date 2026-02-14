package test;

public class ObjectManager {

	Knight black;
	Knight white;


	public ObjectManager(Knight black, Knight white) {
		this.black = black;
		this.white = white;
	}
	public void update() {
		white.update();
		black.update();
		checkCollisions();
	}
	public void checkCollisions() {
		if(black.collisionBox.intersects(white.collisionBox)) {
			if (black.stabbing && !white.stabbing) {
				white.isActive = false;
				System.out.println("White is gone");
				
			}
			else if (white.stabbing && !black.stabbing) {
				black.isActive = false;
				System.out.println("Black is gone");

			}

		}
	}














}

