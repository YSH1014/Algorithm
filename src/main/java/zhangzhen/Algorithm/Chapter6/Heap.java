package zhangzhen.Algorithm.Chapter6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Heap <T>{
    private  T[] heap;
    private  Comparator<T> comparator;
    private int size;
    public Heap(T[] elements,Comparator<T> comparator){
        this.comparator = comparator;
        int top = (elements.length + 1)/2 -1;
        this.size = elements.length;
        this.heap = elements;
        for(int i  = top;i>=0;i--){
            heapIfy(i);
        }
    }

    //root.left 和root.right均为堆
    private void heapIfy(int root){
        int max = root;
        if(left(root) <size && comparator.compare(heap[max],heap[left(root)]) < 0) max = left(root);
        if(right(root) < size && comparator.compare(heap[max],heap[right(root)]) < 0) max = right(root);

        if(max != root){
            exchange(max,root);
            heapIfy(max);
        }
    }
    private int left(int root){
        return root*2+1;
    }
    private int right(int root){
        return root*2+2;
    }
    private int parent(int child){
        return  (child+1)/2-1;
    }
    private void exchange(int x,int y){
        T tmp = heap[x];
        heap[x]  = heap[y];
        heap[y] = tmp;
    }
    public void sort(){
        for(int i = heap.length-1;i>=0;i--){
            exchange(i,0);
            size--;
            heapIfy(0);
        }
    }
}
