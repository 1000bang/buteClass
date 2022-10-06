package Generic_ex.ch03;

import java.util.ArrayList;

import Generic_ex.ch03.Plastic;
import Generic_ex.ch03.Powder;

public class MainTest {

	public static void main(String[] args) {

		
		//제네릭은 컴파일 시점에 데이터타입을 비워두고 런타입시점 뉴 할 때 데이터에 올라간다. 
		Water water = new Water();
		Powder powder = new Powder();
		GenericPrinter<Powder> genericPrinter = new GenericPrinter<>();
		GenericPrinter<Plastic> genericPrinter2 = new GenericPrinter<>();
		//GenericPrinter<Water> genericPrinter3 = new GenericPrinter<>();
		//안됨 extends된것만 가능
		
		genericPrinter.setMaterial(powder);
		System.out.println(genericPrinter.getMaterial());
		//<T extends 클래스>사용하기
		// 자료형의 범위를 제한할 수 있음(제한하지 않으면 자료형으로 아무클래스나 올 수 있다.)
		
		
		
	}

}
