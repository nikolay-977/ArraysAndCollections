package org.example;

import java.util.Comparator;
import java.util.List;

public class MyCollections {
    public static <T extends Comparable<? super T>> int binarySearch(List<T> list, T key) {
        return binarySearch(list, key, Comparator.naturalOrder());
    }

    public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c) {
        int fromIndex = 0;
        int toIndex = list.size();

        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) / 2;
            int cmp = c.compare(list.get(mid), key);
            if (cmp == 0) {
                return mid;
            }
            if (cmp < 0) {
                fromIndex = mid + 1;
            } else {
                toIndex = mid;
            }
        }
        return -(fromIndex + 1);
    }
}
