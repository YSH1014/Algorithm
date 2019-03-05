package zhangzhen.Algorithm.Chapter2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import zhangzhen.Algorithm.Common.IntegerComparator;

public class TestInsertionSort {
    InsertionSort<Integer> solution = new InsertionSort();

    @Test
    public void functional() {
        Integer[] array = new Integer[]{1,2,6,8,3};
        Integer[] result = new Integer[]{1,2,3,6,8};
        solution.insertionSort(array,new IntegerComparator());
        Assertions.assertArrayEquals(result,array);
    }

    @Test
    public void boundary() {

    }

    @Test
    public void negative() {

    }
}