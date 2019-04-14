package com.example.demo.stack;

import java.util.Stack;

/**
 * @program: demo
 * @description: 设计一个有getMin功能的栈
 * @author: wanzeyu
 * @create: 2018-11-28 16:21
 **/
public class GetMinStack {

    public  static class  MyStack1{
        private Stack<Integer> stackData;
        private Stack<Integer> stackMin;

        public MyStack1(){
            this.stackData=new Stack<Integer>();
            this.stackMin = new Stack<Integer>();
        }

        public void push(int newNum){

            this.stackData.push(newNum);
            if (this.getMin()>newNum){
                stackMin.push(newNum);
            }else if (this.stackMin.isEmpty()){
                stackMin.push(newNum);
            }


        }

        public Integer pop(){
            if (this.stackData.isEmpty()){
                throw new RuntimeException("已经是空的了");
            }
            Integer value = stackData.pop();
            if (value==this.getMin()){
                this.stackMin.pop();
            }
            return value;

        }

        public int getMin(){
            if (this.stackMin.isEmpty()){
                throw new RuntimeException("已经是空的了");
            }
            Integer peek = stackMin.peek();
            return peek;
        }


    }







}
