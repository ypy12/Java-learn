/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-11-24 22:50:10
 * @LastEditTime: 2021-11-24 23:03:25
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

import java.util.ArrayList;


public class leetcode509 {
    public static int fib(int n) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(0);
        a.add(1);
        for (int i = 2; i <= n; i++) {
            a.add(a.get(i - 1) + a.get(i - 2));
        }
        return a.get(n);

    }
    public static void main(String[] args) {
        System.out.println(fib(6));
    }
}
