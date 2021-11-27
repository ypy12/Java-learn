/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-11-27 20:15:27
 * @LastEditTime: 2021-11-27 20:47:38
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

import java.util.ArrayList;
import java.util.List;

public class leetcode764 {
    public static int minCostClimbingStairs(int[] cost) {
        int length = cost.length + 1;
        int[] num1 = new int[cost.length + 1];
        int costnum;
        if (cost.length == 1) {
            return 0;
        }
        if (cost.length == 2) {
            return Math.min(cost[0], cost[1]);
        } else {

            num1[0] = cost[0];
            num1[1] = cost[1];
            for (int i = 2; i < length; i++) {
                if (i == length - 1) {
                    costnum = 0;
                } else {
                    costnum = cost[i];
                }
                num1[i] = Math.min(num1[i - 1], num1[i - 2]) + costnum;
            }
        }

        return num1[num1.length - 1];
    }

    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[] { 21,1}));
    }
}