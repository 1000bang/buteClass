package ch08;

public class Wizard {
	//속성
	String iName;
	String iJob;
	int ilv;
	int iMp;
	int iHp;
	int iFire;
	
	
	//생성자 
	public Wizard(String iName, String iJob, int ilv, int iMp, int iHp, int iFire) {
		this.iName = iName;
		this.iJob = iJob;
		this.ilv = ilv;
		this.iMp = iMp;
		this.iHp = iHp;
		this.iFire = iFire;
		
	}// end of Wizard
	
	//기능
	public void fskill(int a) {
		
		if(this.iMp < a) {
			System.out.println(" not enough MP");
		}else {
				this.iFire += a;
				this.iMp -= 10;
					} // end of else
	} // end of fskill
	
	
	
	public void behitted(int c) {
		
		if (iHp < c) {
			this.iHp = 0;
			System.out.println("---player died---");
		}else {
				this.iHp -= c;
			} //end of else
		} //end of behitted
	
	//기능 쇼인포
	public void wInfo() {
		if (iHp == 0) {
			System.out.println("---player가 죽어 상태창을 불러올 수 없음---");
		}else if (iMp == 0) {
			System.out.println("------------");
			System.out.println("name : " + iName);
			System.out.println("hp : " + iHp);
			System.out.println("--mp is empty-- " );
			System.out.println("fire damage : " + iFire);	
			
		}else {
		System.out.println("------------");
		System.out.println("name : " + iName);
		System.out.println("hp : " + iHp);
		System.out.println("mp: " + iMp);
		System.out.println("fire damage : " + iFire);	
		
	}
	}
	
}
