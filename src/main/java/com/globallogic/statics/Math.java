package com.globallogic.statics;

public class Math {
    private final static double PI = 3.14;

    public static int findMin(int[] arr) {
        int minNumber = arr[0];
        for (int i : arr) {
            if (minNumber > i) {
                minNumber = i;
            }
        }
        return minNumber;
    }

    public static int findMax(int[] arr) {
        int maxNumber = arr[0];
        for (int i : arr) {
            if (maxNumber < i) {
                maxNumber = i;
            }
        }
        return maxNumber;
    }

    public static double areaOfCircle(double radius) {
        return PI * java.lang.Math.pow(radius, 2);
    }
}
