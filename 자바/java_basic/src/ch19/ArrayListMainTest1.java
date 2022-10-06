package ch19;

import java.util.ArrayList;

public class ArrayListMainTest1 {

	public static void main(String[] args) {

//		Book book1 = new Book(1, "흐르는강물처럼", "파울로코엘료");
//		Book book2 = new Book(2, "플러터UI실전", "김근호");
//		Book book3 = new Book(3, "무궁화꽃이피었습니다", "김진명");
//		Book book4 = new Book(4, "리딩으로리드하라", "이지성");
//		Book book5 = new Book(5, "사피엔스", "유발하라리");

		// arrayList란
		// 배열을 보다 쉽게 사용할 수 있도록 설계된 클래스

		// 데이터를 담을 공간 만들기
		// 제네릭 <> : 어떤데이터 타입이 들어올 지 지정해줌
		// 여기선 북타입만 들어오게한다.
		ArrayList<Book> cart = new ArrayList<>();
		// 주소값이 아닌 데이터가 나오는 이유
		// 재정의 해놨음
		
		
		// 1. 데이터를 추가하는 방법
//		cart.add(book1);
//		cart.add(book2);
//		cart.add(book3);
		System.out.println("------------");
		//2. 값을 꺼내는 방법 get
		Book b1 = cart.get(0);
//		System.out.println(b1);
//		System.out.println(cart.get(1));
//		System.out.println(cart.get(2));
//		System.out.println(cart);
//		// cart.length와 같음 cart.size()

//		for (int i = 0; i < cart.size(); i++) {
//		// 2. 값을꺼내는방법
//			//System.out.println(cart.get(i));
//			cart.get(i).showInfo();
//		}
//		System.out.println("-------------------");
//		// 초기화 for문을 사용해서 showinfo를 호출해주세요
//		for (Book b : cart) {
//			//data가 b에 담긴다.
//			b.showInfo();
//		}
	
		//3. 삭제하는 방법
		cart.remove(1);
		System.out.println();
		for (int i = 0; i < cart.size(); i++) {
			System.out.println("i : " + i);
			cart.get(i).showInfo();
		}
		System.out.println("======================");
		//4. 수정하는 방법
		Book tempBook = cart.get(1);
		System.out.println(tempBook.toString());
//		cart.set(1, book5); //수정완료
		Book tempBook2 = cart.get(1);
		System.out.println("수정 후 데이터 : " + tempBook2.toString());
		
		// arraylist의 crud 
		
	}

}
