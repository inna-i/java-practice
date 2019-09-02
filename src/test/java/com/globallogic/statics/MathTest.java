package com.globallogic.statics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MathTest {

    private Math unit = new Math();

    @Test
    void findMin() {
        int actual = unit.findMin(new int[]{1, 2, -5, 7, 0, 6});
        int expected = -5;
        assertEquals(expected, actual);;
    }

    @Test
    void findMax() {
        int actual = unit.findMax(new int[]{1, 2, -5, 7, 0, 6});
        int expected = 7;
        assertEquals(expected, actual);;
    }

    @Test
    void areaOfCircle() {
        double actual = unit.areaOfCircle(10);
        double expected = 314.0;
        assertEquals(expected, actual);
    }
}
