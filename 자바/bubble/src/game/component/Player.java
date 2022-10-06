package game.component;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import game.BubbleFrame;
import game.interfaces.Movable;
import game.service.BackgroundPlayerService;
import game.state.PlayerWay;
import lombok.Getter;
import lombok.Setter;

//new가 가능한 녀석들 : 게임에 존재할 수 있다. (추상메서드를 가질 수  없다)
@Getter
@Setter
public class Player extends JLabel implements Movable {

	BubbleFrame mContext;

	// player 위치상태
	private int x;
	private int y;

	// 움직임 상태 불리언 초기값 false
	// 움직임의 상태를 저장하기위해 변수를 선언함
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;

	// 플레이어의 방향상태 선언과 동시에 초기화
	PlayerWay PWay = PlayerWay.LEFT;

	// 벽에 충돌한 상태
	private boolean leftWallCrash;
	private boolean rightWallCrash;
	private boolean stepOnFloor;

	// 플레이어의 속도 상태
	private final int SPEED = 4;
	private final int JUMPSPEED = 2;

	// 이미지 아이콘 두개 한번에 선언
	private ImageIcon playerR, playerL, playerLDie, playerRDie;

	// 상태 0 살아있다 1 죽었다
	private int state = 0;

	public Player(BubbleFrame mContext) {
		this.mContext = mContext;
		initData();
		setInitLayout();
		new Thread(new BackgroundPlayerService(this)).start();

	}

	private void initData() {
		playerR = new ImageIcon("image/playerR.png");
		playerL = new ImageIcon("image/playerL.png");
		playerRDie = new ImageIcon("image/playerRDie.png");
		playerLDie = new ImageIcon("image/playerLDie.png");

		x = 400;
		y = 535;
		left = false;
		right = false;
		up = false;
		down = false;

	}

	private void setInitLayout() {

		setIcon(playerR); // setIcon : Defines the icon this component will display
		setLocation(x, y);
		setSize(50, 50);

	}

	@Override
	public void left() {
		// System.out.println("left");
		// 이 데이터에 들어오면 레프트 값이 트루가 되고 아래 와일문 작동
		left = true;
		//
		new Thread(new Runnable() {

			@Override
			public void run() {

				while (left && state == 0) {
					setIcon(playerL);
					x -= SPEED;
					setLocation(x, y);
					PWay = PlayerWay.LEFT;
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				left = false;
			}
		}).start(); // 메서드 체이닝

	}

	@Override
	public void right() {
		right = true;
		new Thread(new Runnable() {

			@Override
			public void run() {

				while (right && state == 0) {
					setIcon(playerR);
					x += SPEED;
					setLocation(x, y);
					PWay = PlayerWay.RIGHT;
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				right = false;
			}
		}).start();
	}

	@Override
	public void up() {
		System.out.println("jump");
		up = true;
		new Thread(new Runnable() {

			@Override
			public void run() {
				// 반복 65
				if (state == 0) {

					for (int i = 0; i < 130 / JUMPSPEED; i++) {
						//
						y = y - JUMPSPEED;
						setLocation(x, y);
						try {
							Thread.sleep(5);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					// 업의 상태값을 false로 바꿔줘야함
					up = false;
					down();
				}
			}
		}).start();

	}

	@Override
	public void down() {
		System.out.println("fall");
		down = true;
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (down && state == 0) {
					y = y + JUMPSPEED;
					setLocation(x, y);
					try {
						Thread.sleep(3);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				down = false;
				// 상태값을 다룰 때는 상황이 변화면 확실히 초기화 처리를 하자!

			}
		}).start();
	}

	public void attack() {
		// space를 누를 때 마다 데이터를 올린다
		new Thread(() -> {
			Bubble bubble = new Bubble(mContext);
			// mcontext에 있는 에드 기능을 점연산자를 통해 불러옴
			// 엠컨텍스트 없으면 물방울 안나옴 but 문법검사는 통과함; 주의 1!
			mContext.add(bubble);
			if (PWay == PlayerWay.LEFT) {
				bubble.left();
			} else {
				bubble.right();
			}
		}).start();
	}

	public void die() {
		new Thread(() -> {

			setState(1);
			setIcon(PlayerWay.RIGHT == PWay ? playerRDie : playerLDie);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			mContext.remove(this); // 프레임에서 지우기
			mContext.repaint();

		}).start();

	}
}
