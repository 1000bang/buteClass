package ch04;

import java.util.Scanner;

public class WhileMainTest3_1 {

	public static void main(String[] args) {
		
		
		
		Scanner scanner = new Scanner(System.in);
		int userInput = scanner.nextInt();
		
		do {
			System.out.println("**===========**");
			System.out.println("메뉴를 선택해주세요");
			System.out.println("0번 프로그램 종료");
			System.out.println("1번 메인 화면 출력");
			
			userInput = scanner.nextInt();
			
		}while (userInput != 0 );
			
		
		System.out.println("프로그램을 종료 하였습니다.");
			
		
	
		
		
		
		
		
		
		
		
		

	}
} 
