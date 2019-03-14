package zhangzhen.Algorithm.Chapter7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import zhangzhen.Algorithm.Common.IntegerComparator;

public class TestQuickSort {
    QuickSort<Integer> solution = new QuickSort();

    @Test
    public void functional() {
        Integer[] array = new Integer[]{1,3,2,8,5,4};
        Integer[] result = new Integer[]{1,2,3,4,5,8};
        solution.sort(array,new IntegerComparator());
        Assertions.assertArrayEquals(result,array);
    }

    @Test
    public void boundary() {

    }

    @Test
    public void negative() {

    }
}