package com.globallogic.arrays;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.stream.Collectors;

public class ArraysTasks {


    /*
    Increase by 2
        The sequence of integers is given. Increase by 2 each its non-negative element.
     */
    public int[] increaseBy2(int[] arr) {
        for (int i=0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                arr[i] = arr[i] + 2;
            }
        }
        return arr;
    }

    /*
    The first is not greater for 2,5
        Array of real numbers is given. Find the first element in array which value does not exceed 2.5.
        In the case of absence the specified element print "Not Found"
    */
    public double findFirstNumber(double[] arr) {
        for (double i : arr) {
            if (i <= 2.5) {
                return i;
            }
        }

        System.out.println("Not Found");
        return 0;
    }

    /*
    The arithmetic mean of positive
        The sequence of real numbers is given. Find the arithmetic mean of positive numbers.
     */
    public double arithmeticalMean(double[] arr) {
        double result = 0;
        int counter = 0;

        for(double n : arr) {
            if (n > 0) {
                result += n;
                counter += 1;
            }
        }

        return result == 0 ? 0 : result/counter;
    }

    /*
        The sequence of integers is given. Find max int value in sequence
     */
    public int findMax(int[] arr) {
        int max = arr[0];

        for (int n : arr) {
            if (n > max) {
                max = n;
            }
        }

        return max;
    }

    /*
    Maximum of absolute values
        The sequence of real numbers is given. Lets find their absolute values. Find the maximum value among these absolute values.
     */
    public double maxOfAbsoluteValues(double[] arr) {
        DoubleSummaryStatistics stats = Arrays
                .stream(arr)
                .boxed()
                .collect(Collectors.summarizingDouble(Double::doubleValue));

        if (stats.getMax() > Math.abs(stats.getMin())) {
            return stats.getMax();
        }

        return  stats.getMin();
    }

    /*
    Negative elements
        The sequence of n real numbers is given. Find the sum and the number of negative elements in it.
     */
    public double negativeElementsSum(double[] arr) {
        double sum = 0;
        for (double n : arr) {
            if(n < 0) {
                sum += n;
            }
        }
        return sum;
    }

    /*
    Reverse array
    Array of int is given. Return the given array in the reverse order
     */
    public int[] reverseArray(int[] arr) {
        int len = arr.length;
        for(int i=0; i < len/2; i++) {
            int temp = arr[i];
            arr[i] = arr[len - i - 1];
            arr[len - i - 1] = temp;
        }

        return arr;
    }
}