package com.example.demo.list;

/**
 * @program: demo
 * @description: 翻转链表
 * @author: wanzeyu
 * @create: 2018-11-29 19:20
 **/
public class ReverseList {


    public static class Node {
        public int value;
        public Node next;

        public Node(int data) {
            this.value = data;
        }
    }

    public static class DoubleNode {
        public int value;
        public DoubleNode last;
        public DoubleNode next;

        public DoubleNode(int data) {
            this.value = data;
        }
    }
    public static Node reverseList(Node head) {
        Node pre = null ;
        Node next =null;
        while (head!=null){
            next = head.next;
            head.next = pre ;
            pre = head;
            head = next;
        }
        return pre ;
    }



    public static void printLinkedList(Node head) {
        System.out.print("Linked List: ");
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void printDoubleLinkedList(DoubleNode head) {
            DoubleNode pre = null ;
            DoubleNode next =null;
            while (head!=null){

                next = head.next;
                head.next = pre ;
                pre = head;
                head = next;

            }
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        printLinkedList(head1);
        printLinkedList(reverseList(head1));

    }
}
