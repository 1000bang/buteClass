package starcraft2;

public class GateWayMainTest2 {

	public static void main(String[] args) {
		GateWay gateWay1 = new GateWay();
		// 데이터를 관리하기 위해서는 변수에 데이터를 담아야 한다.
		// 0 1 2 3 4
		Zealot zealot = null;
		for (int i = 0; i < 5; i++) {
			System.out.println("i : " + i);
			zealot = gateWay1.createZealot();

			System.out.println(zealot);

		} // 블록의 유효범위
			// 마지막에 생성된 질럿의 주소값만 접근해서 사용

	}

}
