package Testpk;
public class wrapperexample2{
	public static void main(String args[]){
		//convert int into integer OR converte premitive data type to object
		int b = 23;
		Integer a = Integer.valueOf(b);//convert premitive into object
		Integer c = a;
		Integer d = 34;
		int e = d;
		int f = d;
		System.out.println(b + " " + b + " " + c);
		//convert object to premitive data type
		
		System.out.println(d + " " + e + " " + f);
		
}
		
}
