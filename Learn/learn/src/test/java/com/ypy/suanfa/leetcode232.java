/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-02 20:46:50
 * @LastEditTime: 2021-12-02 21:53:26
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

import java.util.Iterator;
import java.util.Stack;

class MyQueue {
    Stack<Integer> stack_stackrank = new Stack<Integer>();
    Stack<Integer> stack_queuerank = new Stack<Integer>();
    // 标记指向哪个stack
    boolean FLAG_stackrank = true;

    public MyQueue() {
        this.stack_stackrank = stack_stackrank;
        this.stack_queuerank = stack_queuerank;
    }

    public void push(int x) {
        if (FLAG_stackrank == true) {
            stack_stackrank.push(x);
        } else {
            // 把队列顺序调整为栈的顺序
            while (!stack_queuerank.empty()) {
                int m = stack_queuerank.pop();
                stack_stackrank.push(m);
            }
            FLAG_stackrank = true;
            stack_stackrank.push(x);
        }
    }

    public int pop() {
        if (FLAG_stackrank == false) {
            return stack_queuerank.pop();
        } else {
            // 把栈顺序调整为队列的顺序
            while (!stack_stackrank.empty()) {
                int x = stack_stackrank.pop();
                stack_queuerank.push(x);
            }
            FLAG_stackrank = false;
            return stack_queuerank.pop();
        }

    }

    public int peek() {
        if (FLAG_stackrank == false) {
            return stack_queuerank.peek();
        } else {
            // 把栈顺序调整为队列的顺序
            while (!stack_stackrank.empty()) {
                int x = stack_stackrank.pop();
                stack_queuerank.push(x);
            }
            FLAG_stackrank = false;
            return stack_queuerank.peek();
        }
    }

    public boolean empty() {
        if (stack_stackrank.empty() && stack_queuerank.empty()) {
            return true;
        } else {
            return false;
        }
    }
}

public class leetcode232 {
    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        int param_2 = obj.pop();
        obj.push(5);
        int param_3 = obj.pop();
        int param_4 = obj.pop();
        int param_5 = obj.pop();
        int param_6 = obj.pop();
        System.out.println(param_2);
        System.out.println(param_3);
        System.out.println(param_4);
    }
}
/*
 * @Description:
 * 
 * @Author: YPY
 * 
 * @Date: 2021-12-02 20:46:50
 * 
 * @LastEditTime: 2021-12-02 20:46:51
 * 
 * @LastEditors: YPY
 * 
 * @Reference:
 */
