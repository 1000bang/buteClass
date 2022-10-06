package Generic_ex.ch03;

public class Plastic extends Material {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "재료는 플라스틱입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("프린팅 합니다 플");

	}

}
