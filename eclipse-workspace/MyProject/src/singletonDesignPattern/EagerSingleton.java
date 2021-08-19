package singletonDesignPattern;

class EagerSingleton {
	//Eager Sigleton design pattern
	 //Only object created when class is loaded and theInstance is private static var pointing to it
	private static EagerSingleton instance =new EagerSingleton();//private static variable of same class
	 //private constructor 
	private EagerSingleton() {//private Constructor
		System.out.println("object generated");
	}
	 //public method to return single instance of class 
	public static EagerSingleton getInstance() {  //public Static getInstance()Method
		return instance;
		
	}
}
class singleton{
	//Lazy Design Pattern
	// it is not thread safe we can make it thread safe  by add "synchronized"
	private static singleton instance = null;
	private singleton() {
		System.out.println("Lazy Design pattern");
	}
	public static singleton getInstance() {
		if(instance==null) {
			instance=new singleton();
		}
		return instance;
	}
}
//it is not thread safe we can make it thread safe  by add "synchronized"
class singleSynchronizedMethod{
	private static singleSynchronizedMethod instance=null;
	private singleSynchronizedMethod() {
		System.out.println("It is thread Safe");
	}
	public static synchronized singleSynchronizedMethod getInstance() {
		if(instance==null) {
			instance=new singleSynchronizedMethod();
		}
		return instance;
		
	}
}
// make the block Synchronized
 class singletoneBlockyn{
	 
	private static singletoneBlockyn instance=null;
	private singletoneBlockyn() {
		System.out.println("it is block Synchronization");
	}
	public static singletoneBlockyn getInstance() {
		if(instance==null) {
			synchronized (singletoneBlockyn.class) {
				instance =new singletoneBlockyn();
				
			}
			
		}
		return instance;
	}
	 
}
//Billpugh Singleton Design Pattern
class SingletoneBillpugh{
	private SingletoneBillpugh() {//private Constructor
		System.out.println("this is billpugh Design");
	}
	 /*
    inner static class SingletoneHolder is loaded when
    SingletoneHolder.INSTANCE is executed/called.
     */
	private static class SingletoneHolder{
		private static final SingletoneBillpugh INSTANCE =new SingletoneBillpugh();
		
	}
	  //public static method to get the BillPughSingleton Instance
	public static SingletoneBillpugh getInstance() {
		return  SingletoneHolder.INSTANCE;
	    /*
        when above line is executed SingletoneHolder class is loaded and
        then static variable INSTANCE is initialized
         */
	}
}













