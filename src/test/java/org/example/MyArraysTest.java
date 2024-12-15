package org.example;

import org.junit.jupiter.api.Test;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyArraysTest {

    @Test
    void testBinarySearchByte() {
        byte[] array = {1, 2, 3, 4, 5};
        assertEquals(2, MyArrays.binarySearch(array, (byte) 3));
        assertEquals(-6, MyArrays.binarySearch(array, (byte) 6));
        assertEquals(1, MyArrays.binarySearch(array, 1, 3, (byte) 2));
        assertEquals(-4, MyArrays.binarySearch(array, 1, 3, (byte) 5));
    }

    @Test
    void testBinarySearchChar() {
        char[] array = {'a', 'b', 'c', 'd', 'e'};
        assertEquals(2, MyArrays.binarySearch(array, 'c'));
        assertEquals(-6, MyArrays.binarySearch(array, 'f'));
        assertEquals(1, MyArrays.binarySearch(array, 1, 3, 'b'));
        assertEquals(-4, MyArrays.binarySearch(array, 1, 3, 'e'));
    }

    @Test
    void testBinarySearchDouble() {
        double[] array = {1.0, 2.0, 3.0, 4.0, 5.0};
        assertEquals(2, MyArrays.binarySearch(array, 3.0));
        assertEquals(-6, MyArrays.binarySearch(array, 6.0));
        assertEquals(1, MyArrays.binarySearch(array, 1, 3, 2.0));
        assertEquals(-4, MyArrays.binarySearch(array, 1, 3, 5.0));
    }

    @Test
    void testBinarySearchFloat() {
        float[] array = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
        assertEquals(2, MyArrays.binarySearch(array, 3.0f));
        assertEquals(-6, MyArrays.binarySearch(array, 6.0f));
        assertEquals(1, MyArrays.binarySearch(array, 1, 3, 2.0f));
        assertEquals(-4, MyArrays.binarySearch(array, 1, 3, 5.0f));
    }

    @Test
    void testBinarySearchInt() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(2, MyArrays.binarySearch(array, 3));
        assertEquals(-6, MyArrays.binarySearch(array, 6));
        assertEquals(1, MyArrays.binarySearch(array, 1, 3, 2));
        assertEquals(-4, MyArrays.binarySearch(array, 1, 3, 5));
    }

    @Test
    void testBinarySearchLong() {
        long[] array = {1L, 2L, 3L, 4L, 5L};
        assertEquals(2, MyArrays.binarySearch(array, 3L));
        assertEquals(-6, MyArrays.binarySearch(array, 6L));
        assertEquals(1, MyArrays.binarySearch(array, 1, 3, 2L));
        assertEquals(-4, MyArrays.binarySearch(array, 1, 3, 5L));
    }

    @Test
    void testBinarySearchShort() {
        short[] array = {1, 2, 3, 4, 5};
        assertEquals(2, MyArrays.binarySearch(array, (short) 3));
        assertEquals(-6, MyArrays.binarySearch(array, (short) 6));
        assertEquals(1, MyArrays.binarySearch(array, 1, 3, (short) 2));
        assertEquals(-4, MyArrays.binarySearch(array, 1, 3, (short) 5));
    }

    @Test
    void testBinarySearchGeneric() {
        Integer[] array = {1, 2, 3, 4, 5};
        assertEquals(2, MyArrays.binarySearch(array, 3, Comparator.naturalOrder()));
        assertEquals(-6, MyArrays.binarySearch(array, 6, Comparator.naturalOrder()));
        assertEquals(1, MyArrays.binarySearch(array, 1, 3, 2, Comparator.naturalOrder()));
        assertEquals(-4, MyArrays.binarySearch(array, 1, 3, 5, Comparator.naturalOrder()));
    }
}
