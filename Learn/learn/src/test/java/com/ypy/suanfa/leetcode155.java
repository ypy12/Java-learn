package com.ypy.suanfa;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

//自己写的方法，但是效率很低；
// class MinStack {

//     Stack<Integer> stack = new Stack<Integer>();

//     public MinStack() {
//         this.stack = stack;
//     }

//     public void push(int val) {
//         stack.push(val);
//     }

//     public void pop() {
//         stack.pop();
//     }

//     public int top() {
//         return stack.peek();
//     }

//     public int getMin() {
//         int min = stack.peek();
//         // List<Integer> list=new ArrayList<Integer>();
//         Stack<Integer> newstack = new Stack<Integer>();
//         while (!stack.isEmpty()) {
//             min = Math.min(min, stack.peek());
//             newstack.push(stack.pop());
//         }
//         while (!newstack.isEmpty()) {
//             stack.push(newstack.pop());
//         }
//         return min;
//     }
// }

//官方方法
class MinStack {
    Deque<Integer> xStack;
    Deque<Integer> minStack;

    public MinStack() {
        xStack = new LinkedList<Integer>();
        minStack = new LinkedList<Integer>();
        minStack.push(Integer.MAX_VALUE);
    }
    
    public void push(int x) {
        xStack.push(x);
        minStack.push(Math.min(minStack.peek(), x));
    }
    
    public void pop() {
        xStack.pop();
        minStack.pop();
    }
    
    public int top() {
        return xStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}


public class leetcode155 {
    public static void main(String[] args) {

        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.getMin();
        minStack.pop();
        minStack.top();
        minStack.getMin();

    }
}
/*
 * @Description:
 * 
 * @Author: YPY
 * 
 * @Date: 2021-12-17 22:25:15
 * 
 * @LastEditTime: 2021-12-17 22:25:16
 * 
 * @LastEditors: YPY
 * 
 * @Reference:
 */
