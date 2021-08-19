package java8features;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class task6 {

	public static void main(String[] args) {
	/*	LocalDateTime date1 = LocalDateTime.parse("1990-04-22T14:25:27.179970600");
		LocalDateTime date2 = LocalDateTime.parse("1993-09-22T12:22:30.179970600");
		System.out.println("The Difference in Seconds:\t"+ Duration.between(date1, date2).getSeconds());*/
		
		LocalDate currentDate = LocalDate.now();
		String formattedDate = currentDate.format(DateTimeFormatter.ofPattern("EEEE,MMMM d YYYY"));
		System.out.println("Formatted Date   :  " + formattedDate);
		

	}

}
