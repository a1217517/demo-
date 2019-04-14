package com.example.demo.stack;

import java.util.Stack;

/**
 * @program: demo
 * @description: 用栈给另一个栈排序
 * @author: wanzeyu
 * @create: 2018-11-28 19:48
 **/
public class StackSortStack {

    public static void sortByStack(Stack<Integer> stack) {

        Stack<Integer> help = new Stack<>();
        while (!stack.isEmpty()) {
            int cur = stack.pop();
            while (!help.isEmpty() && help.peek() < cur) {
                stack.push(help.pop());
            }
            help.push(cur);
        }

        while (!help.isEmpty()){
            stack.push(help.pop());
        }
    }
}
