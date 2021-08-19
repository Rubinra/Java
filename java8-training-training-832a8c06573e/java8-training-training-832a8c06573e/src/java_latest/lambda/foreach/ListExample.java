package java_latest.lambda.foreach;

import java.util.Arrays;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List <String>countries =Arrays.asList("India","us","Japan","Australlia");
		
		for(String country:countries)
		{
			System.out.println(country);
		}
		
		System.out.println("--------------------------------------------");
		countries.forEach(country->System.out.println(country));
				
		
	}

}
