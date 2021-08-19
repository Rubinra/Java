package lamdaExp;
interface Operation{
	int operaters(int a, int b);
}

public class LambdaExpWith2p {

	public static void main(String[] args) {
		  // Multiple parameters in lambda expression  
		Operation add = (a,b)->{
			return(a+b);
		};

		System.out.println("Add:\t"+add.operaters(10, 20));
		
		Operation sub = (a,b)->(a-b);
		System.out.println("Sub:\t"+ sub.operaters(12, 2));
		
	    // Lambda expression with return keyword. 
		Operation add1 = (a,b)->{
			return(a+b);
		};
		System.out.println("ADD:\t"+add1.operaters(222, 888));
		
		Operation sub1 =(a,b)->{
			return (a-b);
			
		};
		System.out.println("Sub:\t"+sub1.operaters(90, 9));
	}

}
