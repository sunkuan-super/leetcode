package com.sk.demo.leetcode.simple;

import java.util.Arrays;

/**
 * @Title: MergesTwoOrderedArrays
 * @Package: com.sk.util.leetcode.simple
 * @Description:
 * @Author: sk
 * @Date: 2021/11/14 - 15:19
 */
public class MergesTwoOrderedArrays {

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i != n; ++i) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {

        } else if (m == 0) {
            for (int i = 0; i < nums1.length; i++) {
                nums1[i] = nums2[i];
            }
        } else {
            int j = 0;
            for (int i = m; i < nums1.length; i++) {
                nums1[i] = nums2[j];
                j++;
            }
        }
        Arrays.sort(nums1);
        System.out.println("nums1 = " + nums1[0]);
    }

    public static void transform(int[] nums, int[] nums1){
        nums = nums1;

        System.out.println("transform: " + nums[0]);
    }

    public static void main(String[] args) {
        int[] nums1 = new int[1];
        nums1[0] = 0;

        for (int i : nums1) {
            System.out.println(i);
        }
        int[] nums2 = new int[1];
        nums2[0] = 1;

        new MergesTwoOrderedArrays().merge(nums1, 0, nums2, 1);

        System.out.println("执行merge后的nums1.length = " + nums1.length);
        System.out.println("执行merge后的nums1 = " + nums1[0]);

        transform(nums1, nums2);

        for (int i : nums1) {
            System.out.println(i);
        }
    }
}
