package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx3 extends JFrame {

	// 배열로 만들어서 코드를 수정
	// 생성시 for문 활용
	// 정가운데에배치를 해주세요

	JButton[] button = new JButton[7];
	private FlowLayout flowLayout;

	public FlowLayoutEx3() {
		initData();
		setInitLayout();
	}

	// 초기화 과정(값을 넣거나 클래스를 메모리에 올리는 과정)
	private void initData() {
		setTitle("FlowLayout 연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		for (int i = 0; i < button.length; i++) {
			button[i] = new JButton("button" + (i + 1));
		}
		flowLayout = new FlowLayout(FlowLayout.CENTER, 0, 210);

	}

	// GUI 프로그래밍에서 레이아웃을 설정하는 코드
	private void setInitLayout() {
		setVisible(true);
		// 레이아웃 관리자 setLayout
		setLayout(flowLayout);
		for (int i = 0; i < button.length; i++) {
			add(button[i]);
		}

	}

	public static void main(String[] args) {

		new FlowLayoutEx3();
	}

}
