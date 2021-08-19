package design_patterns.factory.shapes;

public class Square implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Square is  Drawn.");
    }
}
