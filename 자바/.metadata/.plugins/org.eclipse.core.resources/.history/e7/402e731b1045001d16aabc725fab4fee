package ch18;

public class Book {
	private int bookId;
	private String title;
	private String author;

	public Book(int bookId, String title, String author) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {

		return this.title;
	}

	// 원래 equals는 주소값을 비교했다
	// equals를 재정의해 글자가 같은지 비교해보자
	@Override
	public boolean equals(Object obj) {
		// 도전과제!!
		// 현재 객체의 title과 obj안에 들어오는 녀석의 title글자가 같다면 true 아니면 false
		// 1. 단계 this.title과 object녀석 title값이 같다면 같은책이라고 앞으로 판별하겠어
		// 2. object타입은 모든클래스의 최상위이기 때문에 아무것이든 들어올 수 있다. : 문제해결
		// 3. 추가적인 데이터가 필요하면 코드를 추가하면된다.
		// 4. 책이름과 저자가 같다면 같은책으로 판별하겠어

		if (obj instanceof Book) {
			Book tempBook = (Book) obj;
				return this.title == tempBook.title && this.author == tempBook.author;
			}
		return false;
		
		
//		if (obj instanceof Book) {
//			Book tempBook = (Book) obj;
//			if (this.title == tempBook.title && this.author == tempBook.author) {
//				return true;
//			}
//		}
//		return false;
		// return this.title == ((Book) obj).title;

	}
}