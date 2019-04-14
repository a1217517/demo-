package com.example.demo.com.ThreadStudy;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @program: demo
 * @description:
 * @author: wanzeyu
 * @create: 2019-03-24 15:08
 **/
public class MyLock implements Lock {
    private boolean holdLock = false;
    private int holdLockCount=0;
    private Thread localThread =null;

    @Override
    public synchronized void lock() {
        if (holdLock && localThread!=Thread.currentThread() ){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        localThread =Thread.currentThread();
        holdLockCount++;
        holdLock=true;

    }

    @Override
    public synchronized void unlock() {

        if (localThread==Thread.currentThread()){
            holdLockCount--;
            if (holdLockCount==0){
                notify();
                holdLock=false;
            }
        }


    }

    @Override
    public Condition newCondition() {
        return null;
    }


    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock() {
        return false;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }


}
