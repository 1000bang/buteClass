package game;

public class Warrior extends Hero {

	public Warrior(String name, int hp) {
		super(name, hp);
	}

	public void comboattack() {
		System.out.println("콤보 어택 ");
	}
}
