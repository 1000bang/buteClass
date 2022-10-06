package ch03;

public class MainTest1 {
	//메인 작업자(쓰레드)
	//main함수는 코드의 시작점
	public static void main(String[] args) {
	
		//부호연산자 (+, -)
		int number = 10;
		System.out.println(number);
		System.out.println(-number);
		// 실제 변수에 부호를 변경하려면 대입 연산자를 사용해 주어야 한다. 
		//number = -10; 혹은 
		number = -number;
		System.out.println(number);
		
		
		
		
		
	}//end of main

}//end of class
