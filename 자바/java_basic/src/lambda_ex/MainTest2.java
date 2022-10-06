package lambda_ex;

public class MainTest2 {

	public static void main(String[] args) {

		// 매개변수에 데이터타입을 생략해도 됩니다
		// 람다식
		IPrint iPrint = (a, token) -> {
			System.out.println(a + token);
		}; //람다식 선언
		
		// 수행문이 한줄 일 때 중괄호가 생략 가능하다 
		IPrint iPrint2 = (a, token) -> System.out.println(a + token); //람다식 선언

		iPrint.print1("홍길동", "==");
		iPrint2.print1("이순신", "==");
		
		IPrint2 print2 = () -> {return "반가워";};
		System.out.println(print2.print2());
		
	}

}

//어노테이션을 사용하는 이유
// 나는 람다식을 위해 선언했는데 다른 사람이 추상메서드를 하나 더 추가하지 못하게 막음
@FunctionalInterface
interface IPrint {
	void print1(String a, String token);
}

@FunctionalInterface
interface IPrint2{
	String print2();
}