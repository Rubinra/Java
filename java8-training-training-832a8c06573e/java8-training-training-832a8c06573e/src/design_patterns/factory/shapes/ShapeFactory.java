package design_patterns.factory.shapes;

public abstract class ShapeFactory {
    public static GeometricShape getShape(String name) {
    	name=name.toUpperCase();
        GeometricShape shape = null;
        switch (name) {
            case "SQUARE":
                shape = new Square();
                break;
            case "CIRCLE":
                shape = new Circle();
                break;
            case "RECTANGLE":
                shape = new Rectangle();
                break;
        }
        return shape;
    }
}