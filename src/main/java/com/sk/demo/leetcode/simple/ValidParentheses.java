package com.sk.demo.leetcode.simple;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @Title: ValidParentheses
 * @Package: com.sk.util.leetcode.simple
 * @Description: 有效的括号
 * @Author: sk
 * @Date: 2021/11/8 - 10:38
 */
public class ValidParentheses {
    /**
     * 不合法的括号
     *
     * @param s 带括号的字符串
     * @return 是否是合法的字符串
     */
    public static boolean isValid(String s) {

        /**
         * 字符串长度为奇数则为无效的括号
         */
        if (s.length() % 2 != 0) {
            return false;
        }

        char[] charArray = s.toCharArray();
        int num = 0;
        for (int i = 0; i < charArray.length / 2; i++) {
            if ((charArray[i] == '(' && charArray[charArray.length - 1 - i] == ')') || (charArray[i] == '[' && charArray[charArray.length - 1 - i] == ']') || (charArray[i] == '{' && charArray[charArray.length - 1 - i] == '}')) {
                num++;
            }
        }

        if (num == charArray.length / 2) {
            return true;
        }

        int shuang = 0;
        for (int i = 0; i < charArray.length; i += 2) {
            if ((charArray[i] == '(' && charArray[i + 1] == ')') || (charArray[i] == '[' && charArray[i + 1] == ']') || (charArray[i] == '{' && charArray[i + 1] == '}')) {
                shuang++;
            }
        }

        if (shuang == charArray.length / 2) {
            return true;
        }

        for (int i = 0; i < charArray.length; i++) {
            if ((charArray[i] == '(' && charArray[i + 1] == ')') || (charArray[i] == '[' && charArray[i + 1] == ']') || (charArray[i] == '{' && charArray[i + 1] == '}')) {
                shuang++;
            }
        }

        return false;
    }

    public static boolean isValid2(String s) {
        int length = s.length() / 2;
        for (int i = 0; i < length; i++) {
            s = s.replace("()", "").replace("{}", "").replace("[]", "");
        }

        return s.length() == 0;
    }

    private static final Map<Character, Character> map = new HashMap<Character, Character>() {
        {
            put('{', '}');
            put('[', ']');
            put('(', ')');
            put('?', '?');
        }
    };

    /**
     * 栈的实现方式
     *
     * @param s
     * @return
     */
    public static boolean isValidPlus(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }

        Map<Character, Character> pairs = new HashMap<Character, Character>() {
            {
                put(')', '(');
                put(']', '[');
                put('}', '{');
            }
        };

        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (pairs.containsKey(ch)) {
                if (stack.isEmpty() || !stack.peek().equals(pairs.get(ch))) {
                    return false;
                }

                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
//        System.out.println("() :" + isValid2("()"));
//        System.out.println("()[]{} ：" + isValid2("()[]{}"));
//        System.out.println("(] :" + isValid2("(]"));
//        System.out.println("([)]" + " ： " + isValid2("([)]"));
//        System.out.println("{[]} :" + isValid2("{[]}"));
//        System.out.println("(}{)" + isValid2("(}{)"));
//        System.out.println("(([]){}) : " + isValid2("(([]){})"));
        System.out.println(isValidPlus("(([]){})"));
    }
}
