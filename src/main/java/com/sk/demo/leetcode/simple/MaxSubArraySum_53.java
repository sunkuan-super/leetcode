package com.sk.demo.leetcode.simple;

import java.util.Arrays;

/**
 * @Title: MaxSubArraySum
 * @Package: com.sk.util.leetcode.simple
 * @Description: 动态规划
 * @Author: sk
 * @Date: 2022/3/2 - 16:05
 */
public class MaxSubArraySum_53 {

    /**
     * 贪心算法
     *
     * @param nums 数组
     * @return 最大子数组之和
     */
    public static int maxSubArray(int[] nums) {
        // 最大的和为第一个元素
        int maxSum = nums[0];
        // 当前和为第一个元素
        int currSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (currSum < 0) {
                currSum = nums[i];
            } else {
                currSum = currSum + nums[i];
            }
            maxSum = Integer.max(maxSum, currSum);
        }
        return maxSum;
    }

    /**
     * 动态规划
     *
     * @param nums
     * @return
     */
    public static int maxSubArrayDP(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > 0) {
                nums[i] = nums[i - 1] + nums[i];
            }
        }

        Arrays.sort(nums);
        return nums[nums.length - 1];
    }

    public static int maxSubArrayDPPro(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > 0) {
                nums[i] = nums[i - 1] + nums[i];
            }
        }

        Arrays.sort(nums);
        return nums[nums.length - 1];
    }


    public static void main(String[] args) {
        int[] arr = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(arr));
    }
}