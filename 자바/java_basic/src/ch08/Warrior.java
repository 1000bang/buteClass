package ch08;

public class Warrior {
	String wName;
	String wJob;
	private int wlv;
	int wHp;
	int wMp;
	int wSwing;
	int wMiss;
	
	
	//생성자 
		public Warrior(String wName, String wJob, int wlv, int wHp, int wMp, int wSwing) {
			this.wName = wName;
			this.wHp = wHp;
			this.wMp = wMp;
			this.wlv = wlv;
			this.wSwing = wSwing;
		}
	
		//공격 
		public void attack(int hit) {
			if (wHp < hit) {
				System.out.println("너무 쎄게 때렸습니다");
			}else {
				this.wHp -= hit;
			} //end of else
		} //end of hit
		
		public void miss() {
			this.wMiss ++;
		}
		
		
	public void wInfo() {
		System.out.println("-------상태창-------");
		System.out.println("Player name : " + wName);
		System.out.println("Job : " + wJob);
		System.out.println("HP : " + wHp);
		System.out.println("MP : " + wMp);
	}
	
	
	
	

	
	
//싸우다
//	public void swing(int damage) {
//	if (wHp < whit) {
//			System.out.println("너무 쎄게 때렸습니다");
//		}else {
//			this.wHp -=whit;
//		} //end of else
//	} //end of hit
//	
//	public void Miss() {
//		this.wMiss ++;
//	}
	
	
	
	public void showinfo() {
		System.out.println("------------");
		System.out.println("name : " + wName);
		System.out.println("hp : " + wHp);
		
		System.out.println("회피 : " + wMiss);
		
	}

	
}//end of class
