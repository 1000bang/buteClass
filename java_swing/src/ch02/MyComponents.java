package ch02;

import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyComponents extends JFrame {

	private JButton button1;
	private JLabel label;// 글자를 넣어서 화면에 띄울 수 있다.
	private JTextField textField; // 사용자의 입력값을 받을 수 있는 컴포넌트
	private JPasswordField passwordField; // 사용자의 비번을 받는 컴포넌트 ***
	private JCheckBox checkBox;  //체크 표시

	public MyComponents() {
		initData();
		setInitLayout();
	}
	
	// 세터 메서드가 아닌 그냥 메서드로 해서 string값을 받는다
		public void inputScannerData(String name) {
			this.textField.setText(name);
		}

	private void initData() {
		setTitle("컴포넌트 확인");
		setSize(800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("로그인");
		label = new JLabel("로그인하기");
		textField = new JTextField("아이디 입력  ", 20);
		passwordField = new JPasswordField("비번 입력", 20);
		checkBox = new JCheckBox("동의");
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(null);

		button1.setSize(100, 70);
		button1.setLocation(460, 120);

		label.setSize(150, 30);
		label.setLocation(300, 80);

		textField.setSize(150, 30);
		textField.setLocation(300, 120);

		passwordField.setSize(150, 30);
		passwordField.setLocation(300, 160);

		checkBox.setSize(150, 30);
		checkBox.setLocation(400, 190);

		add(button1);
		add(label);
		add(textField);
		add(passwordField);
		add(checkBox);

	}

}
