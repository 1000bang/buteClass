package game;

public class Hero {

	String name;
	int hp;

	public Hero(String name, int hp) {
		this.hp = hp;
		this.name = name;
	}

	public void attack() {
		System.out.println(this.name + "  공격합니다. ");
	}
}
