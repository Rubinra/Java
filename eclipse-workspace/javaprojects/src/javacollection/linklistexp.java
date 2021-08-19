package javacollection;
import java.util.*;

public class linklistexp {

	public static void main(String[] args) {
		LinkedList<String> al=new LinkedList<String>();  
		al.add("Ravi");  //adding ellement to linked List.
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay");  
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}

}
