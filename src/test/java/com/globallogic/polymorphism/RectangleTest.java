package com.globallogic.polymorphism;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    private Rectangle unit = new Rectangle("black", 5, 5);

    @Test
    void calcRectangleArea() {
        double actual = unit.calcArea();
        double expected = 25;
        assertEquals(expected, actual);;
    }
}
