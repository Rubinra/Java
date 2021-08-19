package java_latest.time.moment;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneConversionExample {
	public static void main(String[] args) {
		
		 LocalDateTime time = LocalDateTime.parse("2020-03-08T02:00:00");
		 ZonedDateTime istTime=ZonedDateTime.of(time,  ZoneId.of("Asia/Calcutta"));
		 ZonedDateTime chicagoZoneDateTime=istTime.withZoneSameInstant(ZoneId.of( "America/Chicago" ));
		 System.out.println( "Chicago Zone Date Time : "+chicagoZoneDateTime);
	}
}
