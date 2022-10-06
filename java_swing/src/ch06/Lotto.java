package ch06;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Lotto extends JFrame implements ActionListener {

	JButton button;
	JButton button2;
	JTextArea area;
	JTextArea area2;
	JPanel centerPanel;
	JPanel bottomPanel;
	JPanel topPanel;

	public Lotto() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("Lotto");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("추첨");
		button2 = new JButton("종료");
		area = new JTextArea();
		area2 = new JTextArea();

		bottomPanel = new JPanel();
		topPanel = new JPanel();
		centerPanel = new JPanel();
	}

	private void setInitLayout() {
		setVisible(true);
		setResizable(false);
		setLayout(null);
		this.setLayout(new GridLayout(3, 1));
		this.add(topPanel);
		this.add(centerPanel);
		this.add(bottomPanel);

		centerPanel.setLayout(null);
		topPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		topPanel.setSize(600, 100);
		area2.setSize(250, 50);
		area2.setLocation(170, 50);
		area.setSize(250, 50);
		area.setLocation(180, 200);

		area.setFont(new Font("SanSerif", Font.BOLD, 25)); 
		area2.setText(" 로또 번호 추첨하기 ");
		area2.setFont(new Font("SanSerif", Font.BOLD, 25));

		centerPanel.setBackground(Color.LIGHT_GRAY);
		area.setBackground(Color.lightGray);

		centerPanel.add(area);
		topPanel.add(area2);

		// area.setAlignmentX(JTextArea.CENTER_ALIGNMENT);

		bottomPanel.add(button);
		bottomPanel.add(button2);

	}

	private void addEventListener() {
		button.addActionListener(this);
		button2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton Button = (JButton) e.getSource();
		if (Button.getText().equals(button.getText())) {
			System.out.println("button1 추첨");

			Random random = new Random();
			int[] lottoNum = new int[6];
			// 로또 번호추첨
			for (int i = 0; i < 6; i++) {
				lottoNum[i] = random.nextInt(45) + 1;
				// 중복 시 위에꺼 다시실행
				for (int j = 0; j < i; j++) {
					if (lottoNum[i] == lottoNum[j]) {
						i--;
					} // 오름차순
					if (lottoNum[i] < lottoNum[j]) {
						int slot = lottoNum[i];
						lottoNum[i] = lottoNum[j];
						lottoNum[j] = slot;
					}
				}
			}
			area.setText(" " + lottoNum[0]);

			for (int i = 1; i < 6; i++) {
				area.append(", " + lottoNum[i]);
			}

		} else {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new Lotto();
	}

}
