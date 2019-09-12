package com.globallogic.inheritance;

import java.util.Arrays;

public class Samsung {
    public static void main(String[] args) {

        Device samsung = new Device("Samsung", "74488GTRD", 101.54f);
        Monitor samsungMonitor = new Monitor("Samsung", "74488GTRD", 102.99f, 1980, 1048);
        EthernetAdapter adapter = new EthernetAdapter("TP-Link", "74488GTRD", 10.54f, "00:A0:C9:14:C8:29", 100);

        System.out.println(samsung);
        System.out.println(samsungMonitor);
        System.out.println(adapter);

        Monitor monitor1 = new Monitor("Samsung", "67YUTT78", 100.4f, 1920, 1048);
        Monitor monitor2 = new Monitor("Samsung", "67YUTT78", 100.4f, 1920, 1048);
        Monitor monitor3 = new Monitor("Samsung", "99OOP9333", 100.4f, 1920, 1048);

        System.out.println(monitor1.equals(monitor2)); // true
        System.out.println(monitor1.equals(monitor3)); // false

        Monitor[] monitors = new Monitor[] {monitor1, monitor2, monitor3 };
        System.out.println(Arrays.toString(monitors));

    }
}
