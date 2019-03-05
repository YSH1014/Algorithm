package zhangzhen.Algorithm.Chapter2;

import java.lang.reflect.Array;
import java.util.Comparator;

public class InsertionSort<T> {
    //将array非递减排序
    /*

        循环不变式：
        初始：array[0]是排好序的
        保持：array[i]之前是排好序的
        终止：array[A.length]之前是排好序的
     */
    public void insertionSort(T[] array, Comparator comparator){
        for(int i = 1;i<array.length;i++){
            T key = array[i];
            int j = i-1;
            while (j>=0 && comparator.compare(array[j],key) > 0) {
                array[j + 1] = array[j];
                j--;
            }

            array[j+1] = key;
        }
    }
}
