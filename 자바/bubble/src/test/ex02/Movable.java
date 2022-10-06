package test.ex02;

public interface Movable {
//플레이어도 움직이지만
//에너미도 움직이기때문에 편의를 위해 인터페이스로 만들고 재정의하자 
	public abstract void left();
	void right();
	void up();
	void down();
	
}
