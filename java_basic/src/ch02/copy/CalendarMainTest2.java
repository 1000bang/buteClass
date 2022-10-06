package ch02.copy;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarMainTest2 {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTimeInMillis());
		
		DateFormat format = new SimpleDateFormat();
		String a = format.format(calendar.getTimeInMillis());
		System.out.println(a);
	}

}
