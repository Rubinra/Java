package javenum;
public class abdemo {

	public static void main(String[] args) {
	Rubinphone obj = new basil();//canot instantiate the abstract class
 	obj.call();
 	obj.camera();
 	obj.media();
 	obj.record();

	}

}
abstract class Rubinphone{//abstract class
	public void call() {
		System.out.println("calling....");
	}
	public abstract void camera();//abstract methods
	public abstract void media();
	public abstract void record();
	
	}
abstract class ahilphone extends Rubinphone{//abstract class
	public void camera() {
		System.out.println("camera working....");
	}
}
 class basil extends ahilphone{//concrete class
	public void media() {
		System.out.println("media working....");
	}
	public void record() {
		System.out.println("Recording...");
	}
}