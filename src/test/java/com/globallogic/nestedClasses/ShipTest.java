package com.globallogic.nestedClasses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShipTest {

    Ship unit = new Ship();
    Ship.Engine engine = unit.new Engine();

    @Test
    void engineCall() {
        String actual = engine.doJob();
        String expected = "Engine";
        assertEquals(expected, actual);;
    }
}
