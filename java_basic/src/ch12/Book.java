package ch12;

public class Book {
	// 멤버변수
	private int totalPage;
	private String title;
	private String author;

public Book(String title) {
	this.title = title;
}
	
	public Book(String title, String author) {
		this(title);
		this.author = author;
	}
	
	
	public Book(String title, String author, int totalPage) {
		this(title, author);
		this.totalPage = totalPage;
	}
	

	
	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage() {
		this.totalPage = totalPage;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor() {
		this.author = author;
	}
	
	public void setData(String title, String author, int totalPage){
		this.title = title;
		this.author = author;
		this.totalPage = totalPage;
	}
	
	
	public void showInfo() {
		System.out.println("-----책 정보------");
		System.out.println("책 제목 : " + this.title);
		System.out.println("작가  : " + this.author);
		System.out.println("쪽수 : " + this.totalPage);	
	}
}
