package starcraft;

public class MainTest1 {

	public static void main(String[] args) {
	//우선 메모리에 올려둔다
	Marine marine1 = new Marine("마린 1");
	Zealot zealot1 = new Zealot ("질럿 1");
	Zergling zergling1 = new Zergling("저글링 1");	
	Zergling zergling2 = new Zergling("저글링 2");	
	
	zealot1.attackMarine(marine1);
	marine1.showInfo();
	//객체와 객체간에 상호작용하게 한다.
	zealot1.attackMarine(marine1);
	marine1.showInfo();
	zealot1.attackZergling(zergling1);
	marine1.showInfo();
	//객체와 객체간에 상호작용하게 한다.
	zealot1.attackZergling(zergling2);
	marine1.showInfo();
	marine1.attackZergling(zergling1);
	marine1.showInfo();
	marine1.attackZealot(zealot1);
	marine1.showInfo();
	zealot1.attackZergling(zergling1);
	zealot1.showInfo();
	zealot1.attackZergling(zergling1);
	zealot1.showInfo();
	
	marine1.attackZealot(zealot1);
	marine1.showInfo();
	}
}
