package tag;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ObjectManager implements ActionListener{
	Player player;
	Player player2;
	ArrayList <Projectile> projectiles;
	
	Random random = new Random();
	public ObjectManager (Player player, Player player2) {
		this.player = player;
		this.player2 = player2;
		this.projectiles = new ArrayList<Projectile>();
		
	}
	public void addProjectile(Projectile projectile) {
		projectiles.add(projectile);
	}
	
	public void update() {
		
		
		for(int i = 0; i<projectiles.size();i++) {
			Projectile p = projectiles.get(i);
			p.update();
			if(p.y<0 || p.y>900 || p.x<0 || p.x>1920) {
				p.isActive = false;
			}
		}

		player.update();
		player2.update();	
	}

	public void draw(Graphics g) {
		player.draw(g);
		player2.draw(g);
		for(int i = 0; i<projectiles.size();i++) {
			projectiles.get(i).draw(g);
		}
		
	}

	public void checkCollisions() {
	
	}
	public void killObjects() {
		


		Iterator<Projectile> iters = projectiles.iterator();
		while(iters.hasNext()) {
			Projectile b = iters.next();
			if(!b.isActive) {
				iters.remove();
			}

		}




	}







	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}
