package game;

public class MainTest {

	public static void main(String[] args) {
		Wizard wizard1 = new Wizard("마법사1", 100);
		Archer archer1 = new Archer("궁수1", 100);
		Warrior warrior1 = new Warrior("전사1", 100);

		wizard1.attack();
		archer1.attack();
		warrior1.attack();
		System.out.println("------------");
		wizard1.freezing();
		archer1.fireArrow();
		warrior1.comboattack();

	}
}
