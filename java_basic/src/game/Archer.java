package game;

public class Archer extends Hero {
//생성자
	public Archer(String name, int hp) {
		super(name, hp);
	}

	public void fireArrow() {
		System.out.println("불화살~~");
	}

}
