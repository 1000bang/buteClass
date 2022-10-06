package ch07;

public class Wizard {
	//속성
	String wName;
	int wMp;
	int wHp;
	int wFire;
	int wIce;
	
	//생성자 
	public Wizard(String wName, int wMp, int wHp, int wFire, int wIce) {
		this.wName = wName;
		this.wMp = wMp;
		this.wHp = wHp;
		this.wFire = wFire;
		this.wIce = wIce;
	}// end of Wizard
	
	//기능
	public void fskill(int a) {
		
		if(this.wMp < a) {
			System.out.println(" not enough MP");
		}else {
				this.wFire += a;
				this.wMp -= 10;
					} // end of else
	} // end of fskill
	
	//기능
	public void iskill(int b) {
		
		if(this.wMp < b) {
			System.out.println("---not enough MP---");
		}else {
				this.wIce += b;
				this.wMp -= 20;
			} // end of else
		} // end of iskill
	
	public void behitted(int c) {
		
		if (wHp < c) {
			this.wHp = 0;
			System.out.println("---player died---");
		}else {
				this.wHp -= c;
			} //end of else
		} //end of behitted
	
	//기능 쇼인포
	public void wInfo() {
		if (wHp == 0) {
			System.out.println("---player가 죽어 상태창을 불러올 수 없음---");
		}else if (wMp == 0) {
			System.out.println("------------");
			System.out.println("name : " + wName);
			System.out.println("hp : " + wHp);
			System.out.println("--mp is empty-- " );
			System.out.println("fire damage : " + wFire);	
			System.out.println("ice damage : " + wIce);	
		}else {
		System.out.println("------------");
		System.out.println("name : " + wName);
		System.out.println("hp : " + wHp);
		System.out.println("mp: " + wMp);
		System.out.println("fire damage : " + wFire);	
		System.out.println("ice damage : " + wIce);	
	}
	}
	
}
