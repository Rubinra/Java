package lamdaExp;
interface Company{  
    public String phone(String name);  
}  
  
public class LambdaExpressionWithSingleP{  
    public static void main(String[] args) {  
      
        // Lambda expression with single parameter.  
        Company ph1=(name)->{  
            return "Hello, "+name;  
        };  
        System.out.println(ph1.phone("Apple"));  
          
        // You can omit function parentheses    
        Company ph2= name ->{  
            return "Hello, "+name;  
        };  
        System.out.println(ph2.phone("Samsung"));  
        
        Company ph3=name ->{
        	return "Hello, "+name;
        };
        System.out.println(ph3.phone("Nokia"));
        
        
    }  
}  