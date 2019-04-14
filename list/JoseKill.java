package com.example.demo.list;

import java.util.Stack;

/**
 * @program: demo
 * @description: 约瑟夫环
 * @author: wanzeyu
 * @create: 2019-02-15 16:21
 **/
public class JoseKill {

    public static class Node {
        public int value;
        public Node next;

        public Node(int data) {
            this.value = data;
        }
    }

    public static Node kill(Node head , int m ){
        Node last = head ;
        while(last.next!=last){
            last = last.next;
        }
        int count =0 ;
        while (head != last){
            if (++count == m){
                last.next = head.next;
                count = 0;
            }else {
                last = last.next;

            }
            head =last.next;
        }
        return head ;
    }


}
