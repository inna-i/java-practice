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

        Rectangle[] rectangles = {
                new Rectangle("RED", 100, 5),
                new Rectangle("RED", 10, 10),
                new Rectangle("RED", 11, 22),
        };

        Arrays.sort(rectangles);

        for (Rectangle rectangle : rectangles) {
            rectangle.draw();
        }

    }
}
