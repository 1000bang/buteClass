package Generic_ex.ch02;

public class GenericPrinter<T> {

	// 제네릭 연산자 <T>

	// T라는 대체문자를 사용 E,K,V type, element, key, value (아무 문자나 사용 가능)
	// 자료형 매개변수(type parameter)

	private T meterial; // T자료형으로 선언한 변수

	public T getMeterial() { //T자료형으로 반환하는 제네릭 메서드
		return meterial;
	}

	
	//T 자료형 매개변수가 사용되는 메서드를 제네릭 메서드라 한다.
	public void setMeterial(T meterial) {
		this.meterial = meterial;
	}
	
	
	@Override
	public String toString() {
		
		return super.toString();
	}

}
