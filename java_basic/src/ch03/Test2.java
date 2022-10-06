package ch03;

public class Test2 {

	public static void main(String[] args) {
		
		//주말 과제 - 연산자, 형변환 관련 문제 10개 만들고 해설
		
		
		//1 자동 형변환과 강제 형변환을 설명하고 num1을  double로 자동 형변환 
		// num2를 int로 자동형변환 해라
		int num1 = 100;
		double num2 = 10.231;
		
		double num1_1 = num1;
		int num2_1 =(int)num2;
		
		//2 num1을 가능한 가장 큰 단위로 형변환하고
		//num2를 가능한 가장 작은 단위로 형변환해라
		
		long num1_2 = num1;
		float num2_2 = (float)num2;
		byte num2_3 = (byte)num2;
		
		
		//3 숏서킷을 사용하여 num1 의 값은 그대로
		//num2의 값은 정수로 치환해라 변수이름 New 출력값 F
		
		boolean New = ((num2 = num2 - 0.231) >20) && ((num1 = num1 + 2) > 10);
		System.out.println(New);
		System.out.println(num1);
		System.out.println(num2);
	
		//4 
		//num2 변수를 int로 형변화 할 수 없음을 설명하고
		//num2를 새로운 변수num2_4를 활용하여 int데이터 타입으로 형변환 해라
		// 그리고 논리연산자를 사용하여
		// 두수 중 100보다 크거나 같은 값이 있는지 확인하고 있다면  T를 반환해라
		//변수는 cheack
		
		
		int num2_4 = (int)num2;
		System.out.println(num2);
		boolean cheack = num1 >= 100 || num2 >= 100;
		 System.out.println(cheack);
	
		 
		 //5 두 수 중 어떤 값이 100 이상인 값인지 화면에 출력해라
		double hundred = 0;
		hundred = (num1 >= 100) ? num1 : num2;
		System.out.println(hundred);
		
		
		
	}

}
