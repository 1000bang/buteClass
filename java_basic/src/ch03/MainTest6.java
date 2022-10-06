package ch03;

public class MainTest6 {
	// start of main
	// main thread

	public static void main(String[] args) {

		// 논리 연산자 (&&, ||) 엠퍼센트 , 버티컬 바
		// 관계 연산자와 혼합하여 많이 사용한다.
		// 연산에 결과 값은 (반환값은) True, False

		//논리곱 && =And
		//논리곱 : 하나라도 거짓이 있으면 연산에 결과는 false이다.
		int num1 = 10;
		int num2 = 20;
		boolean flag1 = (num1 > 0) && (num2 > 0);
		System.out.println(flag1);
		flag1 = (num1 > 0) && (num2 < 0);
		System.out.println(flag1);
		
		//논리합 || = Or
		//논리합 : 하나라도 참이면 연산에 결과는 True이다.
		boolean flag2 = (num1<0) || (num2>0);
		System.out.println(flag2);
		
		// 부정 ! = not
		System.out.println(flag2);
		System.out.println(!flag2);
		
		
		System.out.println("===========");
		boolean flag3 = !(5>3);
		
		////////////////////////////////////////////
		//short circuit
		
		int n = 5;
		int i  = 0;
//		
//		boolean mValue = ((n = n + 10) > 10) && ((i = i + 2) < 10);
//		
//		System.out.println(n);
//		System.out.println(i);
//		System.out.println(mValue);
		
		boolean mValue = ((n += 10) < 10) && ((i += 2) < 10);
		//short circuit evaluation
		// 앞에 항이 거짓이라서 뒤는 보지도 않음
		// 따라서 i의 값은 변하지 않음
		System.out.println(n);
		System.out.println(i);
		System.out.println(mValue);
		
		boolean mValue2 = ((n = n + 10) < 10) || ((i = i + 2) < 10);
		System.out.println(n);
		System.out.println(i);
		System.out.println(mValue);

		//short circuit evaluation
		
		
		
	}// end of main

}// end of class
