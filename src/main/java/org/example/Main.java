package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Пример с MyArrays
        int[] intArray = {1, 4, 5, 6, 7, 2, 3};
        int index = MyArrays.binarySearch(intArray, 4);
        System.out.println("Индекс элемента 4 в intArray: " + index);

        // Пример с MyCollections
        List<String> stringList = Arrays.asList("banana", "apple", "pear", "kiwi");
        stringList.sort(String::compareTo); // Предварительно сортируем список
        int stringIndex = MyCollections.binarySearch(stringList, "pear");
        System.out.println("Индекс элемента 'pear' в stringList: " + stringIndex);

        // С использованием компаратора
        Comparator<String> reverseComparator = Comparator.reverseOrder();
        int reverseIndex = MyCollections.binarySearch(stringList, "apple", reverseComparator);
        System.out.println("Индекс элемента 'apple' в отсортированном по убыванию списке: " + reverseIndex);
    }
}