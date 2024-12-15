package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyCollectionsTest {

    @Test
    void testBinarySearchNaturalOrder() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 6, 7, 8, 9);

        // Элемент присутствует
        assertEquals(3, MyCollections.binarySearch(list, 4));
        assertEquals(0, MyCollections.binarySearch(list, 1));
        assertEquals(7, MyCollections.binarySearch(list, 9));

        // Элемент отсутствует
        assertEquals(-1, MyCollections.binarySearch(list, 0)); // до начала
        assertEquals(-9, MyCollections.binarySearch(list, 10)); // после конца
        assertEquals(-5, MyCollections.binarySearch(list, 5)); // между элементами
    }

    @Test
    void testBinarySearchWithComparator() {
        List<String> list = Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape");

        // Элемент присутствует
        assertEquals(1, MyCollections.binarySearch(list, "banana", Comparator.naturalOrder()));
        assertEquals(4, MyCollections.binarySearch(list, "fig", Comparator.naturalOrder()));

        // Элемент отсутствует
        assertEquals(-7, MyCollections.binarySearch(list, "kiwi", Comparator.naturalOrder()));
    }
}