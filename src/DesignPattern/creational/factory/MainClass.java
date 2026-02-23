package DesignPattern.creational.factory;

public class MainClass {
    public static void main(String[] args) {
        ShapeFactory obj = new ShapeFactory();
        Shape obj1 = obj.getShape("CIRCLE");
        Shape obj2 = obj.getShape("CIRCLE");
        Shape obj4 = obj.getShape("SQUARE");
        Shape obj5 = obj.getShape("RECTANGLE");
//        Shape obj3 = obj2;
//        System.out.println(obj1.draw());
        obj1.draw();
        obj2.draw();
        obj4.draw();
        obj5.draw();
        System.out.println(obj1 == obj2);
//        System.out.println(obj2 == obj3);
//        System.out.println(obj2.toString());
    }
}
