package regexp;
import java.util.Scanner;
public class checkemail {
   public static void main(String args []) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your Email: ");
      String email = sc.next();
      String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
      boolean result = email.matches(regex); //Matching the given phone number with regular expression
      if(result) {
         System.out.println("The email-id is valid");
      } else {
         System.out.println("The email-id is not valid");
      }
   }
}
