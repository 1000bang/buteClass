package calendar;

//콜리 호출자로 만들어보자 - 편지를 전달할 객체의 주소값을 알고 있어야한다. 
public class MyArticle {

	String article;
	OnWriteArticle onWriteArticle;

	public MyArticle(String article) {
		this.article = article;
	
	}

	public void setOnWriteArticle(OnWriteArticle onWriteArticle) {
		this.onWriteArticle = onWriteArticle;
	}

	public void complete() {
		onWriteArticle.printNew(this.article);
	}

}
