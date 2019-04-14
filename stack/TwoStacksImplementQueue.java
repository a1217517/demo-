package com.example.demo.stack;

import java.util.Stack;

/**
 * @program: demo
 * @description: 两个栈实现队列
 * @author: wanzeyu
 * @create: 2018-11-28 17:06
 **/
public class TwoStacksImplementQueue {

    public static class TwoStackQueue{
        public Stack<Integer> stackPush;
        public Stack<Integer> stackPop ;

        public TwoStackQueue() {
            stackPush = new Stack<Integer>();
            stackPop = new Stack<Integer>();
        }

        public  void add(int pushInt){

            stackPush.push(pushInt);

        }

        public int poll(){

            if (stackPop.isEmpty()&&stackPush.isEmpty()){
                throw new RuntimeException("都为空");
            }else if (stackPop.isEmpty()){
                while (!stackPush.isEmpty()){
                    stackPop.push(stackPush.pop());
                }
            }
            return stackPop.pop();
        }
        public int peek(){
            if (stackPop.isEmpty()&&stackPush.isEmpty()){
                throw new RuntimeException("都为空");
            }else if (stackPop.isEmpty()){
                while (!stackPush.empty()) {
                    stackPop.push(stackPush.pop());
                }
            }
            return stackPop.peek();
        }


    }



}
