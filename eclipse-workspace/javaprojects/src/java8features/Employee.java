package java8features;
public class Employee implements Comparable {
    private String name;
    private int age;
    private String email;

    public Employee( String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
   
    //getter and setter methods same as the above example 
   
    @Override
    public int compareTo(Employee comparestu) {
        int compareage=((Employee)comparestu).getClass() ;
        /* For Ascending order*/
        return this.age-compareage;

        /* For Descending order do like this */
        //return compareage-this.studentage;
    }

  

	@Override
    public String toString() {
        return "[ name=" + name + ", age=" + age + ", Email" + email + "]";
    }

}
