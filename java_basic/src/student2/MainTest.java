package student2;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {

		Bus bus1 = new Bus("83번");
		Subway subway1 = new Subway("2호선");
		Student student1 = new Student("김개똥,", 80_000);
		Lunch lunch1 = new Lunch();
		Bus bus2 = new Bus("100번");
		Subway subway2 = new Subway("1호선");
		Student student2 = new Student("김말똥", 30_000);
		Lunch lunch2 = new Lunch();

		/*
		 * 구상 오늘 학교 갈 때 뭐타고 갔나요? 1.버스 2. 지하철 버스면 몇번버스 남은 용돈 나오게 학교에서 뭐먹었나요? 1. 된장찌개 2.
		 * 불고기 3. 카레 무슨 메뉴 남은 용돈 집으로 올 때 뭐타고 왔나요? 1. 버스 2지하철 수단 + 남은 용돈
		 * 
		 * 
		 */

		// 상수화해서 코드안에서 인지하기 쉽게 만듦
		final int BUS = 1;
		final int SUBWAY = 2;
		final int MISO = 1;
		final int GOGI = 2;
		final int CURRY = 3;

		

		int choice2 = 1;
		int choice3 = 1;
		// 예산이 1000원 이하 일때,  choice3 가 2일 때 둘중 하나라도 false 면 작동을 멈춰라  
		// 동시에 choice2가 1과2가 아니면 멈춰라 
		while (student1.getBudget() > 1000 &&  choice3 == 1 && (choice2 ==1 || choice2 ==2)) {
			// 시작과 동시에 사람이름을 띄워 누구의 지출인지 표시
			System.out.println("========" + student1.getName() + "========");
			
			// for 문 시작 31일 이상이면 종료해라
			for (int a = 1; a <= 31 ; a++) {
				System.out.println("-----------------------");
				System.out.println("8월 " + a + " 일  학교 갈 때 뭐타고 갔나요?");
				System.out.println("1.버스\t2. 지하철");
				// 사용자에게 값을 받음
				Scanner scanner = new Scanner(System.in);
				int choice = scanner.nextInt();
				// choice 가 1. 버스이면 스튜던트 버스타다 행동을 수행해라 게터아님
				if (choice == BUS) {
					student1.getOnBus(bus1);
					// choice 가 2.서브웨이면 스튜던트 지하철타다 행동을 수행해라 게터아님
				} else if (choice == SUBWAY) {
					student1.getOnSubway(subway1);
					// 둘다아니면 학교 안간거임 다 건너 뛰고 처음으로 돌아가라
					// 방어적 레코드
				} else {
					System.out.println("학교를 안갔습니다");
					continue;
				}

				System.out.println("-----------------------");
				System.out.println("학교에서 뭐먹었나요?");
				System.out.println("1. 된장찌개\t2. 불고기\t3. 카레");
				int choice1 = scanner.nextInt();
				if (choice1 == MISO) {
					student1.eatMiso(lunch1);
				} else if (choice1 == GOGI) {
					student1.eatGogi(lunch1);
				} else if (choice1 == CURRY) {
					student1.eatCurry(lunch1);
					// 밥은 굶을 수도 있음 continue 하면 집엘 못감
					// 방어적 레코드
				} else {
					System.out.println("밥을 굶었습니다.");
				}
				System.out.println("-----------------------");
				System.out.println("집으로 올 때 뭐타고 왔나요?");
				System.out.println("1.버스\t 2.지하철");
				 choice2 = scanner.nextInt();
				if (choice2 == BUS) {
					student1.getOnBus(bus1);

				} else if (choice2 == SUBWAY) {
					student1.getOnSubway(subway1);
					// 버스 지하철 아니면 집에 안온거임 가출
					// break 모든 실행 종료
				} else {
					System.out.println("가출");
					break;
				
				}

				// 써보니까 밥값이랑 교통비랑 갭이 커서 밥 못먹는 날이 많음
				// 버짓이 5000원 미만이면 종료할 수 있게 코드 작성
				if (student1.getBudget() < 5000) {
					System.out.println("밥먹을 돈이 부족합니다 계속 하시겠습니까 ?");
					System.out.println("계속하려면 1 \t 끝내려면 2");
					choice3 = scanner.nextInt();
					// 계속할거면 다음 코드 무시하고 다시 위로
					if (choice3 == 1) {
						continue;
						// 끝내고싶으면 break
						// 가장 가까운 반복문 하나를 끝
					} else {
						break;
					}
				}
				System.out.println("-----------------------");

					String ride;
					String ride1;
					String menu;
					if (choice == 1) {
						ride = "버스 ";
					} else {
						ride = "지하철 ";
					}
					if (choice1 == 1) {
						menu = "된장찌개 ";
					} else if (choice1 == 2) {
						menu = "불고기  ";
					} else {
						menu = " 카레  ";
					}
					if (choice2 == 1) {
						ride1 = "버스 ";
					} else {
						ride1 = "지하철 ";
					}
					
					System.out.println("8 월 " + a + "일 지출목록 : " + ride + " + " + menu + " + " + ride1);
			
				
			} // end of for
				// 변수 a 사용 할 수 없음 블록의 범위는 절대
				// System.out.println("8 월" + a + "일 지출 : " );
			System.out.println("-----------------------");
			System.out.println("용돈을 다썼습니다.");
			System.out.println(lunch1.getName() + "의 총 수익 :" + student1.getLunchPay());
			System.out.println(bus1.getName() + "의 총 수익 :" + student1.getBusPay(bus1));
			System.out.println(subway1.getName() + "의 총 수익 :" + student1.getSubwayPay(subway1));
	    
		} // end of while
		
	}// end of main

} // end of class