package starcraft2;

public class Zealot {

	// private int id;
	private String name;
	private int power;
	private int hp;

	// 생성자
	public Zealot(String name) {
		this.name = name;
		this.power = 10;
		this.hp = 100;
		System.out.println("질럿생성");
//		System.out.println(1);
//		System.out.println(1.0);
//		System.out.println(true);

	}

	// 게터 메서드
	public String getName() {
		return name;
	}

	public int getPower() {
		return power;
	}

	public int getHp() {
		return hp;
	}

	// 기능

	// 메서드 오버로딩 ( 같은 이름을 선언하지만 매개변수 개수나 타입에 따라서 구분해서 호출할 수 있다.)
	// 질럿공공격
	public void attack(Zealot zealot) {
		System.out.println(this.name + "이 " + zealot.getName() + "을 공격합니다.");
		// 질럿의 공격력 this.power
		zealot.beAttacked(this.power);
	}

	// 마린을 공격합니다
	public void attack(Marine marine) {
		System.out.println(this.name + "이 " + marine.getName() + "을 공격합니다.");
		// 질럿의 공격력 this.power
		marine.beAttacked(this.power);
	}

	// 저글링을 공격합니다.
	public void attack(Zergling zergling) {
		System.out.println(this.name + "이 " + zergling.getName() + "을 공격합니다.");
		zergling.beAttacked(this.power);
	}

	// 공격을 당합니다.
	public void beAttacked(int power) {

		this.hp -= power;
		if (hp <= 0) {
			System.out.println(this.name + "is dead");
			hp = 0;
		}

	}

	public void showInfo() {
		System.out.println("===정보창===");
		System.out.println("이름 : " + name);
		System.out.println("생명력 : " + hp);
		System.out.println("공격력 : " + power);

	}

}
