package com.globallogic.abstractPlusInterface;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Rectangle("RED", 11, 22),
                new Triangle("BLACK", 5, 5, 5),
                new Circle("GREEN", 10),
        };

        for (Shape shape : shapes) {
            shape.draw();
        }

        System.out.println("---------------------------------------");
        System.out.println("------------Sort by area---------------");
        System.out.println("---------------------------------------");

        Rectangle[] rectangles = {
                new Rectangle("RED", 100, 5),
                new Rectangle("RED", 10, 10),
                new Rectangle("RED", 11, 22),
        };

        Arrays.sort(rectangles);

        for (Rectangle rectangle : rectangles) {
            rectangle.draw();
        }

        System.out.println("---------------------------------------");
        System.out.println("------------Sort by colors-------------");
        System.out.println("---------------------------------------");

        Shape[] shapeColors = {
                new Rectangle("PINk", 10, 12),
                new Rectangle("RED", 11, 22),
                new Triangle("BLACK", 5, 5, 5),
                new Circle("GREEN", 10),
                new Circle("BLUE", 10),
        };

        Arrays.sort(shapeColors, new ColorComparator());

        for (Shape shapeColor : shapeColors) {
            shapeColor.draw();
        }

    }
}
