package ch19;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTest3 {

	public static void main(String[] args) {
		// scanner를 생성해서 책정보를 저장
		// arraylist에 담고 crud기능을 사용하는 코드를 만들어주세요
		// 기능들은 함수로 만들어주세요
		// sampledata 를 먼저 만들어서 진행
		final int INSERT = 1;
		final int PRINT = 2;
		final int PRINT_CHOICE = 3;
		final int UPDATE = 4;
		final int DELETE = 5;
		final int EXIT = 0;
		Scanner scanner = new Scanner(System.in);
		ArrayList<Book> books = new ArrayList<>();
		boolean flag = true;
		System.out.println("======== 도서관리 프로그램 ========");
		while (flag) {
			System.out.println(
					"1. 책 정보 입력하기 \t 2. 전체 정보 출력하기 \t 3. 선택정보 출력하기 \t 4. 선택정보 수정하기 \t 5. 선택정보 삭제하기 \t 0. 프로그램 종료");
			int choice = scanner.nextInt();
			if (choice == INSERT) {
				for (int i = 0; i < 5; i++) {
					System.out.println("1. 추가 0. 종료");
					int choice2 = scanner.nextInt();
					if (choice2 == 1) {
						System.out.println("책 번호를 입력하세요");
						String bookNum = scanner.next();
						System.out.println("책 제목을 입력하세요");
						String bookName = scanner.next();
						System.out.println("책의 작가를 입력하세요");
						String bookAuthor = scanner.next();
						Book insertInfo = new Book(bookNum, bookName, bookAuthor);
						books.add(insertInfo);
					} else {
						break;
					}
				}
			} else if (choice == PRINT) {
			//	System.out.println("여기에 오나요??/  choice : " + choice2);
				if (books != null) {
					read(books);
				} else {
					System.out.println("출력할 데이터가 없습니다.");
				}
			} else if (choice == PRINT_CHOICE) {
				System.out.println("출력하고 싶은 번호를 정수로 입력하세요");
				int bookNumChange = scanner.nextInt();
				readChoice(books, bookNumChange);
			} else if (choice == UPDATE) {
				System.out.println("수정하고 싶은 번호를 정수로 입력하세요");
				int indexNum = scanner.nextInt();
				System.out.println("책 번호를 입력하세요");
				String bookNum = scanner.next();
				System.out.println("책 제목을 입력하세요");
				String bookName = scanner.next();
				System.out.println("책의 작가를 입력하세요");
				String bookAuthor = scanner.next();
				Book insertInfo = new Book(bookNum, bookName, bookAuthor);
				// insert함수는 북주소값으로 리턴되었기 때문에 새롭게 대입시켜주고 출력한다.
				Book bookTemp = insert(books, insertInfo);
				books.add(bookTemp);

			} else if (choice == DELETE) {
				System.out.println("삭제하고 싶은 번호를 정수로 입력하세요");
				int bookNumDelete = scanner.nextInt();
				delete(books, bookNumDelete);
			} else if (choice == EXIT) {
				break;
			} else {
				flag = false;
			}

		}

	}

//insert();
	public static Book insert(ArrayList<Book> list, Book book) {
		ArrayList<Book> localList = list;
		localList.add(book);
		return book;
	}

//update();
	public static ArrayList<Book> update(ArrayList<Book> list, int index, Book book) {

		ArrayList<Book> localList = list;
		if (index <= localList.size()) {
			localList.set(index, book);
		} else {
			System.out.println("인덱스값을 초과하였습니다. ");
		}

		return localList;
	}
//public static void update2(ArrayList<Book> list, int index, Bookb book){

//delete();
	public static ArrayList<Book> delete(ArrayList<Book> list, int index) {

		ArrayList<Book> localList = list;
		localList.remove(index);
		return localList;
	}

	// read();
	public static ArrayList<Book> read(ArrayList<Book> list) {

		ArrayList<Book> localList = list;
		for (int i = 0; i < localList.size(); i++) {

			System.out.println(localList.get(i));
		}
		return localList;
	}

	// read(int index); 선택조회
	public static ArrayList<Book> readChoice(ArrayList<Book> list, int index) {

		ArrayList<Book> localList = list;
		localList.get(index);
		return localList;
	}
}
