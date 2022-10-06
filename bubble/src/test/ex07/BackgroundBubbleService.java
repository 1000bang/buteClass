package test.ex07;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.ImageConsumer;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

//백그라운드에서 계속  bubble의 움직임을 관찰
public class BackgroundBubbleService implements Runnable {

	private BufferedImage image;
	// bubble 포함관계로 부르기
	private Bubble bubble;

	public BackgroundBubbleService(Bubble bubble) {
		this.bubble = bubble;
		try {
			image = ImageIO.read(new File("image/backgroundMapService.png"));
		} catch (IOException e) {
			System.out.println("이미지 파일경로 확인");
		}
	}

	@Override
	public void run() {
		while (true) {
			// 색상확인

			Color leftColor = new Color(image.getRGB(bubble.getX(), bubble.getY() + 25));
			Color rightColor = new Color(image.getRGB(bubble.getX() + 50 +10, bubble.getY() + 25));
			Color upColor = new Color(image.getRGB(bubble.getX() + 25, bubble.getY()));

			// 왼쪽 벽
			if ((leftColor.getRed() == 255) && (leftColor.getGreen() == 0) && (leftColor.getBlue() == 0)) {
				bubble.setLeft(false);

				// 오른쪽 벽에 충돌
			} else if ((rightColor.getRed() == 255) && (rightColor.getGreen() == 0) && (rightColor.getBlue() == 0)) {
				bubble.setRight(false);

				// 위쪽 벽에 충돌
			}
			if ((upColor.getRed() == 255) && (upColor.getGreen() == 0) && (upColor.getBlue() == 0)) {
				bubble.setUp(false);
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
