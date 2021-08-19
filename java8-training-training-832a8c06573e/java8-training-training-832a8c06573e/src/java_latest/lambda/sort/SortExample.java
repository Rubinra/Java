package java_latest.lambda.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import common.Gender;
import common.Person;

class CompareByFirstName implements Comparator<Person>
{

	@Override
	public int compare(Person o1, Person o2) {
	 return o1.getFirstName().compareTo(o2.getFirstName());
	}
	
}
public class SortExample {

	public static void main(String[] args) {
		
		List<Person> listPersons = new ArrayList<>();
		 
		listPersons.add(new Person("Alice", "Brown", "alice@gmail.com", Gender.FEMALE, "1986-05-17"));
		listPersons.add(new Person("Bob", "Young", "bob@gmail.com", Gender.MALE, "1976-08-17"));
		listPersons.add(new Person("Carol", "Hill", "carol@gmail.com", Gender.FEMALE, "1956-05-27"));
		listPersons.add(new Person("Alice", "Green", "david@gmail.com", Gender.MALE, "1989-01-27"));
		listPersons.add(new Person("Eric", "Young", "eric@gmail.com", Gender.MALE, "1975-02-07"));
		listPersons.add(new Person("Frank", "Thompson", "frank@gmail.com", Gender.MALE, "1952-04-07"));
		listPersons.add(new Person("Gibb", "Brown", "gibb@gmail.com", Gender.MALE, "1995-07-17"));
		listPersons.add(new Person("Henry", "Baker", "henry@gmail.com", Gender.MALE,  "1952-04-07"));
		listPersons.add(new Person("Isabell", "Hill", "isabell@gmail.com", Gender.FEMALE, "1970-08-12"));
		listPersons.add(new Person("Jane", "Smith", "jane@gmail.com", Gender.FEMALE, "1969-05-14"));
		
		
		System.out.println("-----------Sorting on birthday using comparable----------");
		Collections.sort(listPersons);
		listPersons.forEach(System.out::println);
		
		
		System.out.println("-----------Sorting on first name using a child class object of Comparator ----------");
		CompareByFirstName compareByFirstName=new CompareByFirstName();
		Collections.sort(listPersons,compareByFirstName);
		listPersons.forEach(System.out::println);
		
		
		
		System.out.println("-----------Sorting on lastname using anonymous classes----------");
		Collections.sort(listPersons,
				new Comparator<Person>()
					{
				@Override
				public int compare(Person o1, Person o2) {
					return o1.getLastName().compareTo(o2.getLastName());
				}
							}
			
				);
		
			listPersons.forEach(System.out::println);
			
			System.out.println("-----------Sorting on lastname Using Lambda---------");
			Collections.sort(listPersons,(p1,p2)->p1.getLastName().compareToIgnoreCase(p2.getLastName()) );
					
			listPersons.forEach(System.out::println);	
			
			
			System.out.println("-----------Sorting on age Using Lambda---------");
					
			Collections.sort(listPersons,(p1,p2)->
			{
				
				if(p1.getAge()<p2.getAge())
					return -1;
				else if(p1.getAge()>p2.getAge())
					return  1;
				else
					return 0;
			
			});
				
			listPersons.forEach(System.out::println);
			
			
			System.out.println("-----------Sorting on age Using Lambda ---------");
			
			Collections.sort(listPersons,(p1,p2)->p1.getAge()-p2.getAge());
			
			listPersons.forEach(System.out::println);
			
			
			
			
			System.out.println("-----------Sorting on age Using Lambda and compareTo method---------");
			Collections.sort(listPersons,(p1,p2)->((Integer)p1.getAge()).compareTo((Integer)p2.getAge())
			);
			listPersons.forEach(System.out::println);
			
			
			
			
			System.out.println("-----------Sorting on age Using Lambda and Comparator.comparing---------");
			Collections.sort(listPersons,Comparator.comparing(p->p.getAge()));
				
			listPersons.forEach(System.out::println);
			
			
			
			
			
			
			System.out.println("-----------Sorting on age Using Method reference and Comparator.comparing---------");
			Collections.sort(listPersons,Comparator.comparing(Person::getAge));
				
			listPersons.forEach(System.out::println);
			
			
	}

}
