package test.ex08;

import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Enemy extends JLabel implements Movable {

	// 이미지 선언
	private ImageIcon enemyR;
	private ImageIcon enemyL;
	// 좌표값 선언
	private int x;
	private int y;

	// 레프트 라이트 선언
	boolean left;
	boolean right;
	boolean down;

	public Enemy() {
		initData();
		setInitLayout();
		new Thread(new BackgoundEnemyService(this)).start(); 

	}

	private void initData() {
		enemyR = new ImageIcon("image/enemyR.png");
		enemyL = new ImageIcon("image/enemyL.png");
		x = 720;
		y = 175;
		left = false;
		right = false;
		down = false;

	}

	private void setInitLayout() {
		setIcon(enemyR);
		setLocation(x, y);
		setSize(50, 50);

	}

	@Override
	public void left() {
		left = true;
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (left) {
					setIcon(enemyL);
					x -= 10;
					setLocation(x, y);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				repaint();
				left = false;
				right();
			}
		}).start();

	}

	@Override
	public void right() {
		right = true;
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (right) {
					setIcon(enemyR);
					x += 10;
					setLocation(x, y);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				repaint();
				right = false;
				left();
			}
		}).start();

	}

	@Override
	public void up() {
	}

	@Override
	public void down() {
		down = true;
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (down) {
					y = y + 10;
					setLocation(x, y);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				down = false;
			}
		}).start();
	}

}
