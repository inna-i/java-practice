package com.globallogic.abstractPlusInterface;

abstract class Shape implements Drawable {
    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    abstract public double calcArea();

    @Override
    public void draw() {
        System.out.println(toString() + ", area is " + calcArea());
    }

    @Override
    public String toString() {
        return "This is " + getClass().getSimpleName() + ", color is: " + shapeColor;
    }
}
