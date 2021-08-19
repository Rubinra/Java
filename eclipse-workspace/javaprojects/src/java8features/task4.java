package java8features;
import java.time.*;
public class task4 {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		//a,Adding (50 Days)
		LocalDateTime now1 = now.plusDays(50);
		System.out.println("Adding 50 Days:\t"+now1);
		//a,Sub (50 Days)
		LocalDateTime now2 =now.minusDays(50);
		System.out.println("sub 50 Days:\t"+now2);
		//b,Add 3 Year
		LocalDateTime yearup = now.plusYears(3);
		System.out.println("Add 3 Yr:\t"+yearup);
		//b,Sub 3 Year
		LocalDateTime yeardn = now.minusYears(3);
		System.out.println("Sub 3 Yr:\t"+yeardn);
		//c,add 2Month
		LocalDateTime monup = now.plusMonths(2);
		System.out.println("Add 2 MM:\t"+monup);
		//c, Sub 2Month
		LocalDateTime mondn = now.plusMonths(2);
		System.out.println("Add 2 MM:\t"+mondn);
		
		
		
		//d,add 10hr
     	LocalDateTime hourup = now.plusHours(10);
		System.out.println("Add 10 hr:\t"+hourup);
		//d,Sub 10hr
		LocalDateTime hourdn = now.minusHours(10);
		System.out.println("Sub 10 hr:\t"+hourdn);
				
			
		
		
	}
	
}
