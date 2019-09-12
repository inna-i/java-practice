package com.globallogic.inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MonitorTest {

    private Monitor device1 = new Monitor("Samsung", "333YUTT78", 100.4f, 1920, 1048);
    private Monitor device2 = new Monitor("Samsung", "333YUTT78", 100.4f, 1920, 1048);
    private Monitor device3 = new Monitor("Dell", "99YUTT78", 100.4f, 760, 560);

    @Test
    void equalsWithTrue() {
        boolean actual = device1.equals(device2);
        assertEquals(true, actual);;
    }

    @Test
    void equalsWithFalse() {
        boolean actual = device1.equals(device3);
        assertEquals(false, actual);;
    }

    @Test
    void deviceToString() {
        String actual = device1.toString();
        String deviceDetails = "Monitor: manufacturer = Samsung, price = 100.4, serialNumber = 333YUTT78, resolutionX = 1920, resolutionY = 1048";
        assertEquals(deviceDetails, actual);;
    }
}
