package com.globallogic.exceptions;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------Task 1---------------------------\n");
        // Task 1
        try {
            throw new Exception("Here is my exception");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Final part of custom exception");
        }
        System.out.println("-------------------Task 2---------------------------\n");
        // Task 2
        try {
            MyTest test = new MyTest();
            test.test();
            System.out.println("Try without exception");
        } catch (MyException e) {
            System.out.println(e);
        }

        System.out.println("-------------------Task 3---------------------------\n");

        // Task 3
        try {
            Person p1 = new Person();
            p1.setFirstName("Tony");
            p1.setLastName("Iommi");
            p1.setAge(150);
        } catch (InvalidAgeException e) {
            System.out.println(e);
        }

    }
}
