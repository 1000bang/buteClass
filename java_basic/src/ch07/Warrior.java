package ch07;

public class Warrior {

	// 상태, 기능. 생성자

	String warriorName;
	int warriorHp;
	int warriorMiss;
	int warriorDex;
	//생성자 
	public Warrior(String warriorName, int warriorHp, int warriorMp, int warriorDex) {
		this.warriorName = warriorName;
		this.warriorHp = warriorHp;
		this.warriorMiss = warriorMiss;
		this.warriorDex = warriorDex;
	}	
	
	
//싸우다
	public void fight(int hit) {
		if (warriorHp < hit) {
			System.out.println("너무 쎄게 때렸습니다");
		}else {
			this.warriorHp -= hit;
		} //end of else
	} //end of hit
	
	public void Miss() {
		this.warriorMiss ++;
	}
	
	
	
	public void showinfo() {
		System.out.println("------------");
		System.out.println("name : " + warriorName);
		System.out.println("hp : " + warriorHp);
		System.out.println("dex : " + warriorDex);
		System.out.println("회피 : " + warriorMiss);
		
	}

	
}//end of class
