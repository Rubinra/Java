package java_latest.time.nonmoment;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateFormatterExample {
	public static void main(String[] args) {
		
		LocalDate currentDate = LocalDate.now();
		String formattedDate = currentDate.format(DateTimeFormatter.ofPattern("EEEE,MMMM d YY"));
		System.out.println("Formatted Date   :  " + formattedDate);

		System.out.println(
				"Formatted Time   :  " + LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss.SSS a")));

		LocalTime localTimeUsingDateFormatter = LocalTime.parse("10/10 PM", DateTimeFormatter.ofPattern("hh/mm a"));
		System.out.println(localTimeUsingDateFormatter);

	}
}
