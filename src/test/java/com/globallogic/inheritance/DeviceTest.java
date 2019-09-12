package com.globallogic.inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeviceTest {

    private Device device1 = new Device("Samsung", "67YUTT78", 100.4f);
    private Device device2 = new Device("Samsung", "67YUTT78", 100.4f);
    private Device device3 = new Device("Samsung", "99YUTT78", 100.4f);

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
        String deviceDetails = "Device: manufacturer = Samsung, price = 100.4, serialNumber = 67YUTT78";
        assertEquals(deviceDetails, actual);;
    }
}
