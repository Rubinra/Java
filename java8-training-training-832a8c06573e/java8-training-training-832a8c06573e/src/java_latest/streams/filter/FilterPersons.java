package java_latest.streams.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import common.Gender;
import common.Person;


public class FilterPersons {

	public static void main(String[] args) {
		
		List<Person> listPersons = new ArrayList<>();
		 
		listPersons.add(new Person("Alice", "Brown", "alice@gmail.com", Gender.FEMALE, "1986-05-17"));
		listPersons.add(new Person("Bob", "Young", "bob@gmail.com", Gender.MALE, "1976-08-17"));
		listPersons.add(new Person("Carol", "Hill", "carol@gmail.com", Gender.FEMALE, "1956-05-27"));
		listPersons.add(new Person("David", "Green", "david@gmail.com", Gender.MALE, "1989-01-27"));
		listPersons.add(new Person("Eric", "Young", "eric@gmail.com", Gender.MALE, "1975-02-07"));
		listPersons.add(new Person("Frank", "Thompson", "frank@gmail.com", Gender.MALE, "1952-04-07"));
		listPersons.add(new Person("Gibb", "Brown", "gibb@gmail.com", Gender.MALE, "1995-07-17"));
		listPersons.add(new Person("Henry", "Baker", "henry@gmail.com", Gender.MALE, "1999-09-12"));
		listPersons.add(new Person("Isabell", "Hill", "isabell@gmail.com", Gender.FEMALE, "1970-08-12"));
		listPersons.add(new Person("Jane", "Smith", "jane@gmail.com", Gender.FEMALE, "1969-05-14"));
		
		listPersons.stream().filter(person->person.getGender()==Gender.MALE)
							.forEach(person->System.out.println(person));
		

	}

}
