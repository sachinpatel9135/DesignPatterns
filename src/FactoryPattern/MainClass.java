package FactoryPattern;

public class MainClass {
    public static void main(String args[]) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shapeObject = shapeFactory.getShape("CIRCLE");
        shapeObject.draw();
    }
}
