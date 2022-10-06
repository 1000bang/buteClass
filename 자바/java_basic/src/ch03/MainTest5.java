package ch03;

public class MainTest5 {
	//start of main
	// main thread
	public static void main(String[] args) {
		// 관계연산자 (비교연산자)
		// 관찰에 결과가 참. 거짓인지 판별할 때 사용한다.
		// 연산에 결과는 오직 T | F 로 반환된다.
		
		int num1 = 5;
		int num2 = 3;
		
		boolean result1 = 5 > 3;
		System.out.println(result1);
		boolean result2 = 5<3;
		System.out.println(result2);
		boolean result3 = (result1 == result2);
		System.out.println(result3);
		boolean result4 = (result1 != result2);
		System.out.println(result4);
		
		
	} //end of main

} //end of class
