package stringexample;

public class stringequal {
public static void main(String[] args) {
String s1 = "java is object simple";
String s2 = "java";
String s3 = "java";
String s4 = "JAVA";
String s5 = "JAVA";
String s6 = new String("JAVA");
System.out.println(s1.equals(s2));
System.out.println(s2==s3);
System.out.println(s3.equals(s2));	
System.out.println(s4.equals(s5));
System.out.println(s1.equals(s5));
System.out.println(s4.equals(s6));
	
}
}