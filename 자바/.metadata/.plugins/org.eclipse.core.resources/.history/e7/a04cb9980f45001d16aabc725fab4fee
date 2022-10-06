package Starcraft4;

public class Zealot extends Unit implements Protoss {

	// 생성자
	public Zealot(String name) {
		this.name = name;
		this.power = 10;
		this.hp = 100;
		System.out.println("질럿생성");
	}

	@Override
	public void attack(Unit unit) {
		// instanceof
		System.out.println(this.name + "이 " + unit.getName() + "을 공격합니다.");

		unit.beAttacked(this.power);

	}

	
		
	}

