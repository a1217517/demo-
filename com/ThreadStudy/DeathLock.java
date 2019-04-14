package com.example.demo.com.ThreadStudy;

/**
 * @program: demo
 * @description: 死锁
 * @author: wanzeyu
 * @create: 2019-03-24 13:36
 **/
public class DeathLock {

    private static final Object objA =new Object();
    private static final Object objB =new Object();


    public static void main(String[] args) {

        new Thread(() -> {
            synchronized (objA) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (objB) {
                    System.out.println("A==========B");
                }
            }

        }).start();
        new Thread(() -> {
            synchronized (objB) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (objA) {
                    System.out.println("B==========A");
                }
            }

        }).start();

    }


}
