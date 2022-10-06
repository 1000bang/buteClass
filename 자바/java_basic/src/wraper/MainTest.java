package wraper;

public class MainTest {

	public static void main(String[] args) {
		
		Integer num = new Integer(3);  //boxing 
		Number number = 3;  // 자동 boxing
		
		int n = num.intValue() ; // 언박싱 
		int num1 = num ;  // 자동 언박싱 
		
		

	}

}
