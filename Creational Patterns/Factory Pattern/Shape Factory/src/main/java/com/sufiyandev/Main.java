package com.sufiyandev;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();


        Shape square = shapeFactory.draw("square");
        square.draw();

        Shape circle = shapeFactory.draw("circle");
        circle.draw();
    }
}