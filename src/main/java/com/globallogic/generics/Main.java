package com.globallogic.generics;

public class Main {
    public static void main(String[] args) {
        MyBox <Integer> box = new MyBox<>();
        // MyBox <Integer> box = new MyBox<Integer>(); // old way
        box.setT(Integer.valueOf(10));

        Integer x1 = box.getT();
        System.out.println(x1);
       // box.set("Hello"); // it will cause compilation error

        Integer[] arr1 = {2,4,5,6,7,9};
        Integer res = testGenerics(arr1, 2);

    }

    public static <T> T testGenerics(T[] a, int x) {
        T result = a[x];
        return result;
    }
}
