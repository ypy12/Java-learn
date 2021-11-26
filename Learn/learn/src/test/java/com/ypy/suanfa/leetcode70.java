/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-11-26 10:26:40
 * @LastEditTime: 2021-11-26 10:50:37
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

public class leetcode70 {
    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int stage = 3;
        int stage_1 = 1;
        int stage_2 = 2;
        for (int i = 3; i < n; i++) {
          stage_1=stage_2;
          stage_2=stage;
          stage=stage_1+stage_2;
        }
        return stage;
    }
    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }

}
/*
 * @Description:
 * 
 * @Author: YPY
 * 
 * @Date: 2021-11-26 10:26:40
 * 
 * @LastEditTime: 2021-11-26 10:26:40
 * 
 * @LastEditors: YPY
 * 
 * @Reference:
 */
