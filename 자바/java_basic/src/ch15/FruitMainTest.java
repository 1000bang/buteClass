package ch15;

import java.util.Scanner;

public class FruitMainTest {
//start of main
	public static void main(String[] args) {
		// 다양한 형태로 클래스를(타입을)바라볼 수 있다. -다형성
		Fruit fruit1 = new Banana(); // 업캐스팅
		Fruit fruit2 = new Peach();

//		fruit1.showInfo();
//		fruit2.showInfo();

		// 스캐너에 넘겨받은 값이 1이면 복숭아 2면 바나나

		Fruit fruit;

		int userInput = 1;
		fruit = new Banana();

		// instanceof 라는 키워드는 객체의 타입을 확인한다
		if (fruit instanceof Banana) {
			System.out.println("바나나 타입이 맞습니다.");
			// 화면에 원산지를 출력해주세요
			// 형변환 다운캐스팅
			// Customer customer2 = (VipCustomer) new VipCustomer();
			System.out.println(((Banana) fruit).origin);

		} else if (fruit instanceof Peach) {
			System.out.println("복숭아 타입이 맞습니다.");
		}

	}

}
