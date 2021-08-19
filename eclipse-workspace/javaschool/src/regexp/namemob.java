package regexp;
import java.util.Scanner;
import java.util.regex.Pattern;
public class namemob{  
public static void main(String args[]){ 
//validate a name, phone number using Regex
	Scanner sc=new Scanner(System.in); 
	System.out.println("Name Format - **** ****");
	System.out.println("Enter your name:");//get the name from user
	 String name = sc.nextLine(); 
	if (Pattern.matches("^[a-zA-Z]+\\s[a-zA-Z]+{5,20}$", name))//check the name is validate or not
	 {
		 System.out.println("Correct"); 
	 }
	 else
	 {
		 System.out.println("please check and try again");
		 
	 } 
	 System.out.println("Number Format - +***  **********");
	 System.out.println("Enter your mobile number:");
    String num = sc.nextLine();
   if (Pattern.matches("^[+][0-9]{1,3}[0-9]{10}$", num))//check the mobile number is validate or not
   {
	   System.out.println("Correct");
   }
   else
   {
	   System.out.println("please check and try again");
   }
}
}