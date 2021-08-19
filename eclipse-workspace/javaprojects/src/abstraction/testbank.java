package abstraction;
public class testbank {

	public static void main(String[] args) {
		Bank obj =new SBI();
		Bank obj1 =new Unnionbank();
	obj.banktype();
	obj.interest();
	obj1.interest();
	

	}

}

abstract class Bank{
	public void banktype() {
		System.out.println("Public sector");
	}
	public abstract  void interest();
	//abstract methods
}
class SBI extends Bank{
	public void interest() {
		System.out.println("the interst in sbi --------8");
	}
}
 class Unnionbank extends Bank{
	public void interest() {
		System.out.println("the interst in unnion---------10");
	}
}