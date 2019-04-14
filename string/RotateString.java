package com.example.demo.string;

/**
 * @program: demo
 * @description: 翻转字符串
 * @author: wanzeyu
 * @create: 2018-12-06 19:46
 **/
public class RotateString {
    public static void reverse(char[] chas, int start, int end) {
        char tmp=0 ;
        while (start<end){
            tmp = chas[start];
            chas[start] = chas[end];
            chas[end] = tmp ;
            start++;
            end--;
        }
    }

    public static void rotateWord(char[] chas) {
        if (chas == null || chas.length == 0) {
            return;
        }
        reverse(chas, 0, chas.length - 1);
        int l =-1 ;
        int r =-1 ;
        for (int i = 0; i <chas.length ; i++) {
            if (chas[i]!=' '){
                l = i==0 || chas[i-1] ==' ' ? i :l  ;
                r=  i == chas.length  || chas[i+1]==' ' ? i :r ;

            }
            if (l!=-1 && r!=-1){
                reverse(chas ,l,r );
                l=-1;
                r =-1;
            }

            }



        }
        
        








}
