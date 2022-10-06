package ch15;

public class FruitMainTeset2 {

	public static void main(String[] args) {
		// 문제
		// 배열사용ㅎ해서 복숭아 바나나 담아서
		// 화면에 정보를 출력
		// 바나나는 할인된 가격으로 정보를 출력

		Fruit[] fruit = new Fruit[5];
		fruit[0] = new Peach();
		fruit[1] = new Banana();
		fruit[2] = new Peach();
		fruit[3] = new Banana();
		fruit[4] = new Peach();

//		for (int i = 0; i < fruit.length; i++) {
//			if (fruit[i] instanceof Peach) {
//				fruit[i].showInfo();
//				System.out.println("-----------");
//			} else if (fruit[i] instanceof Banana) {
//				((Banana) fruit[i]).saleBanana();
//				fruit[i].showInfo();
//				System.out.println("-----------");
//			}
//		}

		for (int i = 0; i < fruit.length; i++) {
			if (fruit[i] != null) {
				if (fruit[i] instanceof Banana) {
					((Banana) fruit[i]).saleBanana();
				}
				fruit[i].showInfo();
				System.out.println();
			}
		}

	}

}
