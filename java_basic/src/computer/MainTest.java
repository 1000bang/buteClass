package computer;

public class MainTest {

	public static void main(String[] args) {
	
		//데스크탑 출력
		Computer desktop1 = new DeskTop();
		desktop1.display();
		desktop1.typing();
		System.out.println();
		//abstract화 된거는 인스턴스화 할 수 없기 때문에 
		// 기본 클래스 형태의 하위 클래스인 mynotebook을 활용한다. 
		Computer noteBook1 = new MyNoteBook();
		noteBook1.display();
		noteBook1.typing();
		

	}

}
