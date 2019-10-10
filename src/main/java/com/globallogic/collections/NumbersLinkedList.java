package com.globallogic.collections;

import java.util.Collection;
import java.util.LinkedList;

public class NumbersLinkedList {
    Collection<String> list = new LinkedList<>();

    void printNumbers() {

        for(int i=0; i< 10; i++) {
            int randomNum = 1 + (int)(Math.random() * 10);
            list.add("num_" + randomNum);
        }

        list.forEach(item -> System.out.println(item));
    }
}
