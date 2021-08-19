package java8features;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeList {
		public static void main(String args[]){
		   ArrayList<Employee> arraylist = new ArrayList<Employee>();
		   arraylist.add(new Employee("Joel", 23, "joel@gmail.com"));
		   arraylist.add(new Employee("Lino", 24, "lino@gmail.com"));
		   arraylist.add(new Employee("Ammu", 23, "ammu@gmail.com"));
		   arraylist.add(new Employee("Arya", 23, "arya@gmail.com"));
		   arraylist.add(new Employee("Krist", 25, "krist@gmail.com"));
		   arraylist.add(new Employee("Joe", 23, "joe@gmail.com"));


		   Collections.sort(arraylist);

		   for(Employee emp: arraylist){
				System.out.println(emp);
		   }
		}
	}

