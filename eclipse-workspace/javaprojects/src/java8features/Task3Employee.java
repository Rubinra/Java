package java8features;
import java.util.*;
import java.time.*;


public class Task3Employee {

	public static void main(String[] args) {
		
		 List<Employee> empList=new ArrayList<>();
		 
		    Employee emp1=new Employee("Roy", LocalDate.parse("1994-03-01"), "roy@gmail.com");
	        Employee emp2=new Employee("Lino", LocalDate.parse("1980-12-02"), "lino@gmail.com");    
	        Employee emp3=new Employee("Babu", LocalDate.parse("1998-08-03"), "babu@gmail.com");
	        Employee emp4=new Employee("Sherin", LocalDate.parse("1987-04-06"), "sherin@gmail.com");
	        Employee emp5=new Employee("Koshy", LocalDate.parse("2000-09-22"), "koshy@gmail.com");
	        
	       
	        empList.add(emp1);
	        empList.add(emp2);
	        empList.add(emp3);
	        empList.add(emp4);
	        empList.add(emp5);
		
	}
	public class Employee {
	    private String e_Name;
	    private LocalDate e_DOB;
	    private String e_Email;
	    
	    public Employee(String e_Name, LocalDate e_DOB, String e_Email) {
	        
	        this.e_Name = e_Name;
	        this.e_DOB = e_DOB;
	        this.e_Email = e_Email;
	    }
	    
	}


}

