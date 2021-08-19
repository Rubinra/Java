package java_latest.lambda.example2;

public class LambdaExample {

	public static void main(String[] args) {
		
		Power square=n->n*n;
		System.out.println(square.calculate(2));
		
		Power cube=n->n*n*n;
		System.out.println(cube.calculate(2));

	}

}
