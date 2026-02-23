package DesignPattern.creational.factory;

public class ShapeFactory {
    Shape getShape(String input){
        return switch (input) {
            case ("CIRCLE") -> new Circle();
            case ("SQUARE") -> new Square();
            case ("RECTANGLE") -> new Rectangle();
            default -> throw new IllegalArgumentException("Unknown shape" + input);
        };
    }
}
