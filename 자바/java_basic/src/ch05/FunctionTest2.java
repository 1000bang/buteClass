package ch05;

public class FunctionTest2 {

	public static void main(String[] args) {
		double total = 0.0;
		total = minus(100, 10);
		
		System.out.println("결과 값 : " + total );
		
		//참조변수 : 주소값을 가지고 있는 녀석
		Student s1 = new Student();  // s1 = 지역변수 함수안에 선언
		s1.height = 123;  // s1.height = 멤버변수 class 안에 선언 
		
		
		
		
	} //end of main
public static double minus(double n1, double n2) {
	//지역변수 : 스텍메모리에 올라간 녀셕을 지역변수라고 한다. 
	double result = n1 - n2;
	return result;
}
}
