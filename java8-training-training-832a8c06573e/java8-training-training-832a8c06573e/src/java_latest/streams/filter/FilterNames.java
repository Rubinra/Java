package java_latest.streams.filter;

import java.util.Arrays;
import java.util.List;

public class FilterNames {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("jon snow", "arya stark", "bran stark");

		names.stream()
			.filter(name -> name.startsWith("j"))
			.forEach(name -> System.out.println(name));
	}

}
