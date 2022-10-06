package ch12;

public class BookMainTest1 {

	public static void main(String[] args) {

		Book book1 = new Book("플러터UI실전", "김근호", 100);
		Book book2 = new Book("무궁화 꽃이 피었습니다.", "김진명", 200);
		Book book3 = new Book("흐르는 강물처럼", "파울로코엘료", 150);
		Book book4 = new Book("리딩으로 리드하라", "이지성", 340);
		Book book5 = new Book("사피엔스", "뉴발하라리", 120);

		// 문제
		// 배열을 이용해서 shoppingCart 변수에 담아봅시다.
		Book[] shoppingCart = new Book[10];

		// 1.배열 크기를 10개로 만들어주세요
		// 2. 사고싶은 책을 장바구니에 담아봅시다 . 3개만 인덱스연산
		shoppingCart[0] = book1;
		shoppingCart[1] = book3;
		shoppingCart[2] = book5;

		// 3. 장바구니에 담은 책을 화면에 출력해주세요 포문활용 출력
		for (int i = 0; i < shoppingCart.length; i++) {
			if (shoppingCart[i] != null) {
				System.out.println(shoppingCart[i].getTitle());
			}
		}

		// 4. 0번째 인덱스에 있는 녀석과 2번째에 있는 녀석을 스왑해주세요 인덱스연산
		shoppingCart[3] = shoppingCart[2];
		shoppingCart[2] = shoppingCart[0];
		shoppingCart[0] = shoppingCart[3];

		System.out.println("0번 인덱스 : " + shoppingCart[0].getTitle() + "/" + shoppingCart[0].getAuthor());
		System.out.println("2번 인덱스 : " + shoppingCart[2].getTitle() + "/" + shoppingCart[2].getAuthor());

		// 5. 3번째 인덱스에 있는녀석 삭제
		shoppingCart[2] = null;
		System.out.println(shoppingCart[2]);
	}

}
