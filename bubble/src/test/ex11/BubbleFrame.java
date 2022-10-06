package test.ex11;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.sql.rowset.RowSetMetaDataImpl;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import lombok.Getter;

@Getter
public class BubbleFrame extends JFrame {

	// 컨택스트 !! 자기 변수를 만들어서 자기 주소 값을 넣음
	// 이걸 버블에 생성자에서 버블프레임 데이터를 가져가면
	// 버블이 버블프레임의 주소 값을 가져가서 모든 데이터를 볼 수 있기 때문에
	// 컨택스트 == 변태 라고도 볼 수 있다 !!

	// 자기자신의 클래스를 선언하고 자신의 주소값을 대입함
	private BubbleFrame mContext = this;

	// 이렇게하면 런타임시점에 무한루프 돈다
	// private BubbleFrame mContext = new BubbleFrame();

	// 포함관계 (composition)
	private JLabel backgroundMap;
	private Player player;
	private Enemy enemy;

	public BubbleFrame() {
		initDate();
		setInitLayout();
		addEventListener();
		new Thread(new BackgroundPlayerService(player)).start(); // 쓰레드가 runnable로 구현되어있음
		new Thread(new BackgoundEnemyService(enemy)).start();
	}

	private void initDate() {
		backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png"));
		setContentPane(backgroundMap); // add랑 같은 느낌임 기존에 깔려있는 루트패널에 이미지를 붙인다
		setSize(1000, 640);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		player = new Player(mContext); // 메모리 올려
		enemy = new Enemy(mContext); // 메모리 올려
		// 메모리 올려
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(null); // absolute 레이아웃
		setResizable(false);
		setLocationRelativeTo(null); // jframe 모니터 가운데 배치하기

		add(player);
		add(enemy);
		//enemy.left();

	}

	private void addEventListener() {
		// 익명구현 클래스
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// System.out.println(e.getKeyCode());
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:

					if (!player.isLeft() && !player.isLeftWallCrash()) {
						player.left();
					}

					break;
				case KeyEvent.VK_RIGHT:
					if (!player.isRight() && !player.isRightWallCrash()) {
						player.right();
					}

					break;
				case KeyEvent.VK_UP:
					if (!player.isUp() && !player.isDown()) {
						player.up();
					}
					break;
//				case KeyEvent.VK_DOWN:
//					if (!player.isDown()) {
//						player.down();
//					}
//					break;

				case KeyEvent.VK_SPACE:
					player.attack();
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

	// 메인함수가 모든녀석들을 접근할 수 있다.
	public static void main(String[] args) {
		new BubbleFrame();
	}
}
