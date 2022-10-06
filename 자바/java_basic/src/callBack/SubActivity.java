package callBack;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SubActivity extends JFrame implements ActionListener {

	JButton button;
	MainActivity mContext;
	
	public SubActivity(MainActivity mContext) {
		setVisible(true);
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
		button = new JButton("더하기 버튼");
		add(button);
		this.mContext = mContext;
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println("버튼이 눌러졌습니다. ");
		mContext.addCount();
	}
	
	

}
