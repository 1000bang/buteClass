package ch04;

import java.util.Scanner;

public class WhileMainTest3 {

	public static void main(String[] args) {
		System.out.println("**===========**");
		System.out.println("메뉴를 선택해주세요");
		System.out.println("0번 프로그램 종료");
		System.out.println("1번 메인 화면 출력");
		
		
		
		Scanner scanner = new Scanner(System.in);
		int userInput = scanner.nextInt();
		
		while(userInput == 1) {
			
			System.out.println("메인화면을 출력합니다.");
			System.out.println("**===========**");
			System.out.println("메뉴를 선택해주세요");
			System.out.println("0번 프로그램 종료");
			System.out.println("1번 메인 화면 출력");
			
		
			 //사용자에게 한번 더 입력을 받아야 함 
			userInput = scanner.nextInt();		
			if (userInput == 0) {
				break;
			
			} 
		}
		
		
		
		
		
		
		
		
		

	}

}
