package com.sk.demo.leetcode.simple;

/**
 * @Title: PalindromicNumber
 * @Package: com.sk.util.leetcode.simple
 * @Description: 简单~ 回文数
 * @Author: sk
 * @Date: 2021/11/5 - 10:09
 */
public class PalindromicNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String xString = String.valueOf(x);

        try {
            String reverseString = new StringBuilder(xString).reverse().toString();
            if(reverseString.equals(xString)){
                Integer.parseInt(reverseString);
                return true;
            }
        } catch (Exception e) {
            return false;
        }

        return false;
    }
}
