package com.sufiyandev;

public class ShapeFactory {
    Shape draw(String type) {
        switch(type) {
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            case "triangle":
                return new Triangle();
        }
        return null;
    }
}
