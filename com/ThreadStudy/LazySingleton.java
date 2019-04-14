package com.example.demo.com.ThreadStudy;

/**
 * @program: demo
 * @description:
 * @author: wanzeyu
 * @create: 2019-03-24 14:50
 **/
public class LazySingleton {

    private static volatile LazySingleton lazySingleton = null;


    public static  LazySingleton getInstance() {
        if (null==lazySingleton){
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (LazySingleton.class) {
                if (null==lazySingleton)
                lazySingleton = new LazySingleton();
            }
        }
            return lazySingleton;
    }

    private LazySingleton() {
    }


    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            new Thread(()->{
                System.out.println(LazySingleton.getInstance());
            }).start();
        }

    }

}
