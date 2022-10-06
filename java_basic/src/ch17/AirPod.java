package ch17;

public class AirPod extends Gift {

	public AirPod() {
		name = "에어팟";
		price = "270_000";
	}

	@Override
	public void pick() {
		System.out.println("에어팟이 뽑혔습니다.");

	}

}
