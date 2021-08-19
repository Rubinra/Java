package java8features;
import java.util.*;
public class ArrayListSorting   {

     public static void main(String args[]){
	   ArrayList<Students> arraylist = new ArrayList<Students>();
	   arraylist.add(new Students(223, "Chaitanya", 26));
	   arraylist.add(new Students(245, "Rahul", 24));
	   arraylist.add(new Students(209, "Ajeet", 32));


	   for(Students str: arraylist){
			System.out.println(str);
	   }
     }
}
