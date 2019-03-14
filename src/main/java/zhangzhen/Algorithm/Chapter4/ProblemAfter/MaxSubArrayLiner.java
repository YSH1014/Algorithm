package zhangzhen.Algorithm.Chapter4.ProblemAfter;

public class MaxSubArrayLiner {
    public int calc(int[] array){
        int max = 0;
        int currentSum = 0;
        for(int i  =0;i<array.length;i++){
            currentSum += array[i];
            if(currentSum < 0) currentSum=0;  //此处开始
            if(currentSum > max) max = currentSum; //此处结束
        }
        return  max;
    }
}
