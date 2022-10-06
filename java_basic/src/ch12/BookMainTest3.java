package ch12;

import java.util.Scanner;

public class BookMainTest3 {

	public static void main(String[] args) {
	
		
		Book[] dataBox = new Book[100];
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		
		while (flag) {
			System.out.println("--------메뉴 선택---------");
			System.out.println("1. 책정보 입력하기 2. 책정보 출력하기 3. 선택조회 4. 선택삭제, 5. 전체삭제 0. 종료");
			String choice = scanner.nextLine();
			
			if(choice.equals("1")) {
				for (int i = 0; i < dataBox.length; i++) {
					System.out.println("=========책 정보 기입하기 ===========");
					System.out.println("제목을 입력하세요");
					String data1 = scanner.next();
					System.out.println("작가를 입력하세요");
					String data2 = scanner.next();
					System.out.println("페이지 수를 입력하세요");
					int data3 = scanner.nextInt();
					dataBox[i] = new Book(data1, data2, data3);
					System.out.println("1권 추가되었습니다");
					System.out.println("--------------------------");
					System.out.println("더 추가하시겠습니까?\n1.추가한다\t2. 끝");
					int data4 = scanner.nextInt();
					if (data4 == 1) {
						continue;
					} else if (data4 == 2) {
						System.out.println("종료되었습니다.");
						break;
					} else {
						System.out.println("잘못누르셨습니다.");
						break;
					}
				}
			}else if(choice.equals("2")) {
				
				
			}else if(choice.equals("3")) {
				System.out.println("=====선택 조회하기=======");
				System.out.println("1. 순서보기 2. 바로출력하기");
				int data5 = scanner.nextInt();
				if (data5 == 1) {
					for (int i = 0; i < dataBox.length; i++) {
						System.out.println(i + " 번  :" + dataBox[i].getTitle());
						if (dataBox[i] == null) {
							break;
						}
					} // end of for
				} else if (data5 == 2) {
					System.out.println("출력하고 싶은 정보의 번호를 눌러주세요");
					int data6 = scanner.nextInt();
					System.out.println("------책 정보 -----");
					System.out.println(dataBox[data6].getTitle());
					System.out.println(dataBox[data6].getAuthor());
					System.out.println(dataBox[data6].getTotalPage());
				}
				
			}else if(choice.equals("4")) {
				
			}else if(choice.equals("5")) {
				
			}else {
				flag = false;
			}
			
		}
		
		

	}

}
