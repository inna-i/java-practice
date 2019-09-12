package com.globallogic.inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EthernetAdapterTest {

    private EthernetAdapter device1 = new EthernetAdapter("Samsung", "333YUTT78", 100.4f, "00:AS:88:TR", 100);
    private EthernetAdapter device2 = new EthernetAdapter("Samsung", "333YUTT78", 100.4f, "00:AS:88:TR", 100);
    private EthernetAdapter device3 = new EthernetAdapter("TP-Link", "333YUTT78", 100.4f, "00:AS:88:TR", 100);

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
        String deviceDetails = "EthernetAdapter: manufacturer = Samsung, price = 100.4, serialNumber = 333YUTT78, mac = 00:AS:88:TR, speed = 100";
        assertEquals(deviceDetails, actual);;
    }
}
