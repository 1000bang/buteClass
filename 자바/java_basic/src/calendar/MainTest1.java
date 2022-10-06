package calendar;

public class MainTest1 {

	public static void main(String[] args) {
		HackerNews hackerNews = new HackerNews();
		MyArticle article = new MyArticle("오늘 날씨가 덥네요 ! ~");
		article.setOnWriteArticle(hackerNews.onWriteArticle);// 주입
		article.complete(); // <----- HackerNews에 있는 printArticle 이라는 메서드를 호출하고 싶을때

	}

}
