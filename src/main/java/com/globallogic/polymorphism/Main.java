package com.globallogic.polymorphism;

public class Main {
    public static void main(String[] args) {
        double sumCircleArea = 0;
        double sumRectArea = 0;
        double sumTriangleArea = 0;

//        Shape circle = new Circle("green", 10);//
//        System.out.println(circle);
//        System.out.println(circle.printArea());
//
//        Shape rec = new Rectangle("red", 11, 11.5);//
//        System.out.println(rec);
//        System.out.println(rec.printArea());
//
//        Shape triangle = new Triangle("black", 5, 5, 5);//
//        System.out.println(triangle);
//        System.out.println(triangle.printArea());

        Shape[] shapes = {
            new Circle("green", 10),
            new Circle("green", 11),
            new Rectangle("red", 11, 11.5),
            new Triangle("black", 5, 5, 5),
            new Triangle("blue", 5, 5, 5),
        };

        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                sumCircleArea += shape.calcArea();
            } else if (shape instanceof Rectangle) {
                sumRectArea += shape.calcArea();
            } else if (shape instanceof Triangle) {
                sumTriangleArea += shape.calcArea();
            }

            System.out.println(shape);
            System.out.println(shape.printArea());
        }

        System.out.println("Rectangles total area: " + sumRectArea
                + " Circle total area: " +  sumCircleArea + " Triangle total area: " + sumTriangleArea
        );
    }
}
