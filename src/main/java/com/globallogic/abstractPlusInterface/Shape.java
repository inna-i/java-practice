package com.globallogic.abstractPlusInterface;

import java.util.Comparator;

abstract class Shape implements Drawable, Comparable {
    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    abstract public double calcArea();

    @Override
    public int compareTo(Object o) {
        Shape shape = (Shape) o;
        if (this.calcArea() > shape.calcArea()) {
            return 1;
        } else if (this.calcArea() < shape.calcArea()) {
            return -1;
        }

        return 0;
    }

    @Override
    public void draw() {
        System.out.println(toString() + ", area is " + calcArea());
    }

    @Override
    public String toString() {
        return "This is " + getClass().getSimpleName() + ", color is: " + shapeColor;
    }
}
