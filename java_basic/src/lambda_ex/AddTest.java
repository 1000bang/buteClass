package lambda_ex;

public class AddTest {

	// start of main thread
	public static void main(String[] args) {

		//타입추론 가능
		IAdd iAdd = (int x, int y) -> {
			return x + y;
		};

		System.out.println(iAdd.add(10, 1));

		
		//원래 인터페이스 사용할 때 
		IAdd iAdd2 = new IAdd() {

			@Override
			public int add(int x, int y) {
				return x + y;
			}

		};

	}// end of main

}// end of class

//람다식을 사용하기 위해서는 미리 정의되어 있어야 한다. -> 인터페이스가 !! (단 추상메서드는 반드시 한개이어야 한다.)

interface IAdd {
	public int add(int x, int y);
	// public int minus(); 추상메서드를 하나 더 사용하면 람다식 못 씀
}