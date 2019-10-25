package com.globallogic.collections;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyNumGeneratorTest {

    @Test
    void generateCall() {
        MyNumGenerator generatedNum = new MyNumGenerator(5, 64);
        List<Integer> list = generatedNum.generate();
        int actual = list.size();
        int expected = 5;
        assertEquals(expected, actual);;
    }
}
