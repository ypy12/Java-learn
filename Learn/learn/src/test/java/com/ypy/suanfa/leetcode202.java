/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-11-26 21:11:59
 * @LastEditTime: 2021-11-26 22:42:13
 * @LastEditors: YPY
 * @Reference: 
 */

package com.ypy.suanfa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class leetcode202 {
    public static boolean isHappy(int n) {
        Set<Integer> num = new HashSet<Integer>();

        while (!num.contains((Integer.valueOf(n)))) {
           
            num.add(n);
            if (n == 1 || n == 100 || n == 1000) {
                return true;
            }
            n=getNextNumber(n);


        }
        return false;

    }
    private static int getNextNumber(int n) {
        int res = 0;
        while (n > 0) {
            int temp = n % 10;
            res += temp * temp;
            n = n / 10;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(1111111));
    }
}