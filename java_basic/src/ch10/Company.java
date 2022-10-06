package ch10;


public class Company {
	public int cId;
	
	//1
	private Company() {
		
	}
	
	//2 자기자신을 반환
	private static Company instance = new Company(); //주소값 들어감
	// private static Company instance;  주소값 안들어갈 때
	
	// private static Company instance() {
	//	return new Company();
	// return this;
	// }
	 //왜 안될까?
	
	
	
	
	
	
	
	 //3 
	 public static Company getInstance() {
		 
		//방어적 코드
		 //만약 인스턴스 값이 널이라면
		// private static Company instance;
		// 인스턴스에 주소값 대입
		// if(instance == null) {
		//	 instance = new Company();
		// }
		 return instance;
	 }
	
	
	
	
	
}
