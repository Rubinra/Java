package java8featuresStramApi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



public class SortEmployeeList {
    private String name;
    private int age;
    private String email;
    
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
   
    public SortEmployeeList (String newname,int newage,String newemail) {
        this.name=newname;
        this.age=newage;
        this.email=newemail;
    }
  //  @Override
    public String toString() {
        return "Employee [Name=" + name + ", Age=" +age  + ",Email=" + email + "]";
    }
    
    public static void main(String[] args) {
        
    	SortEmployeeList e1=new SortEmployeeList("Joel",21,"joel@gmail.com");
    	SortEmployeeList e2=new SortEmployeeList("Kiran",23,"kiran@gmail.com");
    	SortEmployeeList e3=new SortEmployeeList("Nikhil",19,"nikhil@gmail.com");
    	SortEmployeeList e4=new SortEmployeeList("Ajay",20,"ajay@gmail.com");
    	SortEmployeeList e5=new SortEmployeeList("Kavya",24,"kavya@gmail.com");
    	SortEmployeeList e6=new SortEmployeeList("Noel",30,"noel@gmail.com");
        List<SortEmployeeList>emp=new ArrayList<SortEmployeeList>();
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        emp.add(e4);
        emp.add(e5);
        emp.add(e6);
        //print the list without Sorting
        System.out.println("!!!BEFORE SORTING!!!\n");
        emp.forEach(employee->System.out.println(employee));
        
       
        System.out.println("\n!!!AFTER SORTING!!!\n");
        List<SortEmployeeList> sortedList = emp.stream()
                .sorted(Comparator.comparingInt(SortEmployeeList::getAge))
                .collect(Collectors.toList());

        sortedList.forEach(System.out::println);
        System.out.println();
       
        List<SortEmployeeList> sortedList1 = emp.stream()
                .sorted((o1, o2) -> {
                    if(o1.getAge() == o2.getAge())
                        return o1.getName().compareTo(o2.getName());
                    else if(o1.getAge() > o2.getAge())
                        return 1;
                    else return -1;
                })
                .collect(Collectors.toList());

        sortedList1.forEach(System.out::println);
        
        


 

    }
}






