package com.sk.demo.leetcode.simple;

/**
 * @Title: IntegerInversion
 * @Package: com.sk.util.leetcode.simple
 * @Description: 整数反转
 * @Author: sk
 * @Date: 2021/11/4 - 17:24
 */
public class IntegerInversion {

    public int reverse(int x) {
        // 将int类型转为字符串
        String xString = Integer.toString(x);
        // 当为正的时候直接赋值
        String string = xString;
        // 调节符号用
        int flag = 1;

        // 当传入的x为负值的时候,需要先将符号截取掉
        if (x < 0) {
            flag = -1;
            string = string.substring(1);
        }

        try {
            return Integer.parseInt(new StringBuilder(string).reverse().toString()) * flag;
        } catch (Exception e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(-10/20);
    }
}
