package Starcraft4;

public class Zergling extends Unit implements Protoss {

	// 생성자
	public Zergling(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 50;
	}

	@Override
	public void attack(Unit unit) {
		
		System.out.println(this.name + "이 " + unit.getName() + "을 공격합니다.");

		unit.beAttacked(this.power);

	}

}
