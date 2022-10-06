package trans;

public class MainTest1 {

	public static void main(String[] args) {
		Bus bus = new Bus("일반");
		Bus bus1 = new Bus("우등");
		Car car = new Car("페라리");
		Car car1 = new Car("제네시스");
		Plane air = new Plane("국내선");
		Plane air1 = new Plane ("국제선");
		
		bus.take();
		bus1.take();
		System.out.println();
		car.take();
		car1.take();
		System.out.println();
		air.take();
		air1.take();
	
	}

}



