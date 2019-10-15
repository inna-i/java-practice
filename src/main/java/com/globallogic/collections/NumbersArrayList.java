package com.globallogic.collections;

import java.util.ArrayList;
import java.util.Collection;

public class NumbersArrayList {
    Collection<String> collection = new ArrayList<>();

    Collection<String> generateNumbersCollection() {
        for(int i=0; i < 10; i++) {
            collection.add("number_" + i);
        }

        return collection;
    }

    void printNumbers() {
        Collection<String> nums = generateNumbersCollection();

        nums.forEach(num -> System.out.println(num));
    }
}
