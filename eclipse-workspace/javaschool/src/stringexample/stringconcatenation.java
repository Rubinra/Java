package stringexample;

public class stringconcatenation {

	public static void main(String[] args) {
	String s1 = "welcome";
	String s2 = "to";
	String s3 = "bourntec";
	String s4 = 50+30+"Sachin"+40+40;/*Note: After a string literal, all the + will be treated as 
	string concatenation operator.*/
	System.out.println(s1 +" " + s2 +" "+s3);// concate string using "+"
	System.out.println(s4);
	System.out.println(s1.concat(s2));// concatenating string using "concat"
	}

}
