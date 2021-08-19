package java_latest.string;



import java.util.StringJoiner;

public class StringJoinerExample {  
    public static void main(String[] args) {  
    	StringJoiner joinNames = new StringJoiner(",", "[", "]");   // passing comma as  delimiter and square brackets as prefix and suffix respectively     
        // Adding values to StringJoiner  
        joinNames.add("Amar");  
        joinNames.add("Akbar");  
        joinNames.add("Antony");  
                        
        System.out.println(joinNames);  
    }  
}  