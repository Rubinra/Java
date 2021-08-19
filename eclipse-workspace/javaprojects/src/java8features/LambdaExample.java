package java8features;

interface Binary {
	int operation(int a, int b);
}

public class LambdaExample {
    
    public static void main(String[] args) {
    	//Using Lambda Expression
    	Binary addition =(a,b) -> (a + b);
    	System.out.println("Addition = " + addition.operation(5, 6));
    	
    	Binary substraction =( a,b) -> (a - b);
    	System.out.println("Substraction = " + substraction.operation(50, 16));
    	
    	Binary multiplication =(a, b) -> (a * b);
    	System.out.println("Multiplication = " + multiplication.operation(55, 6));
    	
    	Binary division =( a, b) -> (a / b);
    	System.out.println("Division = " + division.operation(50, 5));
 

    }
    
    
}