package Generic_ex.ch02;

import java.util.ArrayList;

import Generic_ex.ch01.Plastic;
import Generic_ex.ch01.Powder;

public class MainTest {

	public static void main(String[] args) {

		// 재료
		Powder powder = new Powder();
		Plastic Plastic = new Plastic();

		// 사용방법
		GenericPrinter<Powder> genericPrinter = new GenericPrinter<>();
		// ArrayList<E>a = new ArrayList<>();

		// 재료세팅
		// setter에서 플라스틱을 넣으면 문법오류가 난다
		// 제네릭에서 데이터 타입을 파우더로 선언했기 때문에 프로그램 안정성이 올라 간다

		genericPrinter.setMeterial(powder);
		Powder usePowder = genericPrinter.getMeterial();
		System.out.println(usePowder);

		//플라스틱을 받는 새로운 제네릭 선언
		GenericPrinter<Plastic> genericPrinter2 = new GenericPrinter<>();
		genericPrinter2.setMeterial(Plastic);
		Plastic usePlastic = genericPrinter2.getMeterial();
		System.out.println(usePlastic);

	}

}
