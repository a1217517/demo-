package com.example.demo.list;

/**
 * @program: demo
 * @description: 打印链表公共部分
 * @author: wanzeyu
 * @create: 2018-11-29 18:21
 **/
public class PrintCommonPart {

    public static class Node {
        public int value;
        public Node next;
        public Node(int data) {
            this.value = data;
        }
    }


   /* public static void printCommonPart(Node head1, Node head2) {

        while (head1!=null && head2!=null){
            if (head1.value>head2.value){
                head1 = head1.next;
            }else if (head1.value<head2.value){
                head2 = head2.next;
            }else {
                System.out.println(head1.value);
                head1=head1.next;
                head2=head2.next;

            }
        }


    }*/

    public static void printCommonPart(Node head1, Node head2) {

        while (head1!=null && head2!=null){

            if (head1.value==head2.value){
                System.out.println(head1.value);
                head1 = head1.next ;
                head2 = head2.next ;
            }else if (head1.value>head2.value){
                head2 = head2.next;
            }else if (head1.value<head2.value){
                head1 = head1.next ;
            }
        }
    }


}
