package atm;// user define package
import java.util.*;//import buit in package
public class Atmmachine {
//main class
	public static void main(String[] args){
		int balance=100000, deposite, withdraw, num;//define integers
	Scanner sc = new Scanner(System.in);// take input using scanner
	System.out.println("Wellom to ATM");
	System.out.println("Enter your Card");
    System.out.println("please wait");
	System.out.println("!!Enter your PIN!!");
	String pin = sc.nextLine();
	String regex ="[0-9]{4}";
	 boolean result = pin.matches(regex);//using regular expression match the pin
 while(result) {
	 System.out.println("1.withdraw");
	 System.out.println("2.deposite");
	 System.out.println("3.check balance");
	 System.out.println("4.exit");
	 num =sc.nextInt();
 
	 switch(num) {//using switch statement
	 
	 case 1: 
		 System.out.println("enter the amount to withdraw");
		 withdraw = sc.nextInt();
		 if(balance>=withdraw) {
			 System.out.println(withdraw +" is debited");
			 System.out.println("the balanc amount is = "+(balance-withdraw));
			 balance = (balance-withdraw);
		 }
		 else {
			 System.out.println("not enough money to withdraw");
		 }
	     break;
	 case 2:
		 System.out.println("enter the amount to deposite");
	     deposite = sc.nextInt();
	     System.out.println("your amount is credited");
         System.out.println("your balanc is  =  "+(balance+deposite));
         balance = (balance+deposite);
	    break;
	
	 case 3:
		 System.out.println("your blance is  =  "+balance);
		break;
	 case 4:
		 System.out.println("!!!EXIT!!!");
	    break;
	    
	    default :
	    System.out.println("try again");
	   break;
	 }
	
 } 
 }

	}


