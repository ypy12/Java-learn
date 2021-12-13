/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-13 22:16:36
 * @LastEditTime: 2021-12-13 22:45:24
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

public class leetcode55 {
    public static boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int max = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (i <= max) {
                max = Math.max(max, nums[i] + i);
                if (max >= nums.length - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 0 };
        System.out.println(canJump(nums));
    }
}