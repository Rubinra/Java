package java8features;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDifference {

	public static void main(String[] args) {
		
		LocalDateTime obj=LocalDateTime.now();
		System.out.println("the current time is\n"+obj);
		OffsetDateTime offtime=OffsetDateTime.of(obj, ZoneOffset.ofHours(-6));
		System.out.println("the time after offset -6 is\t"+offtime);
		
		LocalDateTime obj1 =LocalDateTime.now();
		System.out.println("Curent Time is: "+obj1);
		OffsetDateTime offtime1= OffsetDateTime.of(obj1, ZoneOffset.ofHours(6));
		System.out.println("the time fter offset +6 is :"+offtime1);

		 

	}

}
