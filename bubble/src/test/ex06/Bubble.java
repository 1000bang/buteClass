package test.ex06;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bubble extends JLabel {

	//의존성 컴포지션 관계
	Player player;
	
	// bubble의 위치 좌표
	private int x;
	private int y;

	// 움직임 상태
	private boolean left;
	private boolean right;
	private boolean up;
	
	//적군을 맞춘 상태
	private int state; //0 (물방울), 1(적을 가둔 물방울)
	

	// 버블 이미지
	private ImageIcon bubble;  //물방울
	private ImageIcon bubbled;  // 적을 가둔 물방울
	private ImageIcon bomb, none; // 물방울 터진 이미지

	
	//버블생성자에 매개변수로 플레이어를 받아 플레이어의 좌표를 받음
	public Bubble(Player player) {
		this.player = player;
		initData();
		setInitLayout();
	}

	private void initData() {

		bubble = new ImageIcon("image/bubble.png");
		bubbled = new ImageIcon("image/bubbled.png");
		bomb = new ImageIcon("image/bomb.png");
	
		left = false;
		right = false;
		up = false;
		state = 0;

	}

	private void setInitLayout() {
		//버블생성자에 매개변수로 플레이어를 받아 플레이어의 좌표를 받음
		x = player.getX() + 50;
		y = player.getY();
		//setIcon(none);
		setIcon(bubble);
		setLocation(x, y);
		setSize(50, 50);
	}


}
