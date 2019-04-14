package com.example.demo.string;

/**
 * @program: demo
 * @description: 字符串是否互为变形词
 * @author: wanzeyu
 * @create: 2018-11-30 10:20
 **/
public class IsDeformation {


    public static boolean isDeformation(String str1 ,String str2){

        if (str1.length()!=str2.length()){
            return false;
        }
        char[] char1 =str1.toCharArray();
        char[] char2 =str2.toCharArray();
        int[] map = new int[256];
        for (int i = 0; i <char1.length ; i++) {
             map[char1[i]]++ ;
        }

        for (int i = 0; i <char2.length ; i++) {
            if (map[char2[i]]--==0){
                return false;
            }
        }

        return true;
            }



    public static void main(String[] args) {
        String A = "abcabcabc";
        String B = "bcacbaacb";
        System.out.println(isDeformation(A, B));
    }

}
