package lamdaExp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Laptop{
	int id;
	String name;
	float price;
 public Laptop(int id, String name, float price) {
	 super();
	 this.id = id;
	 this.name = name;
	 this.price =price;
	 
}
 @Override
 public String toString() {
     return  + id + ", name=" +name  + ",Price=" + price ;
 }

}

public class lambdaCompareter {

	public static void main(String[] args) {
		 
		 List<Laptop> lap =new ArrayList<Laptop>();
		 lap.add(new Laptop(1, "Apple", 120000f));
		 lap.add(new Laptop(2, "Asus", 60000f));
		 lap.add(new Laptop(3, "MSI", 75000f));
		 lap.add(new Laptop(4, "HP", 40000f));
		 lap.add(new Laptop(5, "MI", 80000f));
		 
		 lap.forEach(laptop->System.out.println(laptop));
		  // using lambda to filter data 
		 System.out.println();
		 System.out.println("--------------Laptops Under 70000Rs--------------------");
		   Stream<Laptop> filtered_data = lap.stream().filter(p -> p.price > 70000);  
		   // using lambda to iterate through collection  
	        filtered_data.forEach(  
	                product -> System.out.println(product.name+": "+product.price)  
	        );
	        //filter the name of laptops which start with "A"
	        System.out.println("\n------------------The Name Start With A---------------------\n");
	       Stream<Laptop> name_filter = lap.stream().filter(p1->p1.name.startsWith("A"));
	       name_filter.forEach(pro->System.err.println(pro));
	     // Uppercase the name Using Map
	       System.out.println("\n------------------Laptop Names--------------------\n");
	       List<String> uppercase =lap.stream().map(p2->p2.name.toUpperCase())
	    		   .collect(Collectors.toList());
	       uppercase.forEach(System.out::println);
	     //LowerCase the name
	       System.out.println();
	       List<String> lowercase =lap.stream().map(p3->p3.name.toLowerCase())
	    		   .collect(Collectors.toList());
	       lowercase.forEach(System.out::println);
	        
	   
	 }

}
