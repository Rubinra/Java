package abstraction;

abstract class Animals//abstract class 
{
public void sound() {
	System.out.println("bow");
	
}
public abstract void colour();{

}
abstract class Dog extends Animals{
	public void color() {
		System.out.println("black");
	
	}
	
}
public class abstractexamples{
		public static void main(String[args]) {
			Dog obj = new Dog();​

			obj.colour();​

			obj.sound();
		}
	}


