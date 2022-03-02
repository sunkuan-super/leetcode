package com.sk.demo.leetcode.simple;

/**
 * @Title: StringTransform
 * @Package: com.sk.util.leetcode.simple
 * @Description: 字符串转换
 * @Author: sk
 * @Date: 2021/11/27 - 15:21
 */
public class StringTransform {
    public String transform(String string, int length) {
        StringBuffer finalResult = new StringBuffer();
        StringBuffer origin = new StringBuffer(string);
        origin.reverse();
        String string1 = origin.toString();
        while(string1.length() > 0){
            // 找到第一个非空格字符
            while(string1.substring(0, 1).equals(" ")){
                finalResult.append(" ");
                string1 = string1.substring(1);
            }
            if(string1.length() ==0){break;}
            int i1 = string1.indexOf(" ");
            String res;
            if(i1 >0){
                String substring = string1.substring(0, i1);
                // 大小写反转
                res = reverseAndTrans(substring);
                string1 = string1.substring(i1);

            }else{
                res = reverseAndTrans(string1);
                string1 = "";
            }
            finalResult.append(res);

        }
        return finalResult.toString();


//        String[] words = string.split("\\s+");
//        StringBuffer stringBuffer = new StringBuffer();
//
//        for (int i = words.length - 1; i >= 0; i--) {
//            char[] charArray = words[i].toCharArray();
//            String after = "";
//            for (char cc : charArray) {
//                if (cc > 64 && cc < 91) {
//                    //方法1.分步转换
//                    int cc1 = (int) cc;
//                    cc1 = cc1 + 'a' - 'A';
//                    cc = (char) cc1;
//                    //方法2.一句代码转换
//                    //cc = (char) ((int) cc + 32);
//
//                } else if (cc > 96 && cc < 123) {
//                    cc = (char) ((int) cc - 32);
//                }
//
//                after += cc;
//            }
//
//            stringBuffer.append(after).append(" ");
//        }
//
//        return stringBuffer.toString();
    }

    private String reverseAndTrans(String substring) {
        String after = "";
        char[] charArray = substring.toCharArray();
        for (int i =  charArray.length-1;i >=0;i--) {
            char cc = charArray[i];
            if (cc > 64 && cc < 91) {
                //方法1.分步转换
                int cc1 = (int) cc;
                cc1 = cc1 + 'a' - 'A';
                cc = (char) cc1;
                //方法2.一句代码转换
                //cc = (char) ((int) cc + 32);

            } else if (cc > 96 && cc < 123) {
                cc = (char) ((int) cc - 32);
            }
            after += cc;
        }
        return after;
    }

    public static void main(String[] args) {
        StringTransform stringTransform = new StringTransform();
        String this_is_a_sample = stringTransform.transform("This     is    a   sample", 16);
        System.out.println(this_is_a_sample);
        String c = this_is_a_sample.replace(" ", "c");
        System.out.println(c);
    }
}
