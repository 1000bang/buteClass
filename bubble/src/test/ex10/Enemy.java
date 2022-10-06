package test.ex10;

import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Enemy extends JLabel implements Movable {

	private BubbleFrame mContext;

	// 좌표값 선언
	private int x;
	private int y;

	// 적군의방향
	private EnemyWay enemyWay;

	// 적군 속도 상태
	private final int SPEED = 3;
	private final int JUMPSPEED = 1;

	// 레프트 라이트 선언
	private boolean left;
	private boolean right;
	private boolean down;
	private boolean up;

	// 이미지 선언
	private ImageIcon enemyR;
	private ImageIcon enemyL;

	public Enemy(BubbleFrame mContext) {
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
		up = false;
		down = false;

		enemyWay = EnemyWay.LEFT;

	}

	private void setInitLayout() {
		setIcon(enemyL);
		setLocation(x, y);
		setSize(50, 50);

	}

	@Override
	public void left() {
		enemyWay = enemyWay.LEFT;
		left = true;
		new Thread(() -> {
			while (true) {
				// setIcon(enemyL);
				x = x - SPEED;
				setLocation(x, y);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();

	}

	@Override
	public void right() {
		enemyWay = enemyWay.RIGHT;
		right = true;
		new Thread(() -> {
			while (true) {
				setIcon(enemyR);
				x = x + SPEED;
				setLocation(x, y);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();

	}

	@Override
	public void up() {
		up = true;

		new Thread(() -> {
			for (int i = 0; i < 130 / JUMPSPEED; i++) {
				y = y - JUMPSPEED;
				setLocation(x, y);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			up = false;
			down();
		}).start();

	}

	@Override
	public void down() {
		down = true;
		new Thread(new Runnable() {
			@Override
			public void run() {
				// while (down) {
				y = y + JUMPSPEED;
				setLocation(x, y);
				try {
					Thread.sleep(3);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			// }
		}).start();
		down = false;
	}

}
