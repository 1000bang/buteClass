package Generic_ex.ch01;

public class MainTest {
	public static void main(String[] args) {

		Powder powder = new Powder();
		Plastic plastic = new Plastic();

		ThreeDPrinter1 printer1 = new ThreeDPrinter1();
		ThreeDPrinter2 printer2 = new ThreeDPrinter2();
		ThreeDPrinter3 printer3 = new ThreeDPrinter3();

		// 1번 기기 재료넣기
		printer1.setMaterial(powder);
		System.out.println(printer1.getMaterial());

		// 2번기기

		printer2.setMaterial(plastic);
		System.out.println(printer2.getMaterial());

		// 3번 기기 오브젝트 클래스 이용
		System.out.println("============");
		printer3.setMaterial(plastic);
		Plastic usePlastic = (Plastic) printer3.getMaterial();
		System.out.println(usePlastic);
	
		printer3.setMaterial(powder);
		System.out.println(printer3.getMaterial());
		Powder usePowder = (Powder) printer3.getMaterial();
		System.out.println(usePowder);
	}

}
