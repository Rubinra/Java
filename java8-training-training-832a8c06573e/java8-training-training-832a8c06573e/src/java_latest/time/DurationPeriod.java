package java_latest.time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DurationPeriod {

	public static void main(String[] args) {
		
		LocalDate startDate = LocalDate.of(2012, 2, 1);
		LocalDate endDate = LocalDate.parse("2016-12-10");		
		System.out.println( Period.between(startDate, endDate).getDays());
		
		System.out.println( ChronoUnit.DAYS.between(startDate, endDate));
		
				
		LocalDateTime start = LocalDateTime.parse("2016-02-03T10:16:31");
		LocalDateTime end = LocalDateTime.parse("2016-02-05T10:16:30");
		
		System.out.println(Duration.between(start, end).getSeconds());

		
	}

}
