package com.example.demo.lock;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @program: demo
 * @description:
 * @author: wanzeyu
 * @create: 2019-03-03 18:39
 **/
public class DeadLock {

    public static final Object obj1=new Object();
    public static final Object obj2=new Object();


    public static void main(String[] args) {

        new Thread(()->{
            synchronized (obj1){
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj2){
                    System.out.println("1------2");
                }

            }


        }).start();

        new Thread(()->{
            synchronized (obj2){
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj1){
                    System.out.println("2------1");
                }

            }


        }).start();





    }



}
