package regexp;
import java.util.Scanner;
import java.util.regex.*;

public class checkdate {
	 public static void main(String args []) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Date format : dd/mm/yyyy ");
		  System.out.println("Enterthe date: ");
		  String date = sc.next();
		  String regex = "^[0-3]*[0-9]/[0-1]*[0-9]/(?:[0-9][0-9])?[0-9][0-9]$";
		  boolean result = date.matches(regex); //Matching the given date with regular expression
	      if(result) {
	         System.out.println("correct");
	      } else {
	         System.out.println("try again");

	      }	     
	 }
		
}