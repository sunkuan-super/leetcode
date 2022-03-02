package com.sk.demo.leetcode.simple;

/**
 * @Title: SearchInsert_35
 * @Package: com.sk.util.leetcode.simple
 * @Description: 在一个有序的数组中，查找目标值，找到则返回下标，没找到则返回该插入的位置
 * @Author: sk
 * @Date: 2022/3/2 - 11:15
 */
public class SearchInsert_35 {

    /**
     * 暴力破解法
     *
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert(int[] nums, int target) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                // 找到的情况
                return i;
            } else if (nums[i] >= target && i == 0) {
                // 比第一个元素还小的
                return 0;
            } else if (nums[i] <= target && i == nums.length - 1) {
                // 比最后一个元素还大的
                return nums.length;
            } else {
                // 中间的情况并且当前值与目标值不相等
                if (nums[i] < target) {
                    j++;
                }
            }
        }
        return j;
    }

    /**
     * 暴力破解法二
     *
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert2(int[] nums, int target) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                // 找到的情况
                return i;
            } else {
                // 找不到的情况
                if (nums[i] < target) {
                    j++;
                }
            }
        }
        return j;
    }

    /**
     * 暴力破解法三
     *
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert3(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                // 找到的情况
                return i;
            }
        }
        return nums.length;
    }

    /**
     * 二分查找法,假设数组中没有重复的元素
     *
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsertPro(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (target > nums[mid]) {
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                return mid;
            }
        }

        return left;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 6};
        System.out.println(searchInsertPro(arr, 2));
    }
}
