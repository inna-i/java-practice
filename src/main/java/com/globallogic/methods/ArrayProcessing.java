package com.globallogic.methods;
import java.util.Arrays;

public class ArrayProcessing {
    public int[] removeDuplicates(int[] arr) {
        int[] filteredArr = new int[arr.length];
        int counter = 0;

        for (int i : arr) {
            if (!isDuplicate(filteredArr, i)) {

                filteredArr[counter] = i;
                counter++;
            }
        }

        return Arrays.copyOf(filteredArr, counter);
    }

    private boolean isDuplicate(int[] arr, int n) {
        for (int i : arr) {
            if (i == n) {
                return true;
            }
        }
        return false;
    }
}
