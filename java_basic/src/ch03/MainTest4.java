package ch03;

public class MainTest4 {

	//코드의 시작점
	//메인 쓰레드
	public static void main(String[] args) {

		


		//증감, 연산자
		// 변수에 접근해서 +1 혹은 -1 시키는 거
		
		int num1 = 1;
		//num1 = num1 +1;  귀찮아~
		num1++;
		System.out.println(num1);
		
		
		int num2 = 2;
		//num2 = num2 -1;  귀차ㅣ나
		num2--;
		--num2; //앞에 붙여도 되고 뒤에 붙여도 되고
		System.out.println(num2);
		
		int num3 = 10;
		int num4 = num3++; 
		int num5 = ++num3;
		//statement 기준으로 앞에 있을 때와 뒤에 있을 때 다르게 동작한다.
		//증감 연산자가 뒤에 있으면 statement(;) 가 끝나고 증감연산자가 동작 
		//앞에 있으면 변수 안에서 동작 
		//실무에서는 뒤에서 많이 씀
		
		System.out.println(num3);
		System.out.println(num4); 
		System.out.println(num5);
		
				
		
	} //end of main

} // end of class
