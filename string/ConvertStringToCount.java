package com.example.demo.string;

/**
 * @program: demo
 * @description: 统计字符串
 * @author: wanzeyu
 * @create: 2018-12-03 19:52
 **/
public class ConvertStringToCount {

    public static String concat(String str1 ,String str2 ,String str3){
        return str1+"_"+str2+"_"+(str3.equals("") ? str3 : "_"+str3 );
    }
    public static String getCountString(String str) {
        if (str == null || str.equals("")) {
            return "";
        }
        char[] chs = str.toCharArray();
        int num =1 ;
        String res="";
        for (int i = 1; i <chs.length ; i++) {
            if (chs[i]!=chs[i-1]){
                res = concat(res,String.valueOf(num),String.valueOf(chs[i]));
                num=1;
            }else {
                num++;
            }
        }
        return concat(res, String.valueOf(num), "");
    }


}
