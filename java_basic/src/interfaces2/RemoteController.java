package interfaces2;

public interface RemoteController {
// 인터페이스란?
	// 구현된 것이 아무것도 없는 밑 그림만 있는 기본  설계도(기능중심설계)
//특성
	//멤버변수, 일반메서드를 가질 수 없고, 오직 추상메서드와 상수만을 멤버로 가질 수 있다.  
	//추상 클래스보다 추상화가 더 높다. 
	//인터페이스는 표준, 약속(명세), 규칙(강제성이 있는 규칙) 
	
	//사용방법
	//class키워드 대신에 interface라는 키워드를 사용한다. 
	// class와 같이 접근제어 지시자를 public, default를 사용할 수 있다.
	// implements 사용하면되고 갯수에 제한이 없음
	//자바는 다중 상속을 지원하지 않습니다. 
	// 사람이 네발달린 짐승 클래스, 사자, 강아지 상속3개 받음 
	//  사람클래스에서 울다
	
	//제약사항
	//모든멤버변수는 public static final 이어야 한다. 
	public static final int SERIAL_NUMBER = 100;
	// 모든메서드는 추상 메서드이어야 하고 public abstract 키워드를 생략할 수 있다. 
	public abstract void turnOn(); //전부 작성하는 문법
	void turnOff(); //생략한 문법
	
	
	
	
}
