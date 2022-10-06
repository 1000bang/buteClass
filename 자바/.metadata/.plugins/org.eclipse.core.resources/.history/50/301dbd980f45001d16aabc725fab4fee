package Starcraft4;

public class Marine extends Unit implements Protoss {
	// 변수 생성

	// 생성자
	public Marine(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 80;
	}

	@Override
	public void attack(Unit unit) {
	
		System.out.println(this.name + "이 " + unit.getName() + "을 공격합니다.");

		unit.beAttacked(this.power);

	}
}