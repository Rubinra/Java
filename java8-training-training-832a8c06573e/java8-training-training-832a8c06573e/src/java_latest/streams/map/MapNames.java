package java_latest.streams.map;

import java.util.Arrays;
import java.util.List;

public class MapNames {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("jon snow", "arya stark", "bran stark");

		names.stream()
			.map(name->name.toUpperCase())
			.forEach(name -> System.out.println(name));
		
		
	}

}
