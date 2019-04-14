package com.example.demo.tree;

import java.util.Stack;

/**
 * @program: demo
 * @description: 打印二叉树
 * @author: wanzeyu
 * @create: 2018-11-29 10:09
 **/
public class PrintBinaryTree {

    public static class Node {

        public int value;
        public Node left;
        public Node right;

        public Node(int data) {
            this.value = data;
        }


    }

    public static void preOrderRecur(Node head) {

        if (head == null) {
            return;
        }
        System.out.println(head.value);
        preOrderRecur(head.left);
        preOrderRecur(head.right);

    }

    public static void preOrderUnRecur(Node head) {
        if (head == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        System.out.println(head);
        stack.push(head);
        while (!stack.isEmpty()){
            head = stack.pop();
            System.out.println(head.value);
            if (head.right!=null){
                stack.push(head.right);
            }
            if (head.left!=null){
                stack.push(head.left);
            }
        }
    }

}