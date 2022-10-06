package game.component;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import game.BubbleFrame;
import game.interfaces.Movable;
import game.service.BackgoundEnemyService;
import game.state.EnemyWay;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Enemy extends JLabel implements Movable {

	private BubbleFrame mContext;

	// 살아 있는 상태 (0), 물방울에 갇힌 상태 (1)
	private int state;

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
		this.mContext = mContext;
		initData();
		setInitLayout();
		initBackgroundEnemyService();
		// new Thread(new BackgoundEnemyService(this)).start();

	}

	private void initBackgroundEnemyService() {
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
		state = 0;

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
		System.out.println("왼");
		new Thread(() -> {
			while (left) {
				setIcon(enemyL);
				x = x - SPEED;
				setLocation(x, y);
				
				//적군이 움직일 때마다 플레이어의 좌표값을 확인할 수 있다.
				// 그 차이 값이 x <50 && y <50 이면 충돌이야	
				checkingPlayerPosition();

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			left = false;
		}).start();
			
	}

	@Override
	public void right() {
		enemyWay = enemyWay.RIGHT;
		right = true;
		System.out.println("오");
		new Thread(() -> {
			while (right) {
				setIcon(enemyR);
				x = x + SPEED;
				setLocation(x, y);
				checkingPlayerPosition();
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			right = false;
		}).start();

	}

	private void checkingPlayerPosition() {
		if(Math.abs((x - mContext.getPlayer().getX())) < 50 &&
				Math.abs((y - mContext.getPlayer().getY())) < 50 && state == 0) {
			mContext.getPlayer().die();
		}
	}

	@Override
	public void up() {
		up = true;

		new Thread(() -> {
			for (int i = 0; i < 130 / JUMPSPEED; i++) {
				y = y - JUMPSPEED;
				setLocation(x, y);
				checkingPlayerPosition();
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

//	public void kill() {
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				try {
//					if ((Math.abs(x - mContext.getPlayer().getX()) < 50)
//							&& (Math.abs(y - mContext.getPlayer().getY()) < 100)) {
//						
//						System.out.println("dfas");
//						mContext.getPlayer().die();
//					}
//				} catch (Exception e) {
//					System.out.println("123");
//				}
//			}
//		}).start();
//	}

}