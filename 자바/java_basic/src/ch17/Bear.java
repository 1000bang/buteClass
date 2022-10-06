package ch17;

public class Bear extends Gift {

	public Bear() {
		name = "곰인형";
		price = "3_000";
	}

	@Override
	public void pick() {
		System.out.println("곰인형이 뽑혔습니다");
	}

}
