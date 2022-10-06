package Generic_ex.ch03;

//T  제네릭 상속 문법
public class GenericPrinter<T extends Material> {

	// 제네릭 연산자 <T>

	private T material; // T자료형으로 선언한 변수

	public T getMaterial() { // T자료형으로 반환하는 제네릭 메서드
		return material;
	}

	// T 자료형 매개변수가 사용되는 메서드를 제네릭 메서드라 한다.
	public void setMaterial(T meterial) {
		this.material = meterial;
	}

	@Override
	public String toString() {
		return material.toString();
	}

	public void printing() {
		material.doPrinting();
	}

}
