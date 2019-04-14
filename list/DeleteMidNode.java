package com.example.demo.list;

/**
 * @program: demo
 * @description: 删除中间节点
 * @author: wanzeyu
 * @create: 2019-02-15 10:46
 **/
public class DeleteMidNode {

    public static class  Node{
        public Node next;
        public int value;

        public Node(int value){
            this.value = value;
        }
    }


    public Node removeMidNode(Node head){
        if (head.next.next == null){
            return head.next;
        }

        Node pre = head ;
        Node cur = head.next.next ;

        while (cur.next!=null && cur.next.next!=null){
            pre = pre.next;
            cur = cur.next.next;
        }
        pre.next = pre.next.next;
        return head;

    }







}
