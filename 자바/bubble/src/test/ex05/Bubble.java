package test.ex05;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Bubble extends JLabel {

	Player player;

	// bubble 의 좌표
	private int x;
	private int y;

	// 쏘다 맞추다 터지다
	private boolean shot;
	private boolean hit;
	private boolean bang;

	// 버블 이미지
	private ImageIcon bubble, bubbled, bomb, none;

	public Bubble() {
		initData();
		setInitLayout();
	}

	private void initData() {

		bubble = new ImageIcon("image/bubble.png");
		bubbled = new ImageIcon("image/bubbled.png");
		bomb = new ImageIcon("image/bomb.png");
		player = new Player();

		x = player.getX() + 55;
		y = player.getY();
		shot = false;
		hit = false;
		bang = false;

	}

	private void setInitLayout() {
		setIcon(none);
		setLocation(x, y);
		setSize(50, 50);
	}

	public void shot() {
		shot = true;
		//
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					setIcon(bubble);
					x += 5;
					setLocation(x, y);

					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				setIcon(none);
				shot = false;
			}
		}).start(); // 메서드 체이닝

	}

}
