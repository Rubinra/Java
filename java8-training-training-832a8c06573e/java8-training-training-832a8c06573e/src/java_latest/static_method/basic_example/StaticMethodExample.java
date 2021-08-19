package java_latest.static_method.basic_example;

public class StaticMethodExample {

	public static void main(String[] args) {
		
		InterfaceWithStaticMethod interfaceWithStaticMethod=new AnyClass();
		interfaceWithStaticMethod.abstractMethod();
		InterfaceWithStaticMethod.staticMethod();
		
		//it is not possible to invoke static method of interface using object
		//interfaceWithStaticMethod.staticMethod();
	
	}

}
