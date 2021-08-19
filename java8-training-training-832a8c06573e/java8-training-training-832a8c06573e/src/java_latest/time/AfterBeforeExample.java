package java_latest.time;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AfterBeforeExample {

	public static void main(String[] args) {
		
		LocalDate date1 = LocalDate.of(2012, 2, 1);
		LocalDate date2 = LocalDate.parse("2016-12-10");
		System.out.println( date1.isBefore(date2) );
		
		LocalDateTime time1 = LocalDateTime.parse("2017-10-03T10:15:30");
		LocalDateTime time2 = LocalDateTime.parse("2018-10-03T10:16:30");
		System.out.println( time1.isAfter(time2) );
		
	}

}
