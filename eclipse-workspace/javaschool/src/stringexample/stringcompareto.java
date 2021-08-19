package stringexample;
public class stringcompareto {

	public static void main(String[] args) {
	String s1 = "rubin raj";
	String s2 = "rubin raj chanthu";
	String s3 = "rubin raj";
	System.out.println(s1.compareTo(s3));//s1 and s3 have same length
	System.out.println(s1.compareTo(s2));//s2 is greater than s1
	}

}
