package zhangzhen.Algorithm.Chapter4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import zhangzhen.Algorithm.Chapter4.ProblemAfter.MaxSubArrayLiner;

public class TestMaxSubArray {
    MaxSubArray solution = new MaxSubArray();
    MaxSubArrayLiner solution2 = new MaxSubArrayLiner();
    @Test
    public void functional() {
        int[] a = {13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
        Assertions.assertEquals(43,solution.maxSubArray(a));
        Assertions.assertEquals(43,solution2.calc(a));
    }

    @Test
    public void boundary() {
        int[] a=new int[]{1};
        Assertions.assertEquals(1,solution.maxSubArray(a));
        int[] b  = new int[]{-1};
        Assertions.assertEquals(0,solution.maxSubArray(b));

        int[] c = new int[]{1,2};
        Assertions.assertEquals(3,solution.maxSubArray(c));
        int[] d = new int[]{1,-2};
        Assertions.assertEquals(1,solution.maxSubArray(d));

    }

    @Test
    public void negative() {

    }
}