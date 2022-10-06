package trans;

public class Plane extends Transportation {

	// 생성자
	public Plane(String name) {
		this.name = name;
		this.destination = "서울";
		this.price = 58_000;
		this.time = "3h";
	}

	@Override
	public void take() {
		if (name.equals("국제선")) {
			this.destination = "일본";
			this.price = 180_000;
			this.time = "6h";
			System.out.println(name + "을 타고 " + destination + "까지 " + time + "걸리고 " + price + "원의 비용이 발생한다");

		} else {
			super.take();
		}
	}
}
