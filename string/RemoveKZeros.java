package com.example.demo.string;

/**
 * @program: demo
 * @description: 去掉字符串中连续出现k个的字符串
 * @author: wanzeyu
 * @create: 2018-11-30 20:42
 **/
public class RemoveKZeros {


    public static String removeKZeros(String str, int k) {
        if (str == null || k < 1) {
            return str;
        }
        char[] chas = str.toCharArray();
        int count = 0, start = -1;

        for (int i = 0; i < chas.length; i++) {
            if (chas[i] == '0') {
                count++;
                start = start == -1 ? i : start;
            } else {
                if (count == k) {
                    while (count-- != 0){
                        chas[start++] = 0;
                    }
                }
                count = 0;
                start = -1;
            }
            if (count ==k){
                while (count-- != 0)
                    chas[start++] = 0;


            }

        }

        return String.valueOf(chas);
    }

    public static void main(String[] args) {
        char c = 0;
        System.out.println(c);
    }
}
