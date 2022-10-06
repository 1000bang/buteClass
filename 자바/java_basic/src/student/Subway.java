package student;

public class Subway {

	// 변수 생성
	private String name;
	private int fare;
	private int earnedMoney;

	// 생성자
	public Subway(String name) {
		this.name = name;
		this.fare = 1300;
	}

	// 게터 메서드
	public int getFare() {
		return fare;
	}

	public String getName() {
		return name;
	}

	// 행동
	public void eanredMoney(Student student) {
		System.out.println(student.getName()+ "님이 "+ student.getSubwayCount() + "번 탑승");
	}

	// 쇼인포  
	public void showInfo() {
		System.out.println();
	}

}