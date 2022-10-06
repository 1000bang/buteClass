package ch04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Practice extends JFrame implements ActionListener {

	JButton button1;
	JButton button2;
	JButton button3;
	JPanel panel;
	JPanel panel2;

	public Practice() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setSize(800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("Blue");
		button2 = new JButton("Green");
		button3 = new JButton("Yellow");
		panel = new JPanel();
		panel2 = new JPanel();
	}

	private void setInitLayout() {
		setVisible(true);
		
//		this.setLayout(new BorderLayout());
//		this.add(centerPanel, BorderLayout.CENTER);
//		this.add(bottomPanel, BorderLayout.SOUTH);
//	
//		bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
//		bottomPanel.add(button1);
//		bottomPanel.add(button2);
		
		this.setLayout(new BorderLayout());
		this.add(panel, BorderLayout.SOUTH);
		this.add(panel2, BorderLayout.CENTER);
		
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		
		panel2.setBackground(Color.black);
		
	}

	private void addEventListener() {

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton target = (JButton)e.getSource();
		if (target.getText().equals(button1.getText())) {
			panel2.setBackground(Color.green);
		}else if(target.getText().equals(button2.getText())) {
			panel2.setBackground(Color.blue);
		}else {
			panel2.setBackground(Color.yellow);
		}

	}
	

	public static void main(String[] args) {
		new Practice();

	}



}
