package com.example.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @program: demo
 * @description: 测试
 * @author: wanzeyu
 * @create: 2018-12-03 09:55
 **/
public class ForTest {

    public static void clear(char[] chas, int end, int len) {
        while (len-- != 0) {
            chas[end--] = 0;
        }
    }

    public static String replace(String str, String from, String to) {
        if (str == null || from == null || str.equals("") || from.equals("")) {
            return str;
        }
        char[] chas = str.toCharArray();
        char[] chaf = from.toCharArray();
        int count = 0;
        for (int i = 0; i < chas.length; i++) {
            if (chas[i] == chaf[count++]) {
                if (count == chaf.length) {
                    clear(chaf, count, chaf.length);
                    count = 0;
                }
            } else {
                count = 0;
            }
        }
        String res = "";
        String cur = "";

        for (int i = 0; i < chas.length; i++) {
            if (chas[i] != 0) {
                cur = cur + String.valueOf(chas[i]);
            }
            if (chas[i] == 0 && (i == 0 || chas[i - 1] != 0)) {
                res = res + cur + to;
                cur = "";
            }

        }
        if (cur != "") {
            res = res + cur;
        }
        return res;
    }

    public static void main(String[] args) {
        //ddddsdssfsdgsdgdgsdgsdgdgsd

        //dsgdsgsgsd----

        //dsgdsgsdg

        //   System.out.println(10* 29.02d);


       /* try {
            Class<?> forName = Class.forName("com.example.demo.ForClass");
            ForClass out =(ForClass)forName.newInstance();
            //  Class<?> forName = Class.forName("com.example.demo.ForClass.PClass");

            Class[] classes = forName.getDeclaredClasses();
            Constructor obj1 = classes[0].getDeclaredConstructor(forName);
            obj1.setAccessible(true);
            Object obj2 = obj1.newInstance(out);
            Field field1  =classes[0].getDeclaredField("f");
            field1.setAccessible(true);
            System.out.println(field1.get(obj1));
        *//*    Field field1  =classes[0].getDeclaredField("f");
            field1.setAccessible(true);
            System.out.println(field1.get(classes[0].newInstance()));*//*
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
*/
        try {
            ForClass forClass = new ForClass();
            Class<?> forName = Class.forName("com.example.demo.ForClass");
            Class[] classes = forName.getDeclaredClasses();
            ForClass.PClass  pClass= (ForClass.PClass) classes[0].getConstructor(forName).newInstance(forClass);
            pClass.test();





          //  System.out.println(forName.getDeclaredClasses()[0].newInstance());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}

