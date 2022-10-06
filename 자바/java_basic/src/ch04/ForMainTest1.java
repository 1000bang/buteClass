package ch04;

import java.util.Scanner;

public class ForMainTest1 {

	//main thread
	// start of main
	
	public static void main(String[] args) {
		
		//화면에 구구단 2단을 출력해 보세요
		//for문 배우기 전 하나하나 출력;;
		System.out.println("----------2단------------");
		System.out.println(" 2 * 1 = 2 ");
		System.out.println(" 2 * 2 = 4 ");
		System.out.println(" 2 * 3 = 6 ");
		System.out.println(" 2 * 4 = 8 ");
		System.out.println(" 2 * 5 = 10 ");
		System.out.println(" 2 * 6 = 12 ");
		System.out.println(" 2 * 7 = 14 ");
		System.out.println(" 2 * 8 = 16 ");
		System.out.println(" 2 * 9 = 18 ");
		
		//변수 활용
		int num = 2;
		System.out.println("----------2단(변수)------------");
		System.out.println(num + " * 1 = " + (num * 1));
		System.out.println(num +" * 2 = " + (num * 2));
		System.out.println(num +" * 3 = " + (num * 3));
		System.out.println(num +" * 4 = " + (num * 4));
		System.out.println(num +" * 5 = " + (num * 5));
		System.out.println(num +" * 6 = " + (num * 6));
		System.out.println(num +" * 7 = " + (num * 7));
		System.out.println(num +" * 8 = " + (num * 8));
		System.out.println(num +" * 9 = " + (num * 9));
		
		//화면에 구구단 3단을 출력해 보세요
		System.out.println("----------3단------------");
		num = 3;
		System.out.println(num + " * 1 = " + (num * 1));
		System.out.println(num +" * 2 = " + (num * 2));
		System.out.println(num +" * 3 = " + (num * 3));
		System.out.println(num +" * 4 = " + (num * 4));
		System.out.println(num +" * 5 = " + (num * 5));
		System.out.println(num +" * 6 = " + (num * 6));
		System.out.println(num +" * 7 = " + (num * 7));
		System.out.println(num +" * 8 = " + (num * 8));
		System.out.println(num +" * 9 = " + (num * 9));
		
		//화면에 구구단 4단을 출력해 보세요
		System.out.println("----------4단------------");
		num ++;
		System.out.println(num + " * 1 = " + (num * 1));
		System.out.println(num +" * 2 = " + (num * 2));
		System.out.println(num +" * 3 = " + (num * 3));
		System.out.println(num +" * 4 = " + (num * 4));
		System.out.println(num +" * 5 = " + (num * 5));
		System.out.println(num +" * 6 = " + (num * 6));
		System.out.println(num +" * 7 = " + (num * 7));
		System.out.println(num +" * 8 = " + (num * 8));
		System.out.println(num +" * 9 = " + (num * 9));
		
		//화면에 구구단 5단을 출력해 보세요
		
		System.out.println("----------5단------------");
		num ++;
		System.out.println(num + " * 1 = " + (num * 1));
		System.out.println(num +" * 2 = " + (num * 2));
		System.out.println(num +" * 3 = " + (num * 3));
		System.out.println(num +" * 4 = " + (num * 4));
		System.out.println(num +" * 5 = " + (num * 5));
		System.out.println(num +" * 6 = " + (num * 6));
		System.out.println(num +" * 7 = " + (num * 7));
		System.out.println(num +" * 8 = " + (num * 8));
		System.out.println(num +" * 9 = " + (num * 9));
		
		//반복적인 코드가 있으면 반복문을 쓰면 됨
		//문법 모양
		//for (조건식) { 수행문; }
		//조건식에 맞다면 수행문을 반복함
		// 조건식 : 3개의 식을 넣을 수 있음  초기화 구문, 조건식, 증감식 
		System.out.println("----------for문------------");
		num = 2;
		for (int i = 1; i < 10; i++ ) { 
			System.out.println(num +" * "+ i +" = " + (num * i));
			}
		
		
		//for문 활용해서 3-9단 까지 출력
		System.out.println("----------for3단------------");
		num = 3;
		for (int i = 1; i < 10; i++ ) { 
			System.out.println(num +" * "+ i +" = " + (num * i));
			}
		
		System.out.println("----------for4단------------");
		num ++;
		for (int i = 1; i < 10; i++ ) { 
			System.out.println(num +" * "+ i +" = " + (num * i));
			}
		
		System.out.println("----------for5단------------");
		num ++;
		for (int i = 1; i < 10; i++ ) { 
			System.out.println(num +" * "+ i +" = " + (num * i));
			}
		
		System.out.println("----------for6단------------");
		num ++;
		for (int i = 1; i < 10; i++ ) { 
			System.out.println(num +" * "+ i +" = " + (num * i));
			}
		
		System.out.println("----------for7단------------");
		num ++;
		for (int i = 1; i < 10; i++ ) { 
			System.out.println(num +" * "+ i +" = " + (num * i));
			}
		
		System.out.println("----------for8단------------");
		num ++;
		for (int i = 1; i < 10; i++ ) { 
			System.out.println(num +" * "+ i +" = " + (num * i));
			}
		
		System.out.println("----------for9단------------");
		num ++;
		for (int i = 1; i < 10; i++ ) { 
			System.out.println(num +" * "+ i +" = " + (num * i));
			}
		
		System.out.println("----------단수를 입력받아 구구단 출력-----------");
		System.out.println("단수를 입력해 주세요");
		Scanner scanner = new Scanner(System.in);
		int dan = scanner.nextInt();
		
		for (int a = 1; a < 10; a++ ) {
			System.out.println(dan + "*" + a + "=" + (dan * a));
		}
			
		
		
	} //end of main	
} // end of class