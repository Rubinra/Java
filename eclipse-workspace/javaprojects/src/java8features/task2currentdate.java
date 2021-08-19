package java8features;
import java.time.*;
public class task2currentdate {
	public static void main(String[] args) {
	//2.	Write the java code to display current system date (or time or both)?
		
		System.out.println("Time:\t"+LocalTime.now());
		System.out.println("Date:\t"+LocalDate.now());
		System.out.println("Date&Time:\t"+LocalDateTime.now());
		
		
	}
}
