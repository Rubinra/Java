package java_latest.time.moment;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class CurrentTime {
	public static void main(String[] args) {

		System.out.println("Intant		 :" + Instant.now());
		System.out.println("OffsetDateTime   :" + OffsetDateTime.now());
		System.out.println("ZonedDateTime	 :" + ZonedDateTime.now());

		System.out.println("OffsetDateTime(offset -6)   :" + OffsetDateTime.now(ZoneOffset.ofHours(-6)));
		System.out.println("Chicago ZonedDateTime	    :" + ZonedDateTime.now(ZoneId.of("America/Chicago")));
		System.out.println("Chicago LocalDateTime	    :" + LocalDateTime.now(ZoneId.of("America/Chicago")));

	}
}
