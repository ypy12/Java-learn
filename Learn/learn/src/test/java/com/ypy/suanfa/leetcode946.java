/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-18 18:53:40
 * @LastEditTime: 2021-12-18 22:48:42
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

import java.util.Stack;

public class leetcode946 {
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack();

        int j = 0;
        for (int x : pushed) {
            stack.push(x);
            while (!stack.isEmpty() && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        int[] pushed = new int[] { 1, 2, 3, 0 };
        int[] poped = new int[] { 2, 1, 3, 0 };
        System.out.println(validateStackSequences(pushed, poped));
    }
}