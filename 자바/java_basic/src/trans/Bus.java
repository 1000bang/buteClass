package trans;

public class Bus extends Transportation {

	// 생성자
	public Bus(String name) {
		this.name = name;
		this.destination = "서울";
		this.price = 45_000;
		this.time = "4h";
	}

	@Override
	public void take() {
		if (name.equals("우등")) {
			this.price = 60_000;
			super.take();
		} else {
			super.take();
		}
	}
}
