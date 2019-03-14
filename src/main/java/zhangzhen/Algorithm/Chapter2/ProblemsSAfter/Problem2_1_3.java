package zhangzhen.Algorithm.Chapter2.ProblemsSAfter;

public class Problem2_1_3<T> {
    /*
    在array中找出key所处下标。
    初始：array[0]之前没有找到
    保持：array[i]之前没有找到
    终止：array[i]==key
    特殊情况：array[length]前没找到（此时i=length，退出循环），返回NULL
     */
    public Integer find(T[] array,T key){
        int i = 0;
        while (i<array.length && !array[i].equals(key)) i++;

        if(i == array.length) return  null;
        else return i;



    }
}
