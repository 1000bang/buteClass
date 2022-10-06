package test.ex04;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.sql.rowset.RowSetMetaDataImpl;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame {
//포함관계 (composition)
	private JLabel backgroundMap;
	private Player player;

	public BubbleFrame() {
		initDate();
		setInitLayout();
		addEventListener();
		new Thread(new BackgroundPlayerService(player)).start(); // 쓰레드가 runnable로 구현되어있음
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
				// System.out.println(e.getKeyCode());
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:

					// boolean은게터가 is임
					// 이벤트가 여러번 들어오더라도 한번만 처리하게 해야한다.
					// 방향키를 누르고 있으면 이벤트가 계속 실행되어 가속된다
					// 레프트가 실행중이 아닐 때만 레프트가 실행된다. 
					if (!player.isLeft() && !player.isLeftWallCrash()) {
						player.left();
					}

					break;
				case KeyEvent.VK_RIGHT:
					if (!player.isRight()&& !player.isRightWallCrash()) {
						player.right();
					}

					break;
				case KeyEvent.VK_UP:
					if (!player.isUp() && !player.isDown()) {
						player.up();
					}
					break;

				default:
					break;
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					// 미리 만들어논 세터 메서드를 통해 상태값을 변경시켜준다.
					player.setLeft(false);
					break;
				case KeyEvent.VK_RIGHT:
					player.setRight(false);
					break;

				}
			}
		});
	}

	public static void main(String[] args) {
		new BubbleFrame();
	}
}
