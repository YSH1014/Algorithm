package zhangzhen.Algorithm.Chapter2;

import java.lang.reflect.Array;
import java.util.Comparator;

public class MergeSort<T> {

    Comparator<T> comparator;
    public MergeSort(Comparator<T> comparator){
        this.comparator = comparator;
    }
    public void mergeSort(T[] array){
        mergeSortCore(array,0,array.length);
    }
    private void mergeSortCore(T[] array,int left,int right){
        if( right-left <=1) return;
        int mid = (left+right)/2;

        mergeSortCore(array,left,mid);
        mergeSortCore(array,mid,right);
        merge(array,left,mid,right);
    }
    /*
    merge [left,mid),[mid,right)
     */
    private void merge(T[] array,int left,int mid,int right){
        T[] arrayL = (T[]) new Object[mid - left];
        T[] arrayR = (T[]) new Object[right - mid];

        for(int i = left;i<mid;i++) arrayL[i-left] = array[i];
        for(int i = mid;i<right;i++) arrayR[i-mid] = array[i];
        int pointL  = 0;
        int pointR = 0;
        int i = left;
        while (pointL<mid-left && pointR<right-mid){
            if(pointL == arrayL.length) array[i] = arrayR[pointR++];
            if(pointR == arrayR.length) array[i] = arrayL[pointL++];
            if( comparator.compare(arrayL[pointL],arrayR[pointR]) < 0) {
                array[i] = arrayL[pointL];
                pointL++;
            }else {
                array[i] = arrayR[pointR];
                pointR++;
            }
            i++;
        }
    }
}
