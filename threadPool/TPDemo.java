package com.example.demo.threadPool;

import java.util.concurrent.*;

/**
 * @program: demo
 * @description:
 * @author: wanzeyu
 * @create: 2019-03-04 20:53
 **/
public class TPDemo  {

    public static void main(String[] args) {
        LinkedBlockingQueue<Runnable> queue = new LinkedBlockingQueue<>(20);
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor( 10 ,20 ,3L ,TimeUnit.SECONDS,queue);
            Future<String> future =null;
            for (int i = 0; i < 31; i++) {
                threadPoolExecutor.submit(()->{
                    System.out.println(Thread.currentThread());
                });

        }

      /*  for (int i = 0; i <100 ; i++) {
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }*/




    }


}
