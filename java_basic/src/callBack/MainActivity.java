package callBack;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainActivity extends JFrame {
	MainActivity mContext = this;
	int count;
	JLabel label;
	SubActivity subActivity;

	public MainActivity() {
		count = 0;
		label = new JLabel(count + "");
		setLayout(new FlowLayout());
		add(label);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
		subActivity = new SubActivity(mContext);
	}

	public void addCount() {
		count++;
		label.setText(count + "");
	}

	public static void main(String[] args) {
		new MainActivity();
	}

}
