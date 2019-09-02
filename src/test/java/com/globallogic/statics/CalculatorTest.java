package com.globallogic.statics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    private Calculator unit = new Calculator();

    @Test
    void calcPi() {
        double actual = unit.calcPi(1500);
        double expected = 3.1402593208490526;
        assertEquals(expected, actual);;
    }
}
