package stringexample;

public class stringmehods {

	public static void main(String[] args) {
	String s1 = " java is simple";
	String s2 = "JAVA IS SIMPLE";
	System.out.println(s1.toUpperCase());//it will capitalise the string s1
	System.out.println(s1.toLowerCase());// it will lower case ther letters
	System.out.println(s1 +"/ "+s2);//Sachin(no change in original) 
	/*TRIM METHOD
	
	The string trim() method eliminates white spaces before and after string.
	*/
	System.out.println(s1);
	System.out.println("when using trim(_)");
	System.out.println(s1.trim());
	//Java String startsWith() and endsWith() method
	System.out.println(s2);
	System.out.println(s2.startsWith("JA"));//the string s2 start with "JA"
	System.out.println(s2.endsWith("ple"));// the string s2 is not end with "ple"
	//Java String charAt() method
	//note:the string index start from "0"
	
	System.out.println(s2.charAt(3));
	System.out.println(s1.charAt(6));
	//Java String length() method
	System.out.println(s1.length());
	System.out.println(s2.length());
	
	
	
	}

}
