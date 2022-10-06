package calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HackerNews {

	// 1. Calendar .. long
	// 2. Date

	//콜백메서드  메서드를 통해서 구현하는 방법 (옵저버 패턴)
	OnWriteArticle onWriteArticle = new OnWriteArticle() {

		@Override
		public void printNew(String article) {
			System.out.println("*****HackerNews*****");
			System.out.println();
			System.out.println(article);
			System.out.println();
			System.out.println("기사 작성일 : " + nowDate());
		}
	};

	

	private String nowDate() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
		return dateFormat.format(Calendar.getInstance().getTimeInMillis());
	}

//	public static void main(String[] args) {
//		String resultTime = new HackerNews().nowDate();
//		System.out.println(resultTime);
//		new HackerNews().printArticle("국가대표 평가전이");
//	}

}