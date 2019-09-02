package com.globallogic.statics;

public class Calculator {

    public static double calcPi(int n) {
        double pi = 0;
        int temp = 1;

        for(int i = 1; i < n; i += 2) {
           pi = pi + temp*4.0/i;
           temp = temp*(-1);
        }
        return pi;
    }
}
