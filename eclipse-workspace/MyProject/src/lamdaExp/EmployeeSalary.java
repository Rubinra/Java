package lamdaExp;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EmployeeSalary {
	 private String name;
	    private int age;
	    private String email;
	    private int salary;
	    
	    public String getName()
	    {
	        return name;
	    }
	    public int getAge()
	    {
	        return age;
	    }
	    public String getEmail()
	    {
	        return email;   
	    }
	    public int getSalary()
	    {
	    	return salary;
	    }
	    public EmployeeSalary (String newname,int newage,String newemail,int newsalary) {
	        this.name=newname;
	        this.age=newage;
	        this.email=newemail;
	        this.salary=newsalary;
	        
	    }
	    class person extends EmployeeSalary{

			public person(String newname, int newage, String newemail, int newsalary) {
				super(newname, newage, newemail, newsalary);
				// TODO Auto-generated constructor stub
				
			}
	    	
	    }
	    public String toString() {
	        return "Employee [Name=" + name + ", Age=" +age  + ",Email=" + email +" ,Salary"+salary ;
	    }

	
	public static void main(String[] args) {
		
		List<EmployeeSalary>empList = new ArrayList<>();
		empList.add(new EmployeeSalary("Rinu", 22, "rinu@gmail.com", 15000));
		empList.add(new EmployeeSalary("Joel", 21, "joel@gmail.com", 10000));
		empList.add(new EmployeeSalary("Lino", 23, "lino@gmail.com", 18000));
		empList.add(new EmployeeSalary("Lijo", 19, "lijo@gmail.com", 20000));
		empList.add(new EmployeeSalary("Riya", 24, "riya@gmail.com", 15000));
		empList.add(new EmployeeSalary("joe", 30, "joe@gmail.com", 24000));
		empList.add(new EmployeeSalary("Jeena", 28, "jeena@gmail.com", 40000));
		
		//empList.forEach(System.out::println);
		
		
		//add one more field  "salary" to the employee class and find the employee getting 
		//highest/lowest salaries using min/max operations in streams
	
		
	Optional<EmployeeSalary> emp = empList.stream()
		.filter(EmployeeSalary->EmployeeSalary.getAge()>14)
			.findFirst();
	//System.out.println(emp.get());
	
	/*if (emp.isPresent()) {
		System.out.println(emp.get());
	}
	else {
		System.out.println("Not Present");
	}*/
/*	emp.ifPresent(System.out::println);
	System.out.println(" Using min() method\n");
	Optional<EmployeeSalary>emp1 =empList.stream()
			.min(Comparator.comparing(EmployeeSalary::getSalary));
	emp1.ifPresent(System.out::println);
	System.out.println("\n Using max() method\n");
	Optional<EmployeeSalary>emp2 =empList.stream()
			.max(Comparator.comparing(EmployeeSalary::getSalary));
	emp2.ifPresent(System.out::println);
*/
	//of
	//empty
	//of Nullabale
	Optional<EmployeeSalary> emp3 = Optional.empty();
	System.out.println(emp3);
		
		

	}

}










