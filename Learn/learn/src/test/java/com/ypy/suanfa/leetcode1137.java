/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-11-24 23:05:42
 * @LastEditTime: 2021-11-24 23:16:55
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

import java.util.ArrayList;

public class leetcode1137 {
    public static int tribonacci(int n) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        a.add(0);
        a.add(1);
        a.add(1);
        for (int i = 3; i <= n; i++) {
            a.add(a.get(i - 1) + a.get(i - 2)+a.get(i-3));
        }
        return a.get(n-1)+a.get(n-2)+a.get(n-3);
        
    }
    public static void main(String[] args) {
        System.out.println(tribonacci(25));
    }
}
/*
 * @Description:
 * 
 * @Author: YPY
 * 
 * @Date: 2021-11-24 23:05:42
 * 
 * @LastEditTime: 2021-11-24 23:05:43
 * 
 * @LastEditors: YPY
 * 
 * @Reference:
 */
