public class abstractionexp2 {

	public static void main(String[] args) {
		iphone obj =new iphone();
		show(obj);
	}
	public static void show(iphone obj) {
		
	}
}


class iphone{
	public void showconfig() {
		System.out.println("4gb ram IOS 14");
	}
}
class Redmi{
	public void showconfig() {
		System.out.println("4gbRam Amdroid 10.0");
	}
}