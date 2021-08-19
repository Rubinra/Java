package abstraction;

public class Atm {

	public static void main(String[] args) {
	details obj = new amount();
	obj.name();
	obj.pin();
	obj.amount();
	}

}
abstract class details {
	public void name() {
		System.out.println("Rubin Raj");
	}
	public abstract void pin();
	public abstract void amount();
}
abstract class pin extends details{//abstract class
	public void pin() {
		System.out.println("***");
	}
}
 class amount extends pin{//concrete class
	public void amount() {
		System.out.println("50000");
	}
	
}