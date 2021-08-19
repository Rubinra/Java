package java_latest.string;



import java.util.Arrays;
import java.util.List;

public class StringJoin {

	public static void main(String[] args) {
		
		
		 String date = String.join("/","25","06","2018");    
	     System.out.println(date); 
	     
	
	     
	     
	 	
	 	String [] array= {"Steve", "Rick", "Peter", "Abbey"};
	 	System.out.println( String.join(" | ", array));

	 	
	 	
	 	
	 	
	 		List<String> list = Arrays.asList("Steve", "Rick", "Peter", "Abbey");
		 	String names = String.join(",", list);
		 	System.out.println(names);
	}

}
