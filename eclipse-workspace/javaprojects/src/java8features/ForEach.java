package java8features;
import java.time.LocalDate;
import java.util.ArrayList;
public class ForEach
{
        private String name;
        private LocalDate dateOfBirth;
        private String email;
        
        public String getName()
        {
            return name;
        }
        public LocalDate getDob()
        {
            return dateOfBirth;
        }
        public String getEmail()
        {
            return email;
        }
        public ForEach (String name,LocalDate dateOfBirth,String email) 
        {
            this.name=name;
            this.dateOfBirth=dateOfBirth;
            this.email=email;
        }
        public void display()
        { 
            System.out.println("Name: " + name + " DOB: " + dateOfBirth+ " email: "+ email);
        }

        public static void main(String[] args) 
        {
            ForEach e1=new ForEach("Rinu",LocalDate.of(1990,10,11),"rinu@gmail.com");
            ForEach e2=new ForEach("Joel",LocalDate.of(1998,11,21),"joel@gmail.com");
            ForEach e3=new ForEach("sonu",LocalDate.of(1994,01,20),"sonu@gmail.com");
            
            ArrayList<ForEach>emp=new ArrayList<ForEach>();
            
            emp.add(e1);
            emp.add(e2);
            emp.add(e3);
            
            //using for each method in java
            
           emp.forEach(employee->employee.display());    

    }

}