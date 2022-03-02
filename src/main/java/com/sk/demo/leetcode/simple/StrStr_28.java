package com.sk.demo.leetcode.simple;

public class StrStr_28 {
    public static int strStr(String haystack, String needle) {

        int i = 0;
        int j = 0;
        char[] haystackChars = haystack.toCharArray();
        char[] needleChars = needle.toCharArray();
        while (i < haystackChars.length && j < needleChars.length) {
            if (haystackChars[i] == needleChars[j]) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }

        if(j >= needleChars.length){
            return i - needleChars.length;
        }else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(strStr("ABACD", "AC"));
    }
}
