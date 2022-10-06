package test.ex10;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bubble extends JLabel implements Movable {

	// 컨텍스트 정보를 들고 올 수 있다. 부모의 정보를 들고올 수 있다
	private BubbleFrame mContext;

	// 의존성 컴포지션 관계
	Player player;
	BackgroundBubbleService backgroundBubbleService;
	// 버블에 위치 상태
	private int x;
	private int y;

	// 움직임 상태
	private boolean left;
	private boolean right;
	private boolean up;

	// 적군을 맞춘 상태
	private int state; // 0(물방울) , 1, (적을 가둔 물방울)

	private ImageIcon bubble; // 물방울
	private ImageIcon bubbled; // 적을 가둔 물방울
	private ImageIcon bomb; // 물발울이 터진 상태

	public Bubble(BubbleFrame mContext) {
		this.player = mContext.getPlayer();
		this.mContext = mContext;
		initData();
		setInitLayout();
	}

	private void initData() {
		backgroundBubbleService = new BackgroundBubbleService(this);
		bubble = new ImageIcon("image/bubble.png");
		bubbled = new ImageIcon("image/bubbled.png");
		bomb = new ImageIcon("image/bomb.png");
		left = false;
		right = false;
		up = false;
		state = 0;
	}

	private void setInitLayout() {
		// 플레이어가 있는 위치에서 태어 나야 한다.
		x = player.getX();
		y = player.getY();
		setIcon(bubble);
		setSize(50, 50);
		setLocation(x, y);
	}

	@Override
	public void left() {
		left = true;
		for (int i = 0; i < 400; i++) {

			x--;
			setLocation(x, y);

			if (backgroundBubbleService.leftWall()) {
				break;
			}

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		up();
	}

	@Override
	public void right() {
		right = true;
		for (int i = 0; i < 400; i++) {
			x++;
			setLocation(x, y);
			if (backgroundBubbleService.rightWall()) {
				break;
			}
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("123");
		up();

	}

	@Override
	public void up() {
		up = true;
		System.out.println("dsfa");

		while (true) {
			System.out.println("1234");
			y--;
			setLocation(x, y);
			if (backgroundBubbleService.topWall()) {
				break;
			}
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		System.out.println("sd");
		clearBubble();
	}

//행위 -> clear(동사) -> bubble(목적어)
	public void clearBubble() {
		try {
			Thread.sleep(3000);
			System.out.println("123");
			setIcon(bomb);
			// 버블 프레임의 버블 객체를 메모ㄹㅣ에서 소멸
			Thread.sleep(500);
			mContext.remove(this); // 메모리에서 내리기
			mContext.repaint();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// bomb

	}
}
