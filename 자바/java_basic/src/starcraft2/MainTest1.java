package starcraft2;

import java.util.Random;

public class MainTest1 {

	public static void main(String[] args) {
		final int ZEALOT = 1;
		final int MARINE = 2;
		final int ZERGLING = 3;
		
		Zealot zealot1 = new Zealot("질럿1");
		Marine marine1 = new Marine("마린1");
		Zergling zergling1 = new Zergling("저글링1");
		Zealot zealot2 = new Zealot("질럿2");
		Random random = new Random();
		int number = random.nextInt()+1;
		
		if(ZEALOT == number ) {
			zealot1.attack(marine1);
			zealot1.attack(zergling1);
		}else if (MARINE == number) {
			marine1.attack(zealot1);
			marine1.attack(zergling1);
		}else {
			zergling1.attack(marine1);
			zergling1.attack(zealot1);
		} //end of if
		
		zealot1.showInfo();
		marine1.showInfo();
		zergling1.showInfo();
		
		System.out.println("------------");
		//강제공격
		zergling1.attack(zergling1);
		
		//자기자신을 공격하는 명령을 했다면 동작하지 않게 코드를 수정하세요
		
	}

}
