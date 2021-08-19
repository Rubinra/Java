package java_latest.method_references;


@FunctionalInterface   //@FunctionalInterface annotation is optional  but highly recommended
 interface Power {
	double calculate(double number);
}


public class MathSqrt {
public static void main(String[] args) {
		
		Power square=n->n*n;
		System.out.println(square.calculate(2));
		
		Power cube=n->n*n*n;
		System.out.println(cube.calculate(2));
		
		Power squareRoot=n->Math.sqrt(n);
		System.out.println(squareRoot.calculate(4));

		
		Power squareRootUsingMethodreference=Math::sqrt;
		System.out.println(squareRootUsingMethodreference.calculate(9));

	}
}
