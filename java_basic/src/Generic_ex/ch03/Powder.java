package Generic_ex.ch03;

public class Powder extends Material {

	@Override
	public String toString() {

		return "재료는 powder입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("프린팅합니다 파");

	}

}
