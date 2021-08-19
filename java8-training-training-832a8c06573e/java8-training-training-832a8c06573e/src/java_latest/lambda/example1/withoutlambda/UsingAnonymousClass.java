package java_latest.lambda.example1.withoutlambda;

interface Drawable{  
    public void draw();  
}  




public class UsingAnonymousClass {  
    public static void main(String[] args) {  
             //without lambda, Drawable implementation using anonymous class  
        Drawable drwable=new Drawable(){  
            public void draw(){System.out.println("Drawing the shape");}  
        };  
        drwable.draw();  
    }  
}  