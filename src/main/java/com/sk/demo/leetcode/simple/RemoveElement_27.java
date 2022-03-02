package com.sk.demo.leetcode.simple;

/**
 * @Title: RemoveElement_27
 * @Package: com.sk.util.leetcode.simple
 * @Description:  
 * @Author: sk
 * @Date: 2022/3/1 - 17:20
 */
public class RemoveElement_27 {
    public int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }


    public static void main(String[] args) {
        RemoveElement_27 r = new RemoveElement_27();


        int[] ints1 = {0,1,2,2,3,0,4,2};
        int i = r.removeElement(ints1, 2);

        for (int i1 = 0; i1 < i; i1++) {
            System.out.println(ints1[i1]);
        }
    }
}
