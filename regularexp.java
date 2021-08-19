import java.util.regex.*;  ​

public class regularexp{  ​

public static void main(String args[]){  ​

//1st way  ​

Pattern p = Pattern.compile(".xx.");​

Matcher m = p.matcher("AxxB");  ​

boolean b = m.matches();  ​

  ​

//2nd way  ​

boolean b2=Pattern.compile(".xx.").matcher("AxxB").matches();  ​

  ​

//3rd way  ​

boolean b3 = Pattern.matches(".xx.", "AxxB");  ​

  ​

System.out.println(b+" "+b2+" "+b3);  ​

}} 