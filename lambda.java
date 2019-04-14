package com.example.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @program: demo
 * @description: lambda表达式练习
 * @author: wanzeyu
 * @create: 2019-01-03 20:38
 **/
public class lambda {

    public static void printThings(String s , Consumer<String> consumer){
        consumer.accept(s);
    }

    public static List getList(int num , Supplier<Integer> sup){

        ArrayList<Object> list = new ArrayList<>();
        for (int i = 0; i <num ; i++) {
            list.add(sup.get());
        }
        return list;
    }

    public static  String getMonth(String s, Function<String,String> function){

        return function.apply(s);

    }

    public static List<Integer> fileter(List<Integer> list , Predicate<Integer> predicate){
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i <list.size() ; i++) {
            if (predicate.test(list.get(i))){
                arrayList.add(list.get(i));
            }

        }
        return arrayList;

    }

    public static void main(String[] args) {
        printThings("1000",(x)->{
            System.out.println("x"+x);
            System.out.println("x"+x);
            System.out.println("x"+x);
        });

        List list = getList((20), () ->  (int)(Math.random()*1000));
        //list.stream().forEach((x)-> System.out.println(x));
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
        String month = getMonth("20180103", (x) -> x.substring(0,6));
        System.out.println("month +"+month);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(55);
        arrayList.add(55);
        arrayList.add(6);
        arrayList.add(5);
        arrayList.forEach((x)-> System.out.println(x));
        System.out.println("==================");
       /* List<Integer> f2 = fileter(arrayList, (x) -> x.intValue() != 0);
        f2.stream().forEach((x)-> System.out.println(x));
*/
        ArrayList<Object> res = new ArrayList<>();

        arrayList.stream().filter((x)->{
            System.out.println("333");
            return x>5;
        }).limit(2).forEach(
                (x)->res.add(x));

        for (int i = 0; i <res.size() ; i++) {
            System.out.println(res.get(i));
        }

        System.out.println("dist===");
        Stream<Object> distinct = res.stream().distinct();
        Collections.max(arrayList);

        distinct.forEach((x)-> System.out.println(x));
        ArrayList<String> last= new ArrayList<>();
        last.add("s");
        last.add("b");
        last.add("c");
        last.stream().map((s)->s.toUpperCase()).forEach((x)-> System.out.println(x));



    }





}
