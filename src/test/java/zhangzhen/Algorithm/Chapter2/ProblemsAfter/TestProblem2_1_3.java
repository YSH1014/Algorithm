package zhangzhen.Algorithm.Chapter2.ProblemsAfter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import zhangzhen.Algorithm.Chapter2.ProblemsSAfter.Problem2_1_3;

public class TestProblem2_1_3 {
    Problem2_1_3<Integer> solution = new Problem2_1_3();

    @Test
    public void functional() {
        Integer[] array = new Integer[]{1,2,3};
        Assertions.assertEquals(new Integer(1),solution.find(array,2));
        Assertions.assertNull(solution.find(array,6));
    }

    @Test
    public void boundary() {

    }

    @Test
    public void negative() {

    }
}