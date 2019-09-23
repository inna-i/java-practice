package com.globallogic.abstractPlusInterface;


public class Circle extends Shape implements Comparable {
    private double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    public double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return  super.toString() + ", radius= " + radius;
    }

    @Override
    public int compareTo(Object o) {
        Circle circle = (Circle) o;
        if (this.radius > circle.radius) return 1;
        if (this.radius < circle.radius) return -1;
        return 0;
    }
}
