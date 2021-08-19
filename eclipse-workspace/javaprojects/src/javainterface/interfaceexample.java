package javainterface;
interface print {
	void show();
}
class display implements print{
	public void show() {
		System.out.println("interface example");
	}
}
public class interfaceexample{
	public void main (String[]args) {
display obj = new display ();
		obj.show();
	}
}