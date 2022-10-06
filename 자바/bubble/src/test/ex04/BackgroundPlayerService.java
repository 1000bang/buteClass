package test.ex04;

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

	// 생성자로 매개변수 플레이어를 넘겨받음 - > 의존성 포함관계 composition
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
			// getRGB (좌표) 좌표값에 있는 색깔을 확인한다. 빨파초 흰(rgd all 255)
			Color leftColor = new Color(image.getRGB(player.getX(), player.getY() + 25));
			Color rightColor = new Color(image.getRGB(player.getX() + 50 + 10, player.getY() + 25));
			// System.out.println(leftColor);
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
