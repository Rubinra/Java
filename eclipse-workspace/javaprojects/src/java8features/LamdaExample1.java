package java8features;
interface EvenAndOdd{
	 void check(int a); //abstract
		
	
}

public class LamdaExample1 {

	public static void main(String[] args) {
		EvenAndOdd evenOdd = (int a) -> {
			if (a%2==0) {
			System.out.println("Number "+a+ " is Even.");
			}else {
				System.out.println("Number "+a+ " is Odd.");
			}
			
		};
		//check number
		evenOdd.check(4);
		evenOdd.check(9);
		evenOdd.check(7);
		evenOdd.check(6);
	
		
	}

}
