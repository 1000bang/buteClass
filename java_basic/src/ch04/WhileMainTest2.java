package ch04;

public class WhileMainTest2 {

	//코드의 시작점
	//메인 쓰레드
	public static void main(String[] args) {
		/* while(조건식){
		  수행문;
		  }
		 
		 do {
		 수행문;
		 }while (조건식);{
		 수행문;
		 }
		 
		 
		 */
		
		int num = 1;
		int sum = 0;
		
		do {
			System.out.println("현재 값 : " + num);
			sum += num ;
			num ++;
		}while (num <= 10); 
		
		
		
		
		
			System.out.println("sum에 대한 결과값은 :" + sum);
			
			
			//1. 
			int input = 10;
			int inputSum = 0;
			
			//do while문을 활용해서
			// 10 + 9 + 8 +  .. + 1 에 대한 연산을 하고 화면에 출력하세요
			// do while 반드시 한번은 수행이 되어야 할 때 사용하는 구문
			
			do { 
				
				
				inputSum += input;   //inputsum 10 input 9 / inputsum 19 input 8 /inputsum 27 input 7 
													// inputsum 34 input 6 / inputsum40 input 5 /inputsum 45 input 4
													//inputsum 49 input 3 /inputsum 52 input 2 / inputsum 54 input 1 / inputsum 55 
				input --;
				
			}while (input >= 1 );
			
			
		
			System.out.println("sum에 대한 결과값은 :" + inputSum);
		
		
		
		
		
		
		
	}//end of main

}//end of class
