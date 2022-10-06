package test.ex08;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class BackgoundEnemyService implements Runnable {

	private BufferedImage image;
	// enemy를 관찰해야함 포함관계로 부르기
	private Enemy enemy;

	public BackgoundEnemyService(Enemy enemy) {
		this.enemy = enemy;
		try {
			image = ImageIO.read(new File("image/backgroundMapService.png"));
		} catch (IOException e) {
			System.out.println("이미지 파일경로 확인");
		}
	}

	@Override
	public void run() {
		while (true) {
			Color leftColor = new Color(image.getRGB(enemy.getX(), enemy.getY() + 25));
			Color rightColor = new Color(image.getRGB(enemy.getX() + 50 + 10, enemy.getY() + 25));
			int bottomColorLeft = image.getRGB(enemy.getX() + 20, enemy.getY() + 50 + 5);
			int bottomColorRight = image.getRGB(enemy.getX() + 50 - 10, enemy.getY() + 50 + 5);

			if ((leftColor.getRed() == 255) && (leftColor.getGreen() == 0) && (leftColor.getBlue() == 0)) {

				enemy.setLeft(false);

			} else if (((rightColor.getRed() == 255) && (rightColor.getGreen() == 0) && (rightColor.getBlue() == 0))) {
				enemy.setRight(false);
			}
//			if (bottomColorLeft == -1) {
//				enemy.down();
//			}else if (bottomColorRight == -1) {
//				System.out.println("d");
//				enemy.down();
//			}enemy.setRight(true);
//		
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
