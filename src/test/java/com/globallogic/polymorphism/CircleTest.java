package com.globallogic.polymorphism;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {

    private Circle unit = new Circle("black", 10);

    @Test
    void calcCircleArea() {
        double actual = unit.calcArea();
        double expected = 314.1592653589793;
        assertEquals(expected, actual);;
    }
}
