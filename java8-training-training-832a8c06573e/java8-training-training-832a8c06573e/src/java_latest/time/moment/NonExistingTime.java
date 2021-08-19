package java_latest.time.moment;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class NonExistingTime {

	public static void main(String[] args) {
		
		LocalDateTime localDateTime = LocalDateTime.parse("2020-03-08T02:30:00");
		System.out.println(localDateTime);
		
		ZoneId zone=ZoneId.of("America/Chicago");
		ZonedDateTime zonedDatetime=ZonedDateTime.of(localDateTime,zone);
		System.out.println(zonedDatetime);
		
		
		OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, ZoneOffset.ofHours(-5));
		System.out.println(offsetDateTime);
	}

}
