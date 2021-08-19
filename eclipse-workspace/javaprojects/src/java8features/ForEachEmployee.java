package java8features;
import java.util.*;


public class ForEachEmployee {

	public static void main(String[] args) {
		List<String> employeeList = new ArrayList<>();
		employeeList.add ("Rohan");
		employeeList.add ("Roy");
		employeeList.add ("Roshan");
		employeeList.add ("Rini");
	
		
		System.out.println("Iterate Using For Each Method");
		employeeList.forEach(employe -> System.out.println(employe));
		
		
	}

}
