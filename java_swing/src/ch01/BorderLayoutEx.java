package ch01;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame {

	
	private String[] name = {"동", "서", "남", "북", "센터"};
	//private String[] arr = {"BorderLayout.EAST", "BorderLayout.WEST", "BorderLayout.SOUTH", "BorderLayout.NORTH", "BorderLayout.CENTER"};
	private String[] arr = {BorderLayout.EAST, BorderLayout.WEST, BorderLayout.SOUTH, BorderLayout.NORTH, BorderLayout.CENTER};

	
	ArrayList<JButton> buttons = new ArrayList<>();
	
	private BorderLayout borderLayout;

	public BorderLayoutEx() {
		initDate();
		setInitLayout();

	}

	private void initDate() {
		setTitle("border Layout 연습");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//JButton 초기화 완료됨 (멤버변수로 처리)
		borderLayout = new BorderLayout();
		for(int i = 0; i  < 5; i++) {
			buttons.add(new JButton(name[i]));
		}
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(borderLayout);
	//프레임에 add하는 동작만 시켜주면됨
		for(int i = 0; i  < name.length; i++) {
			add(buttons.get(i), arr[i]);
		}

		
//		add(button1, BorderLayout.EAST);
//		밑에꺼 안됨		
//		borderLayout.addLayoutComponent(button2, borderLayout.WEST);
//		borderLayout.addLayoutComponent(button3, borderLayout.SOUTH);
//		borderLayout.addLayoutComponent(button4, borderLayout.NORTH);
//		borderLayout.addLayoutComponent(button5, borderLayout.CENTER);

	}

	
	
	public static void main(String[] args) {
		new BorderLayoutEx();
		
	}// end of main
}
