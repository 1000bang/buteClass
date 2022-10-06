package student;

public class Lunch {
	private String name;
	private int miso;
	private int curry;
	private int gogi;
	private static int income;

	// 생성자
	public Lunch() {
		this.name = "구내식당";
		this.gogi = 8500;
		this.curry = 7000;
		this.miso = 5000;
	}

	// 겟메서드
	public String getName() {
		return name;
	}

	public int getMiso() {
		return miso;
	}

	public int getCurry() {
		return curry;
	}

	public int getGogi() {
		return gogi;
	}

	// 행동
//	public void income(Student student) {
//		this.income += student.eatLunch();
//		System.out.println(this.name + "의 수익 : " + this.income);
////	}

	// 쇼인포

}
