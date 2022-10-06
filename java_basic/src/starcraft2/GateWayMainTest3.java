package starcraft2;

public class GateWayMainTest3 {

	public static void main(String[] args) {

		// 배열 연관된 데이터 타입을 하나의 변수에 통으로 관리하기 위한 데이터 타입입니다.
		// 배열은 보통 반복문과 함께 많이 사용됨
//		int[] intArr = new int[3];
//		int[] intArr1 = { 1, 2, 3 };
//		intArr[1] = 2;
//
//		// intArr = {12, 3, 123};
//		// 질럿의 주소값이 들어온다
//		Zealot[] zealots = new Zealot[30];
//		// length : 변수 길이가 얼마인지 반환하는 녀석
//		System.out.println(zealots.length); // 3 배열의 크기를 반환함
//		for (int i = 0; i < zealots.length; i++) {
//			zealots[i] = new Zealot("질럿" + i);
//		}
////		zealots[0] = new Zealot("질럿1");
////		//zealots[0] = new Marine("마린1"); 안됨 연관된 데이터 타입 x
////		zealots[1] = new Zealot("질럿2");
////		zealots[2] = new Zealot("질럿3");
//
//		for (int i = 1; i < zealots.length; i++) {
////			System.out.println(zealots[i]);
//			System.out.println(zealots[i].getName());
//			System.out.println(zealots[i].getHp());
//			System.out.println(zealots[i].getPower());
//			System.out.println("------------");
//		}

		/*
		 * i = 1 i = 2 i = 3 i = 4
		 * 
		 */
		GateWay gateway1 = new GateWay();
		Zealot[] zealotArr = new Zealot[5];
		for (int i = 0; i < zealotArr.length; i++) {
			zealotArr[i] = gateway1.createZealot();
		}

		System.out.println(zealotArr[0]);
		// 질럿 17번째 이름을 화면에 출력해주세요
//		System.out.println(zealots[17].getName());
//		System.out.println(zealots[17].getHp());
//		System.out.println(zealots[17].getPower());
//		

	}

}
