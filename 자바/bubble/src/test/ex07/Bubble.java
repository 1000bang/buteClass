package test.ex07;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bubble extends JLabel implements Movable {

	// 의존성 컴포지션 관계
	Player player;

	// bubble의 위치 좌표
	private int x;
	private int y;

	// 움직임 상태
	private boolean left;
	private boolean right;
	private boolean up;

	// 적군을 맞춘 상태
	private int state; // 0 (물방울), 1(적을 가둔 물방울)

	// 버블 이미지
	private ImageIcon bubble; // 물방울
	private ImageIcon bubbled; // 적을 가둔 물방울
	private ImageIcon bomb, none; // 물방울 터진 이미지

	public Bubble(Player player) {
		this.player = player;
		initData();
		setInitLayout();
		initThread();
	}

	private void initData() {
		new Thread(new BackgroundBubbleService(this)).start();
		bubble = new ImageIcon("image/bubble.png");
		bubbled = new ImageIcon("image/bubbled.png");
		bomb = new ImageIcon("image/bomb.png");

		left = false;
		right = false;
		up = false;
		state = 0;

	}

	private void setInitLayout() {
		x = player.getX();
		y = player.getY();
		// setIcon(none);
		setIcon(bubble);
		setLocation(x, y);
		setSize(50, 50);
	}

	private void initThread() {

		new Thread(new Runnable() {

			@Override
			public void run() {

				if (player.getPWay() == PlayerWay.LEFT) {
					left();
				} else {
					right();
				}

//				switch (player.pWay) {
//				case LEFT:
//					left();
//					break;
//				case RIGHT:
//					right();
//				default:
//					break;
//				}

			}
		}).start();

		// 람다표현식
		// 반복적인 표현을 줄이기 위해 식으로 줄여줌
		// 위의 문법이랑 같은 식임
		// 컴파일러가 뭐가 들어올 지 타입 추론이 가능하다

	}

	@Override
	public void left() {
		left = true;
		
			for (int i = 0; i < 400; i++) {
				if (left) {
				x--;
				setLocation(x, y);
				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		up();
	}

	@Override
	public void right() {
		right = true;
		
			for (int i = 0; i < 400; i++) {
				if (right) {
				x++;
				setLocation(x, y);
				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		up();
	}

	@Override
	public void up() {
		up = true;
		while (up) {
			y--;
			setLocation(x, y);
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		up = false;

	}

} // end of bubble
