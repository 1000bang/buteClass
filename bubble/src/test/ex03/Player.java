package test.ex03;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import lombok.Getter;
import lombok.Setter;

//뚝뚝 끊기는 이미지를 쓰레드를 통해 자연스럽게 움직이게 만들기
@Getter
@Setter
public class Player extends JLabel implements Movable {

	// player 위치상태
	private int x;
	private int y;

	// 움직임 상태 불리언 초기값 false
	// 움직임의 상태를 저장하기위해 변수를 선언함
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;

	// 플레이어의 속도 상태
	private final int SPEED = 4;
	private final int JUMPSPEED = 2;

	// 이미지 아이콘 두개 한번에 선언
	private ImageIcon playerR, playerL;

	public Player() {
		initData();
		setInitLayout();

	}

	private void initData() {
		playerR = new ImageIcon("image/playerR.png");
		playerL = new ImageIcon("image/playerL.png");
		x = 400;
		y = 540;
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
		//System.out.println("left");
		// 이 데이터에 들어오면 레프트 값이 트루가 되고 아래 와일문 작동
		left = true;
		//
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (left) {
					setIcon(playerL);
					x -= SPEED;
					setLocation(x, y);
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
				while (right) {
					setIcon(playerR);
					x += SPEED;
					setLocation(x, y);
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
		}).start();

	}

	@Override
	public void down() {
		System.out.println("fall");
		down = true;
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 130 / JUMPSPEED; i++) {
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

}
