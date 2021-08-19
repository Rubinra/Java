package exceptionhandling;
import java.util.*;

public class arrerror{  
	  public static void main(String args[]){  
	   try{  
	     Scanner sc =new Scanner(System.in);
	     System.out.println("enter the first number");
	     int n =sc.nextInt();
	     System.out.println("enter the second nomber");
	     int n1 =sc.nextInt();
	     int ans =n1/n;
	     System.out.println(ans);
	   }catch(ArithmeticException e){System.out.println(e);}  
	   //rest code of the program   
	   System.out.println("Arrithmatic exception ");  
	  }  
	}  
	


	
	


