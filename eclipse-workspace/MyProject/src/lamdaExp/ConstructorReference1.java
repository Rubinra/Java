package lamdaExp;
class Student{
	String name;
	int rollno;  
	int marks;
	int age;
	
	Student(String name,int rollno,int marks,int age){
		this.name=name;
		this.rollno=rollno;
		this.marks=marks;
		this.age=age;
		}
	
	public void display(){
    	System.out.println("Name :\t"+name+"\tRollno:\t"+rollno+"\tMarks:\t"+marks+"\tAge:\t"+age);
    	} 
	   

}
@FunctionalInterface  
interface Decleration{
	
	public Student get(String name ,int rollno,int marks,int age);
	 
	default void say(){    
        System.out.println("Hello, this is default method");
        
    }    

    }
	


/*
class Defefinition implements Decleration{
	
	public Student get(String name,int rollno,int marks,int age)
	{ 
		Student s = new Student(name,rollno,marks,age);
		return s;
	}
	} */


public class ConstructorReference1 {

	public static void main(String[] args) {
		Decleration i =(name,rollno,marks,age)->new Student(name,rollno,marks,age);
		i.get("samuel", 33, 33, 33);
		System.out.println(i);
		
		
		
		
		
	}

}