package java8features;
import java.util.*;

public class task1sringjoin {
	public static void main(String[] args) {
		//to join two strings we can use the Strting.join method
		
		
		
		String date = String.join("-","10","09","2021");
		 System.out.println(date); 
		 
		 
		 
			String [] arr= {"Abin", "Rubin", "Satheesh", "Sibu"};
		 	System.out.println( String.join(" / ", arr));
		 	
		 	
		 	List<String> list = Arrays.asList("Abin", "Rubin", "Satheesh", "Sibu");
		 	String names = String.join("/", list);
		 	System.out.println(names);
	}
}

		 
		 
	     
	
	 	
	 	
	 	
