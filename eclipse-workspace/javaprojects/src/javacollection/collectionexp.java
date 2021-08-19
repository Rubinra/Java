package javacollection;
import java.util.*;



public class collectionexp {
	//iterator
	//enhanced for loop
	//stream API 

	public static void main(String[] args) {
		//int values[] = new int[4];
		/*Object values1[] = new Object[4];
		values1[0] = "rubin";
		values1[1] = 3;
		System.out.println(values1);*/
	/*	Collection<Integer> values = new ArrayList<>();
		values.add(90);
		values.add(9);
		values.add(99);
		values.remove(9);
		
		Iterator i = values.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		//for(Object i : values){
			//System.out.println(i);
		}*/
		//ArrayList
	     List<Integer>str = new ArrayList<>();
	     str.add(800);
	     str.add(350);
	     str.add(400);
	     str.add(255);
	     str.add(755);
	     str.add(633);
	     List<Integer>str1 = new ArrayList<>();
	     str.add(800);
	     str.add(350);
	     str.add(400);
	     str.add(255);
	     str.add(755);
	     str.add(633);
	     System.out.println(str.addAll(str1));
	      //Collections.sort(str);//to sort values
	    //  Collections.reverse(str);// to revese the data
	   // Comparator<Integer> com = new Compartor();
	    // Collections.sort(str,com);
	      
	   /*  Iterator<Integer> i = str.iterator();
	     while(i.hasNext()) {
	    	 System.out.println(i.next());
	    	 
	     }*/
		str.forEach(System.out::println);/*stream API ..
		Lambda expression*/
		Stack<String> stack = new Stack<>();
		stack.push("joe");
		stack.push("Lino");
		stack.push("joel");
		stack.push("Jibin");
		for(Object ob : stack) {
			System.out.println(ob);
		}
		
		}
}
		
		
	

	


