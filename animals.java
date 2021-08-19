interface Birds{
	void eat();
	void drink();
	void fly();
}
class parrot implements Birds{
	public void eat(){
		System.out.println("carrot,nuts");
	}
public void drink(){
			System.out.println("water");
}

public void fly(){
			System.out.println("carrot,nuts");
}
}
public class animals{
	public void main(String[]args){
		Bird b =new parrot();
		b.eat();
		b.drink();
		b.fly();
	}
}
		