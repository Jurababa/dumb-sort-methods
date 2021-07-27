package com.juraba.dumbsorts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@ExtendWith(SpringExtension.class)
public class StalineSortTest {

    @Test
    void sortStringArray() {
        List<String> array = List.of("a", "c", "b", "e", "d");

        List<String> result = StalineSort.sortArray(array);

        Assertions.assertEquals(3, result.size());
        Assertions.assertEquals("a", result.get(0));
        Assertions.assertEquals("c", result.get(1));
        Assertions.assertEquals("e", result.get(2));
    }

    @Test
    void sortIntegerArray() {
        List<Integer> array = List.of(1, 4, 3, 2, 6, 5, 7);

        List<Integer> result = StalineSort.sortArray(array);

        Assertions.assertEquals(4, result.size());
        Assertions.assertEquals(1, result.get(0));
        Assertions.assertEquals(4, result.get(1));
        Assertions.assertEquals(6, result.get(2));
        Assertions.assertEquals(7, result.get(3));
    }
}
