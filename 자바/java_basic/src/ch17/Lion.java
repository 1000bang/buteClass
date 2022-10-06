package ch17;

public class Lion extends Gift {

	public Lion() {
		name = "사자인형";
		price = "3_000";
	}

	@Override
	public void pick() {
		System.out.println("사자인형이 뽑혔습니다.");

	}

}
