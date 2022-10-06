package wraper;

import java.lang.invoke.SwitchPoint;

public class Maintest9 {

	public static void main(String[] args) {
		Fruit fruit = Fruit.APPLE;
		switch (fruit) {
		case STRAWBERRY:
			System.out.println("딸기가 좋아");
			break;
		case APPLE:
			System.out.println("사과가 좋아");
			break;
		case BANANA:
			System.out.println("바나나가 좋아");
			break;

		default:
			System.out.println("없음");
			break;
		}

	}

}
