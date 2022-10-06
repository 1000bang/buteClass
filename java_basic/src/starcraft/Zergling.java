package starcraft;

public class Zergling {
		//변수생성
		private String name;
		private int power;
		private int hp;
		
		//생성자
		public Zergling(String name) {
			this.name = name;
			this.power = 5;
			this.hp = 50;
		}
		
		//게터 메서드
		public String getName() {
			return name;
		}
		public int getPower() {
			return power;
		}
		public int getHp() {
			return hp;
		}
	
		//행동
		//매게변수로 들어오는 주소값으로 이름 설정 기능동작
		public void attackMarine(Marine marine) {
			System.out.println(this.name + "이 " + marine.getName() + "을 공격합니다.");
			marine.beattacked(this.power);
		
		}
		public void attackZealot(Zealot zealot) {
			System.out.println(this.name + "이 " + zealot.getName() + "을 공격합니다");
			zealot.beAttacked(this.power);
		}
		 
		public void beattacked(int power) {
			this.hp -= power;
			if (this.hp <= 0) {
				System.out.println(name + " is dead");
				this.hp = 0;
			}
		}
		
		public void showInfo() {
			System.out.println("===정보창===");
			System.out.println("이름 : " + name );
			System.out.println("생명력 : " + hp );
			System.out.println("공격력 : " + power );

		}
		
}

