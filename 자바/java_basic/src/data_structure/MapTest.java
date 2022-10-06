package data_structure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MapTest {

	public static void main(String[] args) {
		final String 데이터추가 = "1";
		final String 데이터확인 = "2";
		
		boolean flag = true;
		Scanner scanner = new Scanner(System.in);
	
		HashMap<String, List> phoneBookMap = new HashMap<>();

		while (flag) {
			System.out.println("1. 데이터 추가 2. 데이터확인 3. 종료");
			String input = scanner.next();

			if (input.equals(데이터추가)) {
				List<String> list = new ArrayList<>();
				System.out.println("순서 입력 ");
				String keyInput = scanner.next();
				System.out.println("이름 입력 ");
				String nameInput = scanner.next();
				System.out.println("전화번호 입력 ");
				String numberInput = scanner.next();
				

				list.add(nameInput);
				list.add(numberInput);
				phoneBookMap.put(keyInput, list);

				System.out.println(phoneBookMap);

			} else if (input.equals(데이터확인)){
				System.out.println("확인하고싶은 순서 입력 ");
				String keyInput = scanner.next();
				System.out.println(phoneBookMap.get(keyInput));
			
				
			}else {
				flag = false;
			}
		}
	}
}
