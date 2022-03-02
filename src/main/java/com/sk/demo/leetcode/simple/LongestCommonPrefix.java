package com.sk.demo.leetcode.simple;

/**
 * @Title: LongestCommonPrefix
 * @Package: com.sk.util.leetcode.simple
 * @Description: 找字符串数组的最长前缀
 * @Author: sk
 * @Date: 2021/11/5 - 10:34
 */
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {

        /**
         * 如果数组长度为1,则返回本身
         */
        if(strs.length == 1){
            return strs[0];
        }

        // 最短的字符串
        String minString = strs[0];
        // 最短字符串的长度
        int minSize = strs[0].length();

        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < minSize) {
                minString = strs[i];
                minSize = strs[i].length();
            }
        }

        for (int i = minString.length(); i >= 0; i--) {
            String substring = minString.substring(0, i);
            int num = 0;
            for (int j = 0; j < strs.length; j++) {
                if(strs[j].startsWith(substring)){
                    num++;
                }
            }

            if(num == strs.length){
                return substring;
            }
        }


        return "";
    }

    public static void main(String[] args) {
        String[] strings = {"ab"};
        System.out.println(longestCommonPrefix(strings));
    }
}
