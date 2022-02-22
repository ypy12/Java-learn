/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-18 18:21:33
 * @LastEditTime: 2021-12-18 18:41:38
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> queue;

    /** Initialize your data structure here. */
    public MyStack() {
        queue = new LinkedList<Integer>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        int n = queue.size();
        queue.offer(x);
        for (int i = 0; i < n; i++) {
            queue.offer(queue.poll());
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.poll();
    }
    
    /** Get the top element. */
    public int top() {
        return queue.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}


public class leetcode225 {

}
