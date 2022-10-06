package ch10;

public class KoreaGoverment {
	//1. 생성자를 private으로 만든다.
	//2. static 변수를 활용해서 내부에서 객체를 생성한다.
	//3. 외부에서 유일하게 참조변수(인스턴스변수)에 접근 가능한 public 메서드를 제공해준다.
	
	private String kGoverment;
	private int budget;
	
	//1 생성자 private
	private KoreaGoverment () {
		
	}
	
	//2 리턴타입 자기자신
	private static KoreaGoverment instance = new KoreaGoverment();
	// private static KoreaGoverment instance;  주소값 안들어갈 때
	
		// private static KoreaGoverment instance() {
		//	return new KoreaGoverment();
		// return this;
		// }
		 //왜 안될까?
	//3 외부에서 접근할 수 있도록 하고 리턴값 반환
	public static KoreaGoverment getInstance() {
		return instance;
		
	}
	
}
