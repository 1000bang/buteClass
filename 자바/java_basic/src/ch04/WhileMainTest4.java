package ch04;

import java.util.Random;
import java.util.Scanner;

public class WhileMainTest4 {
	//코드의 시작점 메인쓰레드
	public static void main(String[] args) {
		
		//스캐너를 활용해서 간단한 콘솔 게임 만들기 !
		// 
		Random  random = new Random();
													// 0~2를 반환함  1~3을 만들고 싶어 +1 해줌
		int randomResult = random.nextInt(5)+1; 
	//	System.out.println(randomResult);
		
		// 야구 게임( 사용자한테 입력을 받아서 3번 안에  randomResult 값을 맞추는 게임)
		// 조건 3번 안에  값을 맞추면 안타입니다. 화면에 출력 3번다 틀렸으면 아웃입니다 출력
//		System.out.println("**=====야구게임======**");
//		
//		Scanner scanner = new Scanner(System.in);
//		int userInput;
//		int count = 5;
//		
//		
//		do {
//		System.out.println("1~5 숫자를 입력하세요");
//		userInput = scanner.nextInt();
//		if (userInput == randomResult){
//		System.out.println("안타입니다");
//			break;	
//		}
//		System.out.println("틀렸습니다. 기회 : " + --count );
//		
//		if (count == 0) {
//			System.out.println("아웃입니다");
//			break;
//		}
//			
//		}while (userInput != randomResult);
		
			
//		int randomResult1 = random.nextInt(5)+1; 
//		System.out.println(randomResult1);
//		
//		
//		System.out.println("야구게임");
//		Scanner scanner = new Scanner(System.in);
//		int userInput1 ;
//		
//		for (int a = 1; a <= 3; a++ ) {
//			System.out.println("1~5 숫자를 입력하세요");
//			userInput1 = scanner.nextInt();
//			if (userInput1 == randomResult1) {
//				System.out.println("안타입니다");
//				break;
//			}else {
//				System.out.println("틀렸습니다. " + a + "아웃" );
//			}
//		}
		
		int randomResult1 = random.nextInt(5)+1; 
		System.out.println(randomResult1);
		
		
		System.out.println("야구게임");
		Scanner scanner = new Scanner(System.in);
		int userInput1 ;
		int count = 0;
		do {
			System.out.println("1~5 숫자를 입력하세요");
			userInput1 = scanner.nextInt();
			
			if(userInput1 == randomResult1) {
				System.out.println("안타 입니다.");
				break;
				
			} else {
				System.out.println("스트라이크 입니다.");
				if(count >= 3) {
					System.out.println("아웃입니다.");
					break;
				}
			}
			
			count++;
			
		} while(userInput1 != randomResult);
		
		
		// do while 문 순서
		/* 
		 
		 */

		
		
		
		
	} //end of main

}// end of class
