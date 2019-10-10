package com.globallogic.nestedClasses;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"se", "java", "sdk", "ee"};

        // Sorting with Anonymous class Comparator
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String arg0, String arg1) {
                return arg0.length() - arg1.length();
            }
        });

        System.out.println(Arrays.toString(arr));

        // Nested classes
        Ship ship = new Ship();

        Ship.Engine engine = ship.new Engine();

        System.out.println(engine.doJob());

    }
}
