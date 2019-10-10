package com.globallogic.collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("\u001B[32m" + "-------------NumbersArrayList-------------" + "\u001B[0m");
        NumbersArrayList nums = new NumbersArrayList();
        nums.printNumbers();

        System.out.println("\u001B[32m" + "-------------NumbersLinkedList-------------" + "\u001B[0m");
        NumbersLinkedList list = new NumbersLinkedList();
        list.printNumbers();

        System.out.println("\u001B[32m" + "-------------MyNumGenerator-------------" + "\u001B[0m");
        MyNumGenerator numGen = new MyNumGenerator(5, 64);
        numGen.generate();

    }

}
