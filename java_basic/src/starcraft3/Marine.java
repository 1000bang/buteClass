package starcraft3;

public class Marine extends Unit {
	// 변수 생성

	// 생성자
	public Marine(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 80;
	}

	@Override
	public void attack(Marine marine) {
		if (this == marine) {
			System.out.println("자기자신 공격 x");
		} else {
			super.attack(marine);

		}
	}
}
