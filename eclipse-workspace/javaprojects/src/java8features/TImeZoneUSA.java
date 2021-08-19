package java8features;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class TImeZoneUSA {

	public static void main(String[] args) {
		
		   ZoneId z = ZoneId.of( "America/New_York" ) ;
		    ZonedDateTime zdt = ZonedDateTime.now( z ) ;
		     //Generate text.
		    DateTimeFormatter f = DateTimeFormatter.ofPattern( "MM/dd/yyyy HH:mm:ss" ) ;
		    String output = zdt.format( f ) ;
		  //  print the current time
		    System.out.println(z);
		   System.out.println( "Current Time:\t" +output ) ;
		
	
	        
	        LocalDateTime localDateTime = LocalDateTime.parse("2015-03-12T12:30:00");
	        ZoneId zone=ZoneId.of("America/New_York");
	        ZonedDateTime zoneDateTime=ZonedDateTime.of(localDateTime,zone);
	        System.out.println("Parse Date & Time:\t"+zoneDateTime);
	
	 
		  
		


		
		 
		   
	}
}
