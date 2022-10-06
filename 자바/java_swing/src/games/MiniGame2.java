package games;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.EventListener;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MiniGame2 extends JFrame implements ActionListener {

	JButton button1 = new JButton("START");
	JButton button2 = new JButton("STOP");
	JPanel panel = new JPanel();
	BufferedImage background;
	BufferedImage player;
	BufferedImage shot;

	ImagePanel imagePanel;
	int player_X = 50;
	int player_Y = 100;
	int shotX = player_X + 25;
	int shotY = player_Y - 50;

	boolean flag = true;

	public MiniGame2() {
		initDate();
		setInitLayout();
		addEventListener();

	}

	private void initDate() {
		setTitle("가나다");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			background = ImageIO.read(new File("images/background2.png"));
			player = ImageIO.read(new File("images/Plane.png"));
			shot = ImageIO.read(new File("images/shot.png"));

		} catch (IOException e) {
			e.printStackTrace();
		}
		imagePanel = new ImagePanel();
	}

	private void setInitLayout() {
		setVisible(true);
		setResizable(false);
		this.setLayout(new BorderLayout());
		this.add(panel, BorderLayout.SOUTH);
		this.add(imagePanel, BorderLayout.CENTER);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		panel.add(button1);
		panel.add(button2);

	}

	private void addEventListener() {
		button1.addActionListener(this);
		button2.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		System.out.println(button1.getText());
		System.out.println(button2.getText());
		System.out.println(button.getText());
		if (button.getText().equals(button1.getText())) {
			Thread thread = new Thread(imagePanel);
			flag = true;
			thread.start();
		} else if (button.getText().equals(button2.getText())) {
			Thread thread = new Thread(imagePanel);
			flag = false;
			thread.start();
		}
	}

	private class ImagePanel extends JPanel implements Runnable {

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(background, 0, 0, getWidth(), getHeight(), null);
			g.drawImage(player, player_X, player_Y, 100, 100, null);
			g.drawImage(shot, shotX, shotY - 50, 50, 50, null);

		}

		@Override
		public void run() {
			boolean direction = true;
			while (flag) {
				if (direction == true) {
					player_X += 10;

				} else {
					player_X -= 10;
				}
				if (player_X == 500) {
					direction = false;
				}
				if (player_X == 100) {
					direction = true;
				}
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				repaint();
			}
			System.out.println("꿑");
			// end of while
		}// end of run
	} // end of panel

	public static void main(String[] args) {
		new MiniGame2();
	}// end of main

}
