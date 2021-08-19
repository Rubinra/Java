package java_latest.lambda.example1.withlambda;


@FunctionalInterface   //@FunctionalInterface annotation is optional  but highly recommended
interface Drawable{  
    public void draw();  

}  
  
public class LambdaExpressionExample {  
    public static void main(String[] args) {  
       
        Drawable drwable=()-> System.out.println("Drawing the shape"); 
        drwable.draw();  
         
        
    }  
}  