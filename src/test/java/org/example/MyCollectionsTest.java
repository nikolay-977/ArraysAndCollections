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

        // Элемента нет
        assertEquals(-1, MyCollections.binarySearch(list, 0)); // до начала
        assertEquals(-9, MyCollections.binarySearch(list, 10)); // после конца
        assertEquals(-5, MyCollections.binarySearch(list, 5)); // между элементами
    }

    @Test
    void testBinarySearchWithComparator() {
        List<String> list = Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape");

        // С использованием натурального порядка
        assertEquals(1, MyCollections.binarySearch(list, "banana", Comparator.naturalOrder()));
        assertEquals(4, MyCollections.binarySearch(list, "fig", Comparator.naturalOrder()));
        // Элемент отсутствует
        assertEquals(-1, MyCollections.binarySearch(list, "kiwi", Comparator.reverseOrder()));

        // С использованием обратного порядка
        List<String> reverseSortedList = Arrays.asList("grape", "fig", "date", "cherry", "banana", "apple");

        // Элемент присутствует
        assertEquals(4, MyCollections.binarySearch(reverseSortedList, "banana", Comparator.reverseOrder()));
        assertEquals(1, MyCollections.binarySearch(reverseSortedList, "fig", Comparator.reverseOrder()));
        // Элемент отсутствует
        assertEquals(-1, MyCollections.binarySearch(reverseSortedList, "kiwi", Comparator.reverseOrder()));

    }
}