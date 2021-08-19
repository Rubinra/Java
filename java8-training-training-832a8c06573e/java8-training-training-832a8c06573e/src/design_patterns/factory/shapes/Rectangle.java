package design_patterns.factory.shapes;

public class Rectangle implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Rectangle is drawn.");
    }
}