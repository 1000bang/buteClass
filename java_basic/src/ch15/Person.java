package ch15;

public class Person extends Human{
	//추상메서드를 일반 메서드로 재구현 해주면 된다. 
	@Override
	public void hunt() {
	System.out.println("사람이 총을 들고 독수리를 사냥합니다.");
		
	}

}
