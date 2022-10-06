package games;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

	BufferedImage background;
	BufferedImage player;
	BufferedImage player2;
	ImagePanel imagePanel;
	int player_X = 100;
	int player_Y = 350;
	int player2_X = 140;
	int player2_Y = 60;
	boolean flag = true;

	public MainFrame() {
		initData();
		setInitLayout();
		addEventListener();
		Thread thread = new Thread(imagePanel);
		thread.start();
	}

	private void initData() {
		setTitle("쓰레드를 활용한 미니게임");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			background = ImageIO.read(new File("background3.png"));
			player = ImageIO.read(new File("player2.png"));
			player2 = ImageIO.read(new File("mairo_right.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		imagePanel = new ImagePanel();
	}

	private void setInitLayout() {
		setVisible(true);
		setResizable(true);
		add(imagePanel);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				if (code == KeyEvent.VK_UP) {
					player_Y -= 10;
				} else if (code == KeyEvent.VK_DOWN) {
					player_Y += 10;
				} else if (code == KeyEvent.VK_LEFT) {
					player_X -= 10;
				} else if (code == KeyEvent.VK_RIGHT) {
					player_X += 10;
				} else if (code == KeyEvent.VK_SPACE) {
					flag = !flag;
				}

				if (((player_X >= player2_X - 10) && (player_X <= player2_X + 10))
						&& ((player_Y >= player2_Y - 10) && (player_Y <= player2_Y + 10))) {
					player2 = null;
				}
				// repaint();
			}

		});
	}
//내부클래스 생성

	private class ImagePanel extends JPanel implements Runnable {

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(background, 0, 0, getWidth(), getHeight(), null);
			g.drawImage(player, player_X, player_Y, 100, 100, null);
			g.drawImage(player2, player2_X, player2_Y, 50, 50, null);

		}

		@Override
		public void run() {
			// 1. 왔다갔다 반복 처리 횟수지정 x while
			// true : 오른쪽으로 가고있는 상황
			// false : 왼쪽으로 가고 있는 상황

			boolean flag2 = true;

			while (true) {
				if (flag) {
					try {
						if (flag2 == true) {
							player2_X += 10;
							if (player2_X >= 400) {
								flag2 = false;
							}
						} else {
							player2_X -= 10;
							if (player2_X <= 140) {
								flag2 = true;
							}
						}
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					// + 10 이동후 그리기를 계속 반복
					repaint();
				} // end of while
			}
			// 만약 direction true면 x좌표 증가
			// 아니라면 false x좌표를 감소
//			boolean direction = true;
//			while (flag) {
//				if (direction == true) {
//					player_X += 10;
//				} else {
//					player_X -= 10;
//				}
//
//				// 만약 x좌표가 500보다 크다면 direction false변경
//				// 그리고 x좌표가 100보다 작다면 direction true로 변경
//				if (player_X >= 500) {
//					direction = false;
//				}
//				if (player_X == 100) {
//					direction = true;
//				}
//				try {
//					Thread.sleep(100);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				repaint();
//
//			} // end of run

		}
	}

	public static void main(String[] args) {

		new MainFrame();
	}
}
