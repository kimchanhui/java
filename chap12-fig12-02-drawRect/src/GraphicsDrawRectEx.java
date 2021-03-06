import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class GraphicsDrawRectEx extends JFrame {
	private MyPanel panel = new MyPanel();

	public GraphicsDrawRectEx() {
		setTitle("drawRect");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);

		setSize(200, 170);
		setVisible(true);
	}

	class MyPanel extends JFrame {
		public void paintComponents(Graphics g) {
			super.paintComponents(g);
			g.setColor(Color.RED);
			g.drawRect(20, 20, 80, 80);
		}
	}

	public static void main(String[] args) {
		new GraphicsDrawRectEx();
	}

}
