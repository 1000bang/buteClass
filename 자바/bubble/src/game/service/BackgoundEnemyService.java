package game.service;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import game.component.Enemy;

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
		while (enemy.getState() == 0) {
			Color leftColor = new Color(image.getRGB(enemy.getX(), enemy.getY() + 25));
			Color rightColor = new Color(image.getRGB(enemy.getX() + 50 + 10, enemy.getY() + 25));
			int bottomColorLeft = image.getRGB(enemy.getX() + 20, enemy.getY() + 50 + 5);
			int bottomColorRight = image.getRGB(enemy.getX() + 50 - 10, enemy.getY() + 50 + 5);

			// 외벽 충돌 확인
			if ((leftColor.getRed() == 255) && (leftColor.getGreen() == 0) && (leftColor.getBlue() == 0)) {

				enemy.setLeft(false);
				if (!enemy.isRight()) {
					enemy.right();
				}
				// 방어적 코드 두번실행되는 것을 방지
			} else if ((rightColor.getRed() == 255) && (rightColor.getGreen() == 0) && (rightColor.getBlue() == 0)) {
				enemy.setRight(false);
				if (!enemy.isLeft()) {
					enemy.left();
				}
			}
			if (bottomColorLeft + bottomColorRight != -2) {
				enemy.setDown(false);
			} else {
				if (!enemy.isUp() && !enemy.isDown()) {
					enemy.down();
				}
			}

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
