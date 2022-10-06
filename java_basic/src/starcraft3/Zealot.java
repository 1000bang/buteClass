package starcraft3;

public class Zealot extends Unit {

	// 생성자
	public Zealot(String name) {
		this.name = name;
		this.power = 10;
		this.hp = 100;
		System.out.println("질럿생성");
	}

	@Override
	public void attack(Zealot zealot) {
		if (this == zealot) {
			System.out.println("자기자신을 공격할 수 없습니다.");
		} else {
			super.attack(zealot);
		}
	}
}
