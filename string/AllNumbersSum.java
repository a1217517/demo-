package com.example.demo.string;

/**
 * @program: demo
 * @description: 字符串中数字子串的和
 * @author: wanzeyu
 * @create: 2018-11-30 14:18
 **/
public class AllNumbersSum {

    public static int numSum(String str) {
        char[] charArr = str.toCharArray();
        int res =0 ;
        int cur =0 ;
        int num = 0;
        boolean posi =  true;

        for (int i = 0; i <charArr.length ; i++) {
            cur = charArr[i]-'0' ;
                if (cur <'0' || cur>'9'){
                res+=num;
                num=0;
                if (charArr[i] =='-'){
                    if (i-1>-1 && charArr[i-1]=='-' ){
                        posi=!posi;
                    }else {
                        posi =false;
                    }
                }else {
                    posi =true;
                }
            }else {
                num += num *10 +(posi ? cur : -cur);

            }

        }

        res+=num;
        return res;
    }




    public static void main(String[] args) {
        char a = '0';
        System.out.println('2'-'0');

    }
}
