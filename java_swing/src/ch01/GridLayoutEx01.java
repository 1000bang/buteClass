package ch01;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx01 extends JFrame {

	private String[] strArr = { "가", "나", "다", "라", "마" };
	ArrayList<JButton> buttons = new ArrayList<>();
	private GridLayout gridLayout;
	private int BUTTON_SIZE = 5;

	public GridLayoutEx01() {
		initData();
		setInitLayout();

	}

	private void initData() {
		setTitle("그리드 레이아웃 연습");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 초기화와 동시에 값을 대입

		for (int i = 0; i < BUTTON_SIZE; i++) {
			buttons.add(new JButton(strArr[i]));
		}

	}

	private void setInitLayout() {
		setVisible(true);
		// rows and columns 행열
		setLayout(new GridLayout(3, 2));
		for (int i = 0; i < BUTTON_SIZE; i++) {
			add(buttons.get(i));
		}

	}

	public static void main(String[] args) {
		new GridLayoutEx01();
	}

}
