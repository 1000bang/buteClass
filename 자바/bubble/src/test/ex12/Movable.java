package test.ex12;

public interface Movable {
//플레이어도 움직이지만
//에너미도 움직이기때문에 편의를 위해 인터페이스로 만들고 재정의하자 
	public abstract void left();
	void right();
	void up();
	
// 인터페이스 (추상메서드, 상수 - static)
// 디폴트를 통해 몸체{}가 있는 일반메서드로도 만들 수 있다
// 어뎁터 패턴 대용으로 사용하기도 한다.
	default void down() {};
	// ; 세미 콜론은 문장의 끝
	
}
