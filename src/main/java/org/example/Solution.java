package org.example;

public class Solution {
    public int missingNumber(int[] nums) {
        if(nums == null) {
            return -1;
        }

        int res = nums.length;

        for(int i = 0; i < nums.length; i++) {
            res += i - nums[i];
        }

        return res;
    }
}
