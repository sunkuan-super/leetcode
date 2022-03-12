package com.sk.demo.leetcode.simple;

public class Code66_PlusOne {

    public int[] plusOne(int[] digits) {
        // 表示进位
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                // 如果当前位小于9,加上进位的数，同时进位的数变为0
                digits[i] += carry;
                carry = 0;

                return digits;
            } else {
                // 如果当前位为9时，需判断有没有进位，有进位，则当前位为0，carry继续为1
                if (carry == 1) {
                    digits[i] = 0;
                    carry = 1;
                }
            }
        }

        if (carry == 1) {
            int[] ints = new int[digits.length + 1];
            ints[0] = 1;
            for (int i = 1; i < ints.length; i++) {
                ints[i] = digits[i - 1];
            }

            return ints;
        }
        return digits;
    }



}
