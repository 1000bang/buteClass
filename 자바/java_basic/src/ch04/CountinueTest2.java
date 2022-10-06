package ch04;

public class CountinueTest2 {
	//main thread
	//start of main

	public static void main(String[] args) {
		
		//상수를 활용해서 코드의 가독성을 높여보자.
		//상수만 수정하면 3의배수 5의배수 등을 쉽게 찾을 수 있음
		final int MULTIPLE = 3;
		final int MAX = 1000;
		
		
		int num = 0;
		int count = 0;
		for (num = 1; num < MAX; num++) {
			//만약 3의 배수이면 화면에 출력하지 마시오
			if (num % MULTIPLE ==0) {
				count++;
				continue;
			}
			System.out.println("현재값 : "+ num);
		}
		System.out.println(MULTIPLE + "의 배수는 " +count + "개 입니다.");
			
	} //end of main

} // end of class
