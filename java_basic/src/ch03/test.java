package ch03;

public class test {

	public static void main(String[] args) {

		double a = 1;
		final int b = 2;
		int c = 3;
		// 상수 활용
		// boolean mValue = ((a = a+10)<10 && ((b = b + 10)>10) b는 상수로 지정하여 값을 바꿀 수 없음
		boolean mValue = ((a = a + 10) < 10) && ((b > 10));
		System.out.println(a);
		System.out.println(b);
		System.out.println(mValue);

		// 형변환 활용 1
		boolean mValue2 = ((a = a + (int) 1.123415) < 10) && ((c = c + 10) < 10);
		System.out.println(a);
		System.out.println(c);
		System.out.println(mValue);

		// a의 데이터타입 을 변환 / 강제 형변환
		boolean mValue3 = ((a = a + 1.123415) < 10) && ((c = c + 10) < 10);
		System.out.println(a);
		System.out.println(c);
		System.out.println(mValue);

		// 상수
		System.out.println("=============================");

		// 1
		// 두 수를 덧셈 연산 하여 result1 변수에 담고
		// 결과값 30.5를 출력 하세요.
		int i = 10;
		double d = 20.5;
		double result1 =  i + d;
		double a1 = 10 + 20.5;
		System.out.println(a1);
		System.out.println(result1);

		// 2
		// result1 변수를 정수형으로 강제 형 변환 해서 출력하세요
		System.out.println((int) result1);

		// 3
		// i 변수의 값을 -1을 뺀 후 출력하세요
		// 단, 단항 연산자 사용
		// System.out.println(i--); 값은 10임을 유의
		System.out.println(--i);

		// 4
		// d 변수에 값을 -20.5로 출력 하세요
		// 단, d 변수에 값을 변경하지 마세요
		System.out.println(-d);

		// 5
		// 변수 i와 d, 관계 연산자를 사용해서 result2 변수를
		// 선언하고 변수에 true 값이 담기도록 식을 만들고
		// 출력하세요

		boolean result2 = i < d;
		System.out.println(result2);

		int num1 = 10;
		int num2 = 30;

		// 6
		// 변수 result3을 선언하고
		// num1과 num2 변수가 숫자 50보다 큰지 논리 연산자를 사용해서 결과를 담고 출력하세요

		// num1 와 num2 가 50보다 큰지 = and &&
		boolean result3 = num1 > 50 && num2 > 50;
		System.out.println(result3);

		// 7
		// num1과 num2 값 중 큰 수를 삼항 연산자를 사용해서
		// max 변수에 값을 담고 출력해주세요
		// 단, 선언과 초기화를 동시에 해주세요
		int max = (num1 >  num2) ? num1 : num2;
		System.out.println(max);

	}

}
