import java.awt.Dimension;

import javax.swing.JFrame;

public class BlobBattle {

	public static final int WIDTH = 1000;
	public static final int HEIGHT = 800;
	JFrame frame;
	JPanel panel;

	public BlobBattle() {
		frame = new JFrame();
		panel = new JPanel();
	}
	public void setup() {
		frame.add(panel);
		frame.setVisible(true);
		panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addKeyListener(panel);
	}






	public static void main(String[] args) {
		BlobBattle game = new BlobBattle();
		game.setup();
	}

}
