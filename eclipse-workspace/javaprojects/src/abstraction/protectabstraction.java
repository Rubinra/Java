package abstraction;
abstract class myclass{
	protected abstract void display();
}
public class protectabstraction extends myclass{
	public void display() {
		System.out.println("this is the subclass implementation of the display m,ethod");
	}

public static void main(String args[]) {
    new protectabstraction().display();
 }
}