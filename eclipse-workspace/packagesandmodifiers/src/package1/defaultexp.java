package package1;

class def {
void msg () {
	System.out.println("default acess modifier");
}
}
public class defaultexp{
	public static void main(String[]args) {
		def obj =new def();
		obj.msg();
	}
}
//in default we can call with in the package and with in the class