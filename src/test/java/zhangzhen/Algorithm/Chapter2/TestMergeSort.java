package zhangzhen.Algorithm.Chapter2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import zhangzhen.Algorithm.Common.IntegerComparator;

import java.lang.reflect.Array;
import java.lang.reflect.Method;

public class TestMergeSort {
    MergeSort<Integer> solution = new MergeSort(new IntegerComparator());

    @Test
    public void testMerge(){
        try {
            Integer[] array = new Integer[]{1, 3, 5, 2, 4, 6};
            Integer[] result = new Integer[]{1, 2, 3, 4, 5, 6};
            Method merge = solution.getClass().getDeclaredMethod("merge",Object[].class, int.class, int.class, int.class);
            merge.setAccessible(true);
            merge.invoke(solution,(Object)array,0,3,6);
            Assertions.assertArrayEquals(result,array);
        }catch (NoSuchMethodException e){
            System.out.println("no such method");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Test
    public void functional() {
        Integer[] arrray = new Integer[]{1,3,5,2,4,6};
        solution.mergeSort(arrray);
        Integer[] result = new Integer[]{1,2,3,4,5,6};
        Assertions.assertArrayEquals(result,arrray);
    }

    @Test
    public void boundary() {

    }

    @Test
    public void negative() {

    }
}