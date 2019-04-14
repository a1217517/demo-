package com.example.demo.string;

/**
 * @program: demo
 * @description: 字符是否只出现过一次
 * @author: wanzeyu
 * @create: 2018-12-03 20:22
 **/
public class IsAllUnique {
    public static boolean isUnique1(char[] chas) {
        if (chas == null) {
            return true;
        }
        boolean[] maps = new boolean[256];
        for (int i = 0; i < chas.length; i++) {
           if (maps[chas[i]]){
            return false;
           }
        }
        //打印一下原来的字符数组
        return true;
    }
}