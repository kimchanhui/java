import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageDrawPracticeFrame extends JFrame {
	public ImageDrawPracticeFrame() {
		super(" ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setContentPane(new MyPanel());
		setSize(300, 300);
		setVisible(true);
		getContentPane().addMouseListener(new java.awt.event.MouseAdapter() {
			int n = 10;

			public void mousePressed(java.awt.event.MouseEvent e) {
				if (e.getButton() == java.awt.event.MouseEvent.BUTTON1)
					n += 5;
				else
					n -= 5;
				changeFontRecursive((java.awt.Container) e.getSource(),
						new java.awt.Font("Gothic", java.awt.Font.PLAIN, n));
			}

			private void changeFontRecursive(java.awt.Container root, java.awt.Font font) {
				for (java.awt.Component c : root.getComponent()) {
					c.setFont(font);
					if (c instanceof java.awt.Container) {
						changeFontRecursive((java.awt.Container) c, font);
					}
				}
			}
		});

	}

	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/back.jpg");
		private Image img = icon.getImage();

		public MyPanel() {
			setLayout(new FlowLayout());
			add(new JButton("Hide/show"));
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		}

	}

	public static void main(String[] args) {
		new ImageDrawPracticeFrame();
	}

}
