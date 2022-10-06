package lotto;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LottoFrame extends JFrame implements ActionListener {

	LottoNum lottoNum = new LottoNum();
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel("!!  로또 당첨 번호  !!");
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JPanel centerPanel = new JPanel();
	JPanel bottomPanel = new JPanel();
	

	public LottoFrame() {
		initData();
		setInitLayout();
		addEventListener();
		setUpLottoNumber();
	}

	private void initData() {
		setTitle("lotto Game");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void setInitLayout() {
		setVisible(true);
		setResizable(false);
		this.setLayout(new BorderLayout());

		this.add(bottomPanel, BorderLayout.SOUTH);
		this.add(centerPanel, BorderLayout.CENTER);
		centerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
		bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
		add(label2);
		add(label1);
		label1.setFont(new Font("SanSerif", Font.BOLD, 35));
		label2.setFont(new Font("SanSerif", Font.BOLD, 25));

	}

	private void addEventListener() {
		button1.addActionListener(this);
		button2.addActionListener(this);
	}
//집에가고싶다
	public void setUpLottoNumber() {
		int[] numbers = lottoNum.createdLottoNum();
		label1.setText(Arrays.toString(numbers));

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton Button = (JButton) e.getSource();
		if (Button.getText().equals(button1.getText())) {
		setUpLottoNumber();
		} else {
			System.exit(0);
		}
	}

}
