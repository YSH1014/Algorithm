package zhangzhen.Algorithm.Chapter7;

import java.util.Comparator;

public class QuickSort<T> {
    public void sort(T[] array, Comparator<T> comparator){
        quickSortCore(array,comparator,0,array.length);
    }
    private void quickSortCore(T[] array,Comparator<T> comparator,int l,int r){
        if(l+1 >= r) return;
        int m =  partition(array,comparator,l,r);
        quickSortCore(array,comparator,l,m);
        quickSortCore(array,comparator,m+1,r);
    }
    private int partition(T[] array,Comparator<T> comparator,int l,int r){
        T  key = array[r-1];
        int i  =l;
        int j = l;
        /*
        循环不变式：
        初始：[l,i)无元素（所有元素小于key成立）；[i,j)无元素（大于key成立）
        保持：j在前进过程中，小于key则与i交换并将i+1,所以[l,i)小于Key，[i,j)大于key成立。
        终止：j=r-1(key)。此时i指向第一个大于Key的元素
         */
        for(j  =l;j<r-1;j++){
            if(comparator.compare(array[j],key) < 0) {
                swap(array,i,j);
                i++;
            }
        }
        swap(array,i,r-1);
        return i;
    }
    private void swap(T[] array,int i,int j){
        T tmp = array[i];
        array[i] = array[j];
        array[j ] = tmp;
    }
}
