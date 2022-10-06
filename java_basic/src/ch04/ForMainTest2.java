package ch04;

import java.util.Scanner;

public class ForMainTest2 {

	// main thread
	// start of main

	//변수를 스스로 생각해서 만들어서 ㅎ활용하고 
	//실행에 흐름을 제어하고(if) 반복적인 패턴이 보인다면 for문을 활용할 수 있는가?
	
	public static void main(String[] args) {

		// 1부터 100까지 연산에 합을 화면에 출력해 보세요
		// 단 반복문 활용
		// 1 + 2 + ...+ 100 = ??
		int result = 0; //빈데이터를 가진 변수 선언 후 for문을 통해 데이터 저장
		int maxNumber = 77;
		int i;
		for (i = 1; i <= 100; i++) {
			//연산한 값을 담아줘야 해
			//	int  result = i + i + 1; 반복문 안에서 변수를 선언하면 반복문이 실행 될 때마다 새로운 변수 result가 생성됨
			//익숙치 않으면 로깅 기법을 사용해서 값을 확인하고 데이터 출력 
			System.out.println("result : " + result + " /  i : " + i);
			
			result = result + i;
			System.out.println("1부터" + i +" 까지의  합은"+ result );
		} 
			System.out.println("");
			System.out.println("1부터 100까지의  합은"+ result +"입니다.");
	
			// 조건문을 for(int i = 1; i<= maxNumber; i++)로 바꾸면
			//System.out.println("1부터" +maxNumber + "까지의 합은 : "  + result);
			
			 //사용자가 입력한 값을 받아서 처리할 수 있도록하는 코드로 수정
			
			System.out.println("------------------");
			System.out.println("maxNum을 입력해 주세요");
			Scanner scanner = new Scanner(System.in);
			int maxNumber_1 = scanner.nextInt();
			int result_1 = 0;
			for (int i_1 = 1; i_1 <= maxNumber_1; i_1++) {
				result_1 = result_1 + i_1;
				
			} 
				System.out.println("1부터 " + maxNumber_1 + "까지의 합은 : "  + result_1);
		
			
			
	} // end of main
} // end of class
