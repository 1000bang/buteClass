package io_ex.ch05;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainTest extends JFrame implements ActionListener {
	JButton writeButton = new JButton("추가하기");
	JButton readButton = new JButton("불러오기");
	JButton searchButton = new JButton("검색하기");
	JLabel label1 = new JLabel("전화번호부 목록");
	JLabel label2 = new JLabel("입력창");
	JLabel label3 = new JLabel("전화번호부");
	static JTextArea textArea = new JTextArea(); // 메서드에서 사용하기 위해 static
	JTextField indexTextField = new JTextField("index num");
	JTextField nameTextField = new JTextField("이름");
	JTextField phoneTextField = new JTextField("전화번호 ");
	JTextField searchTextField = new JTextField("검색할 index num ");

	// 상수화
	final int TEXT_W = 300;
	final int TEXTA_H = 200;
	final int TEXT_H = 20;
	final int BUTTON_W = 100;
	final int BUTTON_H = 50;
	final int TEXT_X = 50;
	final int BUTTON_X = 360;

	// map 계열선언 & 초기화
	HashMap<String, List> phoneBookMap = new HashMap<>();

	public MainTest() {
		initDate();
		setInitLayout();
		addActionListener();
	}

	private void initDate() {
		setSize(500, 500);
		setTitle("전화번호부");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(null);

		// 셋사이즈
		textArea.setSize(TEXT_W, TEXTA_H);
		indexTextField.setSize(TEXT_W, TEXT_H);
		nameTextField.setSize(TEXT_W, TEXT_H);
		phoneTextField.setSize(TEXT_W, TEXT_H);
		searchTextField.setSize(TEXT_W, TEXT_H);
		writeButton.setSize(BUTTON_W, BUTTON_H);
		readButton.setSize(BUTTON_W, BUTTON_H);
		searchButton.setSize(BUTTON_W, BUTTON_H);
		label1.setSize(100, 15);
		label2.setSize(50, 15);
		label3.setSize(200, 50);
		label3.setFont(new Font("Serif", Font.BOLD, 24));
		label3.setForeground(Color.BLUE);

		// 셋로케
		textArea.setLocation(TEXT_X, 90);
		indexTextField.setLocation(TEXT_X, 330);
		nameTextField.setLocation(TEXT_X, 360);
		phoneTextField.setLocation(TEXT_X, 390);
		searchTextField.setLocation(TEXT_X, 420);
		writeButton.setLocation(BUTTON_X, 330);
		readButton.setLocation(BUTTON_X, 390);
		searchButton.setLocation(BUTTON_X, 270);
		label1.setLocation(40, 70);
		label2.setLocation(40, 310);
		label3.setLocation(170, 10);

		// 에
		add(textArea);
		add(indexTextField);
		add(nameTextField);
		add(phoneTextField);
		add(searchTextField);
		add(writeButton);
		add(readButton);
		add(searchButton);
		add(label1);
		add(label2);
		add(label3);
		repaint();
	}

	private void addActionListener() {
		writeButton.addActionListener(this);
		readButton.addActionListener(this);
		searchButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new Thread(() -> {

			if (e.getSource() == writeButton) {
				write("PhoneBook", indexTextField.getText() + " / ");
				write("PhoneBook", nameTextField.getText() + " / ");
				write("PhoneBook", phoneTextField.getText() + "\n");

				// 리스트의 위치 중요!! 지역변수로 사용해야 함 멤버변수면 이전데이터도 다들어감
				List<String> list = new ArrayList<>();
				list.add(nameTextField.getText());
				list.add(phoneTextField.getText());

				// 맵계열에 key와 벨류로 리스트를 넣음
				phoneBookMap.put(indexTextField.getText(), list);
				textArea.setText(indexTextField.getText() + "번 추가되었습니다");
			} else if (e.getSource() == readButton) {
				read("PhoneBook");
			}
			if (e.getSource() == searchButton) {
				textArea.setText(phoneBookMap.get(searchTextField.getText()).toString());
				if (phoneBookMap.containsKey(searchTextField) == true) {
					searchTextField.setText("데이터 있음");
				}else {
					searchTextField.setText("데이터 없음");
				}
			}

		}).start();

	}

	public static void copy(String readData, String writeData) {
		try (FileReader fr = new FileReader(readData)) {
			try (FileWriter fw = new FileWriter(writeData)) {
				int i;
				while ((i = fr.read()) != -1) {

					fw.write((char) i);
				}
			}
		} catch (Exception e) {
			System.out.println("에러");
		}

	}

	// read 메서드
	public static void read(String readData) {
		try (FileReader fr = new FileReader(readData)) {
			int i;
			String a = ">>전화번호<< \n";
			while ((i = fr.read()) != -1) {
				// string 으로 받기위해 a의 값을 더해줌
				a = a + (char) i;
			}
			// 텍스트 에리어 화면에 띄움
			textArea.setText(a);
		} catch (Exception e) {
			System.out.println("에러");
		}

	}

//write 메서드 
	public static void write(String writeData, String data) {
		try (FileWriter fw = new FileWriter(writeData, true)) {
			fw.write(data);
		} catch (Exception e) {
			System.out.println("에러");
		}
	}

	// 메인 스레드 시작
	public static void main(String[] args) {
		new MainTest();
	}

}