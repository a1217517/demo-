package com.example.demo.string;

/**
 * @program: demo
 * @description: 数字字符转为整数
 * @author: wanzeyu
 * @create: 2018-12-03 17:00
 **/
public class ConvertStringToInteger {


    public static int convert(String str) {
        if (str == null || str.equals("")) {
            return 0; // can not convert
        }
        char[] chars = str.toCharArray();
        if (!isValid(chars)) {
            return 0; // can not convert
        }
        int cur =0;
        boolean posi = chars[0] == '-' ? false : true;
      /*  for (int i = 0; i < chars.length; i++) {
            cur = chars[i]-'0';
            if (chars[i]<0 || chars[i]>9){

            }else {

            }
        }*/


              return 0;
        }

    public static boolean isValid(char[] chas) {
        if (chas[0] != '-' && (chas[0] < '0' || chas[0] > '9')) {
            return false;
        }
        if (chas[0] == '-' && (chas.length == 1 || chas[1] == '0')) {
            return false;
        }
        if (chas[0] == '0' && chas.length > 1) {
            return false;
        }
        for (int i = 1; i < chas.length; i++) {
            if (chas[i] < '0' || chas[i] > '9') {
                return false;
            }
        }
        return true;
    }



}
