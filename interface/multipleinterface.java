interface firstinterfce{
	public void name();
}
interface secondinterface{
	public void number();
}
 class name implements firstinterfce,secondinterface{
	public void name (){
		  System.out.println("Rubin Raj");
	}
	public void number(){
		   System.out.println("12345689");
	}
	
}
 class multipleinterface{
	public static void main(String[] args){
	name obj = new name();
	obj.name();
	obj.number();
		
		
	}
}