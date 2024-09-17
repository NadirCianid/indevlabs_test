package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void till5Test() {
        assertEquals(4, solution.missingNumber(new int[] {5,0,1,3,2}));
    }

    //Я думаю во втором примере задания небольшая ошибка в массиве.
    //В условиях сказано, что массив содержит числа от 0 до n, кроме одного.
    //А в примере первые 7 чисел пропущены
    @Test
    public void till12Test() {
        assertEquals(8, solution.missingNumber(new int[] {0, 1, 2, 3, 4, 5, 6, 7,9,10,11,12}));
    }

    @Test
    public void till1Test() {
        assertEquals(1, solution.missingNumber(new int[] {0}));
    }

    @Test
    public void till1AnotherTest() {
        assertEquals(0, solution.missingNumber(new int[] {1}));
    }

    @Test
    public void till0Test() {
        assertEquals(0, solution.missingNumber(new int[] {}));
    }

    @Test
    public void nullArrayAnotherTest() {
        assertEquals(-1, solution.missingNumber(null));
    }

    @Test
    public void till9Test() {
        assertEquals(8, solution.missingNumber(new int[] {9,6,4,2,3,5,7,0,1}));
    }

    @Test
    public void maximumInputMissingLast() {
        int n = 10000;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i;
        }
        assertEquals(10000, solution.missingNumber(nums));
    }

    @Test
    public void maximumInputMissingFirst() {
        int n = 10000;
        int[] nums = new int[n];
        for (int i = 1; i <= n; i++) {
            nums[i - 1] = i;
        }
        assertEquals(0, solution.missingNumber(nums));
    }

    @Test
    public void missingMiddleNumber() {
        assertEquals(4, solution.missingNumber(new int[] {3, 0, 1, 2, 5}));
    }

    @Test
    public void missingLargestNumber() {
        assertEquals(5, solution.missingNumber(new int[] {0, 1, 2, 3, 4}));
    }

    @Test
    public void randomNonSequentialNumbers() {
        assertEquals(5, solution.missingNumber(new int[] {3, 0, 1, 2, 4}));
    }
}
