package com.example.demo.com.ThreadStudy;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: demo
 * @description:
 * @author: wanzeyu
 * @create: 2019-03-24 15:24
 **/
public class ReentryDemo {

    private MyLock myLock = new MyLock();
    public void methodA(){
        myLock.lock();
        System.out.println("methodA持有锁");
        methodB();
        myLock.unlock();

    }

    public void methodB(){
        myLock.lock();
        System.out.println("进入方法B");
        myLock.unlock();
    }

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();



    }

}
