package starcraft2;

public class Dragon {
	// member
	private String name;
	private int hp;
	private int power;

	// 생성자
	public Dragon(String name) {
		this.name = name;
		this.hp = 150;
		this.power = 120;
		System.out.println("드라군 생성");
	}
	
		public void showInfo() {
			System.out.println("===정보창===");
			System.out.println("이름 : " + name);
			System.out.println("생명력 : " + hp);
			System.out.println("공격력 : " + power);
	}
	}
