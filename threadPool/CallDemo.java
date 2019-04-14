package com.example.demo.threadPool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @program: demo
 * @description:
 * @author: wanzeyu
 * @create: 2019-03-04 21:50
 **/
public class CallDemo implements Callable {
    public static AtomicInteger i=new AtomicInteger(0);

    @Override
    public String call() throws Exception {
        Thread.sleep(1000L);
        return Thread.currentThread()+ "call me"+i.getAndAdd(1);
    }


    public static void main(String[] args) {
        CallDemo callDemo = new CallDemo();
        FutureTask<String> futureTask = new FutureTask<>(callDemo);
        new Thread(futureTask).start();
        String s=null;
        try {
           s = futureTask.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(s);

    }
}
