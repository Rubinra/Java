package java8features;
import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		 Map <String,String>countries=new HashMap<>();  
		    //Adding elements to map  
		    countries.put("+91","India");  
		    countries.put("+1","United States");  
		    countries.put("+61","Australlia");  
		    countries.put("+81","Amit");  
		    
		    for(String code:countries.keySet())
		    {
		    	System.out.print("Country Code : "+code);
		    	System.out.println("\tCountry Name : "+countries.get(code));
		    }
		    
		    System.out.println("--------------------------------------------");
		    countries.forEach((code,country)->{
		    	System.out.print("Country Code : "+code);
		    	System.out.println("\tCountry Name : "+country);
		    });
		
		
	}

}
