package ch13;

public class Car {

	Engine engine;

	public Car(String cName, int cPrice, Engine engine) {
		this.name = cName;
		this.price = cPrice;
		this.engine = engine;
	}
	String name;
	int price;

	
//	public void setEngineName(String name) {
//		engine.name = name;
//	}
//	public void setEnginePrice(int price) {
//		engine.price = price;
//	}
	//문제
	// car클래스 생성시에 엔진클래스를 메모리에 올려주세요
	//단 engine의 이름과 name을 외부에서 전달받도록 설계
}
