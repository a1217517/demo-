package com.example.demo.stack;

import java.util.Stack;

/**
 * @program: demo
 * @description: 仅用一个递归函数和栈, 逆序一个栈
 * @author: wanzeyu
 * @create: 2018-11-28 17:34
 **/
public class ReverseStackUsingRecursive {


    public static void reverse(Stack<Integer> stack){
            if (stack.isEmpty()){
                return;
            }
            int i = getAndRemoveLastElement(stack);
            reverse(stack);
            stack.push(i);


    }

        public static int getAndRemoveLastElement(Stack<Integer> stack){
            int result =stack.pop();

            if (stack.isEmpty()){
                return result;
            }else {
                int last = getAndRemoveLastElement(stack);
                return last ;
            }
        }







}
