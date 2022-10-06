package student;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {

		Bus bus1 = new Bus("83번");
		Subway subway1 = new Subway("2호선");
		Student student1 = new Student("김개똥");
		Lunch lunch1 = new Lunch();
		
		student1.getOnBus(bus1);

		// 오늘 학교 갈 때 뭐타고 갔나요?
		// 1.버스 2. 지하철

		// 학교에서 뭐먹었나요?
		// 1. 된장찌개 2. 불고기 3. 카레

		// 집으로 올 때 뭐타고 왔나요?
		// 1. 버스 2지하철
		/*
		 * System.out.println("집 -> 학교  : " + ); System.out.println("점심메뉴  : ");
		 * System.out.println("학교 -> 집  : ");
		 */

		// showinfo 남은 돈
		final int BUS = 1;
		final int SUBWAY = 2;
		final int MISO = 1;
		final int GOGI = 2;
		final int CURRY = 3;
		
		while (student1.getBudget() > 0) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("----------------");
		System.out.println("오늘 학교 갈 때 뭐타고 갔나요?");
		System.out.println("1.버스\t2. 지하철");
		int choice = scanner.nextInt();
		if (choice == BUS) {
			student1.getOnBus(bus1);
			
		}else if (choice == SUBWAY) {
			student1.getOnSubway(subway1);
			
		}else {
			System.out.println("학교를 안갔습니다");
			continue;
		}
		System.out.println("================");
		System.out.println("학교에서 뭐먹었나요?");
		System.out.println("1. 된장찌개\t2. 불고기\t3. 카레");
		int choice1 = scanner.nextInt();
		if (choice1 == MISO) {
			student1.eatMiso(lunch1);
		}else if (choice1 == GOGI) {
			student1.eatGogi(lunch1);
		}else if (choice1 == CURRY) {
			student1.eatCurry(lunch1);	
		}else {
			System.out.println("밥을 굶었습니다.");
		}
		System.out.println("================");
		System.out.println("집으로 올 때 뭐타고 왔나요?");
		System.out.println("1.버스\t 2.지하철");
		int choice2 = scanner.nextInt();
		if (choice2 == BUS) {
			student1.getOnBus(bus1);
			
		}else if (choice2 == SUBWAY) {
			student1.getOnSubway(subway1);
			
		}else {
			System.out.println("가출");
			 break;
		}
		}//end of while
		System.out.println("================");
		System.out.println("용돈을 다썼습니다.");
		
		
		//버스의 수익
		System.out.println("버스 수익");
		
		//지하철의 수익
		System.out.println("지하처");
		//식당의 수익
		
		
		
	}//end of main

} //end of class

//ctrl + shift + o