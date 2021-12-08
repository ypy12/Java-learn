/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-08 10:55:27
 * @LastEditTime: 2021-12-08 11:25:26
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

import java.util.HashMap;
import java.util.Map;

public class leetcode740 {
    public static int deleteAndEarn(int[] nums) {
        int max = 0;
        for (int n : nums) {
            max = Math.max(max, n);
        }
        int[] num = new int[max + 1];
        for (int n : nums) {
            num[n]++;
        }
        return rob(num);
    }

    public static int rob(int[] num) {
        if (num.length == 0 || num == null) {
            return 0;
        }
        if (num.length == 1) {
            return num[0];
        }
        int[] sum = new int[num.length];
        if (num.length >= 2) {
            sum[0] = num[0];
            sum[1] = Math.max(num[0], num[1]);
            for (int i = 2; i < num.length; i++) {
               sum[i]=Math.max(sum[i-2]+i*num[i], sum[i-1]);
            }
        }
        return sum[num.length-1];

    }
    public static void main(String[] args) {
        int[] nums={2,2,3,3,3,4};
        System.out.println(deleteAndEarn(nums));
    }
}
