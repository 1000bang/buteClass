package trans;

public class Car extends Transportation {

//생성자
	public Car(String name) {
		this.name = name;
		this.destination = "서울";
		this.price = 90_000;
		this.time = "5h";
	}

	@Override
	public void take() {
		if (name.equals("페라리")) {
			this.time = "3h";
			System.out.println(name + "을 타고 " + destination + "까지 " + time + "걸리고 " + price + "원의 비용이 발생한다");
		} else {
			super.take();
		}
	}
}
