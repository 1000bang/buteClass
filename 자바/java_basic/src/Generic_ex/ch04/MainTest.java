package Generic_ex.ch04;

public class MainTest {

	public static void main(String[] args) {
		//제네릭 활용법
		//제네릭을 사용해서 사각형 넓이 구하기 
		
		MyPoint<Integer, Double> p1 = new MyPoint<Integer, Double>(10, 0.0);
		MyPoint<Integer, Double> p2 = new MyPoint<Integer, Double>(20, 50.0);
		double result1 = makeRectangle(p1, p2);
		System.out.println(result1);

	}

	//리턴타입을 <X,Y>
	public static <X, Y>  double makeRectangle(MyPoint<X, Y>p1, MyPoint<X, Y>p2) {
		//숫자를 한번에 처리할 수 있는 Number class
		//가로 길이
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		//세로 길이
		double top =((Number)p1.getY()).doubleValue();
		double bottom =((Number)p2.getY()).doubleValue();
		
		double width= right - left;
		double height= bottom - top;
		
		return width * height ;
		
		
	}
}
