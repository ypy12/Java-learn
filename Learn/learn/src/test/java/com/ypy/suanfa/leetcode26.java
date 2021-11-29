/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-11-27 21:40:17
 * @LastEditTime: 2021-11-27 22:44:08
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

public class leetcode26 {
    public static int removeDuplicates(int[] nums) {
        int k=0;

        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                break;
            }
            int j = i + 1;
            System.out.println(j);
            while (nums[i] == nums[j] && j < nums.length - 1) {
                j++;
            }

            for (int m = i + 1; m < j; m++) {
                nums[m] = nums[j];
            }
            System.out.println("数值" + nums[i]);
        }

        return nums.length - k;
    }

    public static void main(String[] args) {
        int len;
        int[] nums = new int[] { 0, 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        len = removeDuplicates(nums);

        System.out.println(len);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i]);
        }

    }
}
