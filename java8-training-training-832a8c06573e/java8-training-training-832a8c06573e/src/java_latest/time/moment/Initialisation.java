package java_latest.time.moment;


import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class Initialisation {
	public static void main(String[] args) {
		OffsetDateTime offsetDateTime1 = OffsetDateTime.of(1947,8,15,0,0,0,0, ZoneOffset.ofHoursMinutes(5, 30));
		System.out.println(offsetDateTime1);
				
		LocalDateTime dateOfIndependence = LocalDateTime.parse("1947-08-15T00:00:00");
		OffsetDateTime offsetDateTime2 = OffsetDateTime.of(dateOfIndependence, ZoneOffset.ofHoursMinutes(5, 30));
		System.out.println(offsetDateTime2);

		OffsetDateTime offsetDateTime3 = OffsetDateTime.parse("1947-08-15T00:00:00+05:30");
		System.out.println(offsetDateTime3);
		
		ZoneId zone=ZoneId.of("Asia/Calcutta");
		ZonedDateTime zonedDatetime1=ZonedDateTime.of(1947,8,15,0,0,0,0,zone);
		System.out.println(zonedDatetime1);
		
		ZonedDateTime zonedDatetime2=ZonedDateTime.parse("1947-08-15T00:00+05:30[Asia/Calcutta]");
		System.out.println(zonedDatetime2);
		
		}

}
