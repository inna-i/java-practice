package com.globallogic.methods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayProcessingTest {

    private ArrayProcessing unit = new ArrayProcessing();

    @Test
    void removeDuplicates() {
        int[] actual = unit.removeDuplicates(new int[]{1, 2, -5, 2, 1, 6});
        int[] expected = {1, 2, -5, 6};
        assertArrayEquals(expected, actual);
    }

}