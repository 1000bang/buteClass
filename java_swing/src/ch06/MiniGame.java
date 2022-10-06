package ch06;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MiniGame extends JFrame implements KeyListener {

	final int FRAME_WIDTH = 600;
	final int FRAME_HEIGHT = 850;
	int playerX = 200;
	int playerY = 200;
	boolean flag = true;
	BufferedImage backgroundImage;
	BufferedImage playerImage;
	BufferedImage shot;
	BufferedImage shotOk;
	BufferedImage backgroundImage2;
	BufferedImage currentImage;
	MyDrawPanel mydrawpanel;

	public MiniGame() {
		initData();
		setInitLayout();
		addEventListener();

	}

	private void initData() {
		setTitle("minigame");
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			currentImage = ImageIO.read(new File("images/background2.png"));
			backgroundImage = ImageIO.read(new File("images/background2.png"));
			backgroundImage2 = ImageIO.read(new File("images/background3.png"));

			playerImage = ImageIO.read(new File("Plane.png"));
			shotOk = ImageIO.read(new File("shot.png"));

		} catch (IOException e) {
			System.out.println("파일명 및 경로 확장자 확인하기 ");
			System.exit(0); // 프로그램 자동종료
		}

		mydrawpanel = new MyDrawPanel();

	}

	private void setInitLayout() {
		setVisible(true);
		this.add(mydrawpanel);

	}

	private void addEventListener() {
		this.addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if (keyCode == KeyEvent.VK_LEFT) {
			//
			playerX = (playerX < 0) ? -10 : playerX - 10;
			// playerX -= 10;

		} else if (keyCode == KeyEvent.VK_RIGHT) {
			playerX = (playerX < FRAME_WIDTH-100) ?  playerX + 10 : 500 ;
			// playerX += 10;

		} else if (keyCode == KeyEvent.VK_UP) {
			playerY = (playerY < 0)? -10 : playerY- 10 ;
		//	playerY -= 10;

		} else if (keyCode == KeyEvent.VK_DOWN) {
			 playerY = (playerY < FRAME_HEIGHT - 100 )? playerY + 10 : 750;
			playerY += 10;
		} else if (keyCode == KeyEvent.VK_SPACE) {
			flag = !flag;
			System.out.println(flag);
			if (flag == false) {
				this.currentImage = backgroundImage2;
			} else {
				this.currentImage = backgroundImage;
			}
		} else if (keyCode == KeyEvent.VK_0) {
			System.out.println("0");
			flag = !flag;
			if (flag == false) {
				this.shot = shotOk;
			} else {
				this.shot = null;
			}
		}

		repaint();

		// 그림을 다시 그려주다 중요

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	private class MyDrawPanel extends JPanel {

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(backgroundImage, 0, 0, FRAME_WIDTH, FRAME_HEIGHT, null);
			g.drawImage(backgroundImage2, 0, 0, FRAME_WIDTH, FRAME_HEIGHT, null);
			g.drawImage(currentImage, 0, 0, FRAME_WIDTH, FRAME_HEIGHT, null);
			g.drawImage(playerImage, playerX, playerY, 100, 100, null);
			g.drawImage(shot, playerX + 25, playerY - 50, 50, 50, null);

		}

	}// end of DrawPanel class
public static void main(String[] args) {
	new MiniGame();
}
}
