package com.globallogic.abstractPlusInterface;


public class Triangle extends Shape implements Comparable {

    private double a;
    private double b;
    private double c;

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcArea() {
        double s = (a + b + c)/2;
        return Math.sqrt(s*(s - a)*(s - b)*(s - c));
    }

    @Override
    public int compareTo(Object o) {
        Triangle triangle = (Triangle) o;
        if (this.calcArea() > triangle.calcArea()) {
            return 1;
        } else if (this.calcArea() < triangle.calcArea()) {
            return -1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + " " +
                "a=" + a +
                ", b= " + b +
                ", c= " + c;
    }

}
