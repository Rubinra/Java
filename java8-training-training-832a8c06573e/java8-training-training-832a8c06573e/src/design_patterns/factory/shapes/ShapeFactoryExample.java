package design_patterns.factory.shapes;

public class ShapeFactoryExample {
    public static void main(String[] args) {
       
        GeometricShape shape1 = ShapeFactory.getShape("CIRCLE");
        shape1.draw();
        
        
        GeometricShape shape2 = ShapeFactory.getShape("RECTANGLE");
        shape2.draw();
    }
}
