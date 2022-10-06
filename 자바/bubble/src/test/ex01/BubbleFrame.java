package test.ex01;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.sql.rowset.RowSetMetaDataImpl;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

//플레이어를 클래스로 분리시켜 
//플레이어 클래스에는 움직이는 기능을 만들고 
// 키이벤트는프레임에서 설정을 추가한다

public class BubbleFrame extends JFrame {
//포함관계 (composition)
	private JLabel backgroundMap;
	private Player player;

	public BubbleFrame() {
		initDate();
		setInitLayout();
		addEventListener();

	}

	private void initDate() {
		backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png"));
		setContentPane(backgroundMap); // add랑 같은 느낌임 기존에 깔려있는 루트패널에 이미지를 붙인다
		setSize(1000, 640);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		player = new Player(); // 메모리 올려
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(null); // absolute 레이아웃
		setResizable(false);
		setLocationRelativeTo(null); // jframe 모니터 가운데 배치하기

		add(player); //
	}

	private void addEventListener() {
		// 익명구현 클래스
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println(e.getKeyCode());
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					player.left();
					break;
				case KeyEvent.VK_RIGHT:
					player.right();
					break;
				case KeyEvent.VK_UP:
					player.up();
					break;

				default:
					break;
				}
			}
		});
	}

	public static void main(String[] args) {
		new BubbleFrame();
	}
}
