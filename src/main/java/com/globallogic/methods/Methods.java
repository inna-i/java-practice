package com.globallogic.methods;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        ArrayProcessing filter = new ArrayProcessing();
        int[] inputArr = { 1,2,3,4,2,5 };

        System.out.println(Arrays.toString(filter.removeDuplicates(inputArr)));

    }
}
