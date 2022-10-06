package ch04;

public class ForMainTest3 {
	// main thread
	// start of main
	public static void main(String[] args) {

		// 2 ~9단까지의 구구단 출력
		// 2중 for문을 사용해서 코드를 더 간소화
		for (int num = 2; num <= 9; num++) {
			// System.out.println("num : " + num );
			for (int i = 1; i < 10; i++) {
				System.out.println(num + " * " + i + " = " + (num * i));		
			}
			// 5단과 6단 사이에 ---값을 출력하지 마시오 단, 예약어 사용

			if (num == 5)
				continue;
			//continue는 아래구문을 무시하고 다시 위로 올라감
			
			if (num != 9) {
				System.out.println("---------------");
			
			} 
			
			}
		

	} // end of main
} // end of class
