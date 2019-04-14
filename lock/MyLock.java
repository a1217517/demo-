package com.example.demo.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @program: demo
 * @description:
 * @author: wanzeyu
 * @create: 2019-03-11 21:08
 **/
public class MyLock implements Lock {

    private boolean isLocked = false ;

    private  Thread  curThread=null;

    @Override
    public  synchronized void lock() {

        if (isLocked && curThread!=Thread.currentThread()){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


        isLocked =true;

    }


    @Override
    public synchronized void unlock() {
        notify();
        isLocked=false;
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


    @Override
    public Condition newCondition() {
        return null;
    }
}
