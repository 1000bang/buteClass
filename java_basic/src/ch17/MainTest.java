package ch17;

import java.util.Random;
import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ToyMachine machine = new ToyMachine();
		Random random = new Random();
		Gift gift1 = new AirPod();
		Gift gift2 = new Gun();
		Gift gift3 = new Bear();
		Gift gift4 = new Lion();
		Gift[] giftIndex = new Gift[4];
		giftIndex[0] = gift1;
		giftIndex[1] = gift2;
		giftIndex[2] = gift3;
		giftIndex[3] = gift4;

		boolean flag = true;
		while (flag) {
			System.out.println("---인형뽑기----");
			System.out.println("1. 상품 알아보기 2. 상품뽑기 0. 종료");
			String choice = scanner.nextLine();
			if (choice.equals("1")) {
				for (int i = 0; i < giftIndex.length; i++) {
					giftIndex[i].showInfo();
				}
			} else if (choice.equals("2")) {
				int random1 = random.nextInt(4); 
				// 0 ~ 3
				System.out.println(giftIndex[random1].name + "이 뽑혔습니다");
				

			} else if (choice.equals("0")) {
				break;
			} else {
				flag = false;
			}

		}

	}// end of main
}// end of class
