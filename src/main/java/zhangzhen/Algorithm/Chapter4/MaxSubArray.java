package zhangzhen.Algorithm.Chapter4;

public class MaxSubArray {
    public int maxSubArray(int[] array){
        return maxSubArrayCore(array,0,array.length);
    }
    private int maxSubArrayCore(int[] array,int left,int right){
        if(left >= right) {
            return 0;
        }
        if(left+1 == right) return array[left]>0?array[left]:0;

        int leftMax = maxSubArrayCore(array,left,(left+right)/2);
        int rightMax = maxSubArrayCore(array,(left+right)/2+1,right);
        int crossMax = maxSubArrayCross(array,left,right);

        int max = leftMax;
        if(rightMax > max) max= rightMax;
        if(crossMax > max) max = crossMax;

        return  max;
    }
    private int maxSubArrayCross(int[] array,int left,int right){
        int leftMax =0 ;
        int rightMax = 0;
        int sum = 0;
        for(int i = (left+right)/2-1;i>=left;i--){
            sum+=array[i];
            if(sum  > leftMax) leftMax = sum;
        }
        sum = 0;
        for(int i = (left + right) / 2;i<right;i++){
            sum += array[i];
            if(sum > rightMax) rightMax = sum;
        }
        return leftMax+rightMax;
    }
}
