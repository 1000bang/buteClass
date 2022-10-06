package ch13;

public class MainTest4 {

	public static void main(String[] args) {

		Engine engine6 = new Engine("6기통", 1500);
		Car car = new Car("BMW5", 6_000, engine6);

		System.out.println(car.engine.name);
		
//		car.name = "벤츠";
//		car.price = 7200;
//		car.engine = engine6;
////		car.engine.name = "6기통GDI";
////		car.engine.price = 1_000;
//		System.out.println(car.name);
//		System.out.println(car.engine.name);
	}

}
