package com.example.demo.com.ThreadStudy;




public class HungerSingleton {
    private static HungerSingleton ourInstance = new HungerSingleton();

    public static HungerSingleton getInstance() {
        return ourInstance;
    }

    private HungerSingleton() {
    }


    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
        new Thread(()->{
            System.out.println(HungerSingleton.getInstance());
        }).start();
        }

    }
}
