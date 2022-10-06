package callBack_ex;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// 호출자 / 콜리 라고 불림
// : 콜백 받는 객체의 주소값을 알고 있어야 한다. 여기서 호출하기 때문
public class SubActivity extends JFrame implements ActionListener {

	JButton button;
	JButton button2;
	// 데이터타입 인터페이스를 선언
	OnCallBackButtonAction onCallBackButtonAction;

	// ** 호출자는 누구한테 메세지를 전달해야 하는지 알고 있어야 한다.
	// 1. 생성자로 만드는 방법 *
	// 2. 메서드를 통해서 만드는 방법
	// 1 -1 인터페이스 타입을 멤버변수로 선언한다.
	public SubActivity(OnCallBackButtonAction onCallBackButtonAction) {
		// 주소값 전달 받음
		this.onCallBackButtonAction = onCallBackButtonAction;

		setVisible(true);
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
		button = new JButton("더하기 버튼");
		button2 = new JButton("마이너스 버튼");
		add(button);
		add(button2);
		button.addActionListener(this);
		button2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println("버튼이 눌러졌습니다. ");
		// 메서드 호출
		if (e.getSource() == button) {
			onCallBackButtonAction.clickPlusButton();
		} else {
			onCallBackButtonAction.clickMinusButton();
		}

	}

}
