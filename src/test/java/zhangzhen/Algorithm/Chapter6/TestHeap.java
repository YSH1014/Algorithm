package zhangzhen.Algorithm.Chapter6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import zhangzhen.Algorithm.Common.IntegerComparator;

public class TestHeap {

    @Test
    public void functional() {
        Integer[] array = new Integer[]{1,3,2,7,5,6};
        Heap<Integer> heap = new Heap<>(array,new IntegerComparator());
        Integer[] result = new Integer[]{1,2,3,5,6,7};
        heap.sort();
        Assertions.assertArrayEquals(result,array);
    }

    @Test
    public void boundary() {

    }

    @Test
    public void negative() {

    }
}