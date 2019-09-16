package com.globallogic.polymorphism;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest {

    private Triangle unit = new Triangle("black", 5, 5, 5);

    @Test
    void calcTriangleArea() {
        double actual = unit.calcArea();
        double expected = 10.825317547305483;
        assertEquals(expected, actual);;
    }
}
