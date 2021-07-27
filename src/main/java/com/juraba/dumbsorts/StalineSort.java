package com.juraba.dumbsorts;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Implements the (un)famous Stalin sort.
 * "It achieves sorting by simply eliminating any elements that isn't in order"
 * @author jurababa
 */
public class StalineSort {

    /**
     * Returns an array with only elements that were already in order
     * @param listToSort
     * @param <T>
     * @return
     */
    public static <T extends Comparable<T>> List<T> sortArray(List<T> listToSort) {
        final List<T> sortedList = new LinkedList<>();

        Iterator i = listToSort.iterator();

        T firstItem = (T) i.next();
        sortedList.add(firstItem);

        while (i.hasNext()) {
            T nextItem = (T) i.next();
            if (sortedList.get(sortedList.size() - 1).compareTo (nextItem) < 0) {
                sortedList.add(nextItem);
            }
        }

        return sortedList;
    }
}
