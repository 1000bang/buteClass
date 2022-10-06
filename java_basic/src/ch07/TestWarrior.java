package ch07;

public class TestWarrior {

	public static void main(String[] args) {
		
//		Warrior warrior1 = new Warrior("김전사",100,0,80);
//		warrior1.showinfo();
//		warrior1.fight(5);
//		warrior1.showinfo();
//		warrior1.Miss();
//		warrior1.showinfo();
//		
		
		Wizard wizard1 = new Wizard("김법사", 100, 100, 0, 0);
		System.out.println("초기 상태");
		wizard1.wInfo();
		System.out.println("fire스킬 1번 damage 10 사용 상태");
		wizard1.fskill(10);
		wizard1.wInfo();
		System.out.println("fire스킬 1번 사용 상태");
		wizard1.fskill(100);
		wizard1.wInfo();
		wizard1.iskill(110);
		wizard1.wInfo();
		wizard1.behitted(110);
		wizard1.wInfo();
		wizard1.behitted(10);
		
	}

}
