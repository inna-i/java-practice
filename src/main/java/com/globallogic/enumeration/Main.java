package com.globallogic.enumeration;

public class Main {
    public static void main(String[] args) {
        for (Fruits fruit : Fruits.values()) {
            System.out.println(fruit.toString());
        }
    }
}
