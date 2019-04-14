package com.example.demo.list;

/**
 * @program: demo
 * @description: 删除倒数第K个节点
 * @author: wanzeyu
 * @create: 2019-02-14 17:06
 **/
public class DeleteKNode {

    public static class  Node{
        public Node next;
        public int value;

        public Node(int value){
            this.value = value;
        }
    }

    public static Node  deleteKNode(int k , Node head){
        if (head == null || k<1){
            return head;
        }
        Node cur = head ;
        while (cur!=null){
            k--;
            cur = cur.next;
        }
        if (k==0){
            head=head.next;
        }
        if (k<0){
            cur = head;
            while (++k!=0){
             cur = cur.next ;
            }
            cur.next = cur.next.next;
        }

        return head ;
    }


}
