package java_latest.time.nonmoment;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CurrentDateOrTime {

	public static void main(String[] args) {
		
		System.out.println("LocalDate     : "+ LocalDate.now() );
		System.out.println("LocalTime     : "+ LocalTime.now() );
		System.out.println("LocalDateTime : "+ LocalDateTime.now() );
	}

}
