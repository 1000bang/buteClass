package starcraft;

public class Marine {
	// 변수 생성
	private String name;
	private int power;
	private int hp;

	// 생성자
	public Marine(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 80;
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

	// 질럿을 공격합니다
	public void attackZealot(Zealot zealot) {
	System.out.println(this.name + "이 " + zealot.getName() + "을 공격합니다");
		zealot.beAttacked(this.power);
	}

	// 저글링을 공격합니다.
	public void attackZergling(Zergling zergling) {
	System.out.println(this.name + "이 " + zergling.getName() + "을 공격합니다.");
	 zergling.beattacked(this.power);
	}

	// 내가 공격을 당핳ㅂ니다.
	public void beattacked(int power) {
		this.hp -= power;
		if (this.hp <= 0) {
			System.out.println(name + "is dead");
			this.hp = 0;
			
		}else {
			System.out.println(this.name + "이 공격당합니다.");
		}
	}

	// 쇼인포
	public void showInfo() {
		System.out.println("===정보창===");
		System.out.println("이름 : " + name);
		System.out.println("생명력 : " + hp);
		System.out.println("공격력 : " + power);

	}

}
