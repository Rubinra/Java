package java_latest.string;


import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class StringJoinerExample2 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Amar", "Akbar", "Antony");
		StringJoiner joinNames = new StringJoiner(",", "[", "]"); // passing comma as delimiter and square brackets as
	
		for (String name : list) {
			joinNames.add(name);
		}
		
	System.out.println(joinNames);
	
	}
}