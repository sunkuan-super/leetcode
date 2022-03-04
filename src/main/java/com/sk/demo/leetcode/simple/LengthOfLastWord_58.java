package com.sk.demo.leetcode.simple;

/**
 * @Title: LengthOfLastWord_58
 * @Package: com.sk.demo.leetcode.simple
 * @Description:
 * @Author: sk
 * @Date: 2022/3/4 - 17:37
 */
public class LengthOfLastWord_58 {


    /**
     * 常规方法
     *
     * @param s
     * @return
     */
    public static int lengthOfLastWord(String s) {
        String[] strArr = s.trim().split("\\s+");
        return strArr[strArr.length - 1].trim().length();
    }

    public static int lengthOfLastWordPro(String s) {
        // 1、从后往前数，找到第一个非空格的字符，当循环结束的时候找到了字符串s最后的一个非空字符
        int index = s.length() - 1;
        while (s.charAt(index) == ' ') {
            index--;
        }

        // 2、最后一个非空字符找到后，继续逆向找
        int wordLength = 0;
        while (index >=0 && s.charAt(index) != ' ') {
            // 条件加入index > 0 是考虑到边界问题，当index指向0的时候，并且第0个为非空字符的时候，执行循环index--, 下次循环的时候s.charAt(index)直接就报错了
            index--;
            wordLength++;
        }

        return wordLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWordPro("3"));
    }


}
