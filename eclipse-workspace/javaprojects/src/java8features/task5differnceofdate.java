package java8features;
import java.time.*;
import java.time.temporal.ChronoUnit;
public class task5differnceofdate {

	public static void main(String[] args) {
		LocalDate Date1 = LocalDate.parse("2021-01-01");
		LocalDate Date2 = LocalDate.parse("2021-05-21");		
		System.out.println(ChronoUnit.DAYS.between(Date1, Date2));
		
	}

}
