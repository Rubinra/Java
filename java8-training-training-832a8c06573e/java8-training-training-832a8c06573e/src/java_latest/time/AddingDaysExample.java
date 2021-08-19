package java_latest.time;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AddingDaysExample {

	public static void main(String[] args) {
		

		LocalDate date1 = LocalDate.parse("2016-12-10");
		LocalDate date2=date1.plusDays(5);
		System.out.println(date2);
		
		LocalDateTime time1 = LocalDateTime.parse("2017-10-03T10:15:30");
		LocalDateTime time2 = time1.minusHours(24);
		System.out.println(time2);
		
	}

}
