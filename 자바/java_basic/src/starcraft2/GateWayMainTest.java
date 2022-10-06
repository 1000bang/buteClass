package starcraft2;

import java.util.Scanner;

public class GateWayMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GateWay gateWay1 = new GateWay();
		GateWay gateWay2 = new GateWay();
//		Zealot zealot1 = gateWay1.createZealot();
//		Zealot zealot2 = gateWay1.createZealot();
//		Zealot zealot3 = gateWay2.createZealot();
//		Zealot zealot4 = gateWay2.createZealot();
//		Zealot zealot5 = gateWay1.createZealot();
//		Dragon dragon1 = gateWay1.createDragon();
//		// 질럿이 총 몇마리 생성 되었는가를 데이터로 저장하고 관리하고 싶다면
//		System.out.println(GateWay.zealotTotalCount);

		// 게이트웨이에서 1을누르면 질럿이 2를 누르면 드라군이
		// 포를 돌려서 한번에 다섯개 까지 뽑을 수 있게
		System.out.println("게이트웨이를 고르세요");
		System.out.println("1 : 게이트웨이 1\t2 : 게이트웨이2");
		System.out.println("생성할 유닛을 고르세요");
		System.out.println("1. 질럿\t2.드라군");
		Scanner scanner1 = new Scanner(System.in);
		int choice1 = scanner1.nextInt();
		if (choice1 == 1) {
			System.out.println("몇마리 생성하시겠습니까? 5마리 까지 가능");
			Scanner scanner2 = new Scanner(System.in);
			int choice2 = scanner2.nextInt();
			for (int i = 1; i <= choice2; i++) {
				Zealot zealot1 = gateWay1.createZealot();
			}
		} else if (choice1 == 2) {
			System.out.println("몇마리 생성하시겠습니까? 5마리 까지 가능");
			Scanner scanner3 = new Scanner(System.in);
			int choice3 = scanner3.nextInt();
			for (int i = 1; i <= choice3; i++) {
				Dragon dragon1 = gateWay1.createDragon();
			}
		}else {
			System.out.println("잘못된 입력입니다.");
		}

		// 마린, 저글링 배열선언(참조타입)
		// 정수배열 기본데이터타입
		// 1. 배열 사용해서 객체를 생성하고 주소값들을 통으로 메모리
		// 2, 스캐너 사용해서 값에 따라서 객체들 동작시켜보세요

		// 1. 메모리 객체 질럿 3올라가있다
		// 2. 스캐너 사용해서 123 선택해서 공격할수 있도록 설계
		
		// 2번문제
		// 북 데이터를 입력하고
		// 북 데이터  조회하는 기능을 만들어주세요
		// 스캐너 활용, 배열활용
		// 1. 누르면 북정보를 저장하는 기능 만들어주고
		// 2. 전체북에대한 정보를 출력하는 기능을 만들어주기
		// 3. 예를들어 북이 3개 있다면 2번누르면 2번에 대한 북에 정보가 
		
		
		
	}

}
