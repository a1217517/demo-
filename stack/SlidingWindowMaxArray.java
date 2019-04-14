package com.example.demo.stack;

import java.util.LinkedList;

/**
 * @program: demo
 * @description: 生成窗口最大值数组
 * @author: wanzeyu
 * @create: 2018-11-28 20:43
 **/
public class SlidingWindowMaxArray {

    public static int[] getMaxWindow(int[] arr, int w) {

        LinkedList<Integer> qmax = new LinkedList<>();
        int[] res = new int[arr.length - 1];
        int index= 0;
        for (int i = 0; i <arr.length ; i++) {
            while (!qmax.isEmpty() && arr[qmax.peekLast()]<=arr[i]){
                qmax.pollLast();
            }
            qmax.addLast(i);
            if (qmax.peekFirst()==i-w){
                qmax.pollFirst();
            }
            if (i>= w-1){
                res[index++] = arr[qmax.peekFirst()];
            }
        }
        return res;
    }

    public static void main(String[] args) {


    }


}
