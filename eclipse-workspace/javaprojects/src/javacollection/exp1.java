package javacollection;
import java.util.*;

public class exp1 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay"); 
		list.add("Rubin");
		//Traversing list through Iterator  
		Iterator<String> itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		//System.out.println(list);
		
		}  
	}
}


