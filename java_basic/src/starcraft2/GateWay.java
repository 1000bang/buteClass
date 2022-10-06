package starcraft2;

import starcraft2.Zealot;

public class GateWay {

	static int zealotTotalCount;
	static int dragonTotalCount;
	private String name;

	// 생성자 생성

	public GateWay() {
		this.name = "게이트 웨이";
		zealotTotalCount = 0;
	}

	// 질럿생산하기
	public Zealot createZealot() {
		for (int i = 0; i < 10; i++) {
			System.out.print("-");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		zealotTotalCount++;
		return new Zealot("질럿" + zealotTotalCount);
	}

	public Dragon createDragon() {
		for (int i = 0; i < 10; i++) {
			System.out.print("-");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return new Dragon("드라군" + dragonTotalCount);
	}

}