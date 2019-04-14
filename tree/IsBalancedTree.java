package com.example.demo.tree;

/**
 * @program: demo
 * @description: 判断二叉树是否平衡
 * @author: wanzeyu
 * @create: 2018-11-29 11:27
 **/
public class IsBalancedTree {

    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int data) {
            this.value = data;
        }
    }

    public static class ReturnData{
        boolean isBalance;
        int hight ;

        public ReturnData(boolean isBalance, int hight) {
            this.isBalance = isBalance;
            this.hight = hight;
        }
    }

    public static ReturnData process(Node head) {
        if (head==null){
            return new ReturnData(false,0);
        }
        ReturnData left = process(head.left);
        if (left.isBalance==false){
            return new ReturnData(false,0);
        }
        ReturnData right = process(head.right);
        if (right.isBalance==false){
            return new ReturnData(false,0);
        }
        if (Math.abs(left.hight-right.hight) >1){
            return new ReturnData(false,0);
        }
        return new ReturnData(true , Math.abs(left.hight-right.hight));
    }






}
