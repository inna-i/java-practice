package com.globallogic.abstractPlusInterface;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return width * height;
    }

    @Override
    public int compareTo(Object o) {
        Rectangle rectangle = (Rectangle) o;
        if (this.calcArea() > rectangle.calcArea()) {
            return 1;
        } else  if (this.calcArea() < rectangle.calcArea()) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + ", " +
                "width=" + width +
                ", height=" + height;
    }

}
