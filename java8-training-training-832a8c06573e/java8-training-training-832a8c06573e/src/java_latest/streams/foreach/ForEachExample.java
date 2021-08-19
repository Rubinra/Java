package java_latest.streams.foreach;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {
	public static void main(String... args) {
		
		List<String> names = Arrays.asList("jon snow", "arya stark", "bran stark");

		names.stream().	forEach(name -> System.out.println(name));
		

	}
}
