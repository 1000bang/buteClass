package test.ex11;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.ImageConsumer;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

//남들 모르게 계속 살아있어야 함
//메인 스레드 바쁨 - 이벤트리스너 처리 중
//백그라운드에서 계속  player의 움직임을 관찰
public class BackgroundPlayerService implements Runnable {

	private BufferedImage image;
	// player를 관찰해야함 포함관계로 부르기
	private Player player;

	// 생성자로 매개변수 플레이어를 넘겨받음 - > 의존성 포함관계 composition tight coupling
	// 나중에 디자인패턴 전략패턴을 배울 때 의존성을 낮춰 코드를 짤 수 있다.

	public BackgroundPlayerService(Player player) {
		this.player = player;
		try {
			image = ImageIO.read(new File("image/backgroundMapService.png"));
		} catch (IOException e) {
			System.out.println("이미지 파일경로 확인");

		}
	}

	// 좌표값으로 벽을 지정하면 너무 하드코딩임
	// player좌표 값이 흰색이면 움직일 수 있게
	// 빨,파면 못 움직이게 설정하자
	@Override
	public void run() {
		while (true) {
			// 색상확인

			Color leftColor = new Color(image.getRGB(player.getX(), player.getY() + 25));
			Color rightColor = new Color(image.getRGB(player.getX() + 50 + 10, player.getY() + 25));
			// Color bottomColor = new Color(image.getRGB(player.getX() + 25, player.getY()+
			// 50));
			// 코드를 더 짧게 만들기 위해 색깔의 인트값을 받음!
			int bottomColorLeft = image.getRGB(player.getX() + 20, player.getY() + 50 + 5);
			int bottomColorRight = image.getRGB(player.getX() + 50 - 10, player.getY() + 50 + 5);

			// System.out.println("bottomColor : "+ bottomColorLeft);
			// 왼쪽 벽을 만났다면
			if ((leftColor.getRed() == 255) && (leftColor.getGreen() == 0) && (leftColor.getBlue() == 0)) {
				System.out.println("왼쪽 벽 충돌");
				player.setLeftWallCrash(true);
				player.setLeft(false);

				// 오른쪽 벽에 충돌한다면
			} else if ((rightColor.getRed() == 255) && (rightColor.getGreen() == 0) && (rightColor.getBlue() == 0)) {
				System.out.println("오른쪽 벽 충돌");
				player.setRightWallCrash(true);
				player.setRight(false);

			} else {
				player.setLeftWallCrash(false);
				player.setRightWallCrash(false);
				// player.setStepOnFloor(false);

			}
			// floor 에 올라가면
			// 하얀색이 아니면 바닥이다
			if (bottomColorLeft + bottomColorRight != -2) {
				// System.out.println("바닥입니다");
				// player.setStepOnFloor(true);
				player.setDown(false);
				// 쪼금 점프하는 순간 bottomcolor가 값이 -1 이 되기 때문에
				// 65번 돌아야하는데 for문이 첫번째에 player.down()이 실행된다.
				// 방어적 메서드
				// 플레이어가 올라가는 도중이 아닐 때 down() 메서드를 실행시켜야 한다.

			} else {
				if (!player.isUp() && !player.isDown()) {
					player.down();
				}
				// 위 조건이 아니면 하얀색 > 맘대로 움직임 가능

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
