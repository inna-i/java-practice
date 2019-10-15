package com.globallogic.collections;

import java.util.ArrayList;
import java.util.List;

public class MyNumGenerator {
    int numOfElm;
    int maxNum;
    List<Integer> list = new ArrayList<>();  ;

    MyNumGenerator(int el, int max) {
        this.numOfElm = el;
        this.maxNum = max;
    }

    void generate() {
        for(int i=0; i < numOfElm; i++) {
            int randomNum = 1 + (int)(Math.random() * maxNum);
            list.add(randomNum);
        }

        System.out.println(list.toString());
    }
}
