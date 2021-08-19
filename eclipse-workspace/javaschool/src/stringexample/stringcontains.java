package stringexample;

public class stringcontains {

	public static void main(String[] args) {
	String name = "my name is Rubin Raj";// main string
	System.out.println(name.contains("Rubin Raj"));// true because the string contain("Rubin Raj")
	System.out.println(name.contains("dddddd"));//false because the ("dddddd")) is not presentin the string
	System.out.println(name.contains("my name"));
	System.out.println(name.contains("is"));
	}

}
