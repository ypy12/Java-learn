/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-11-27 21:40:17
 * @LastEditTime: 2021-12-15 23:19:26
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

public class leetcode26 {
    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int fast = 1;
        int slow = 0;
        while (fast <= nums.length - 1) {
            if (nums[slow] == nums[fast]) {

                while (nums[slow] == nums[fast] && fast <= nums.length - 1) {
                    fast += 1;
                    if (fast > nums.length - 1) {
                        return slow + 1;
                    }
                }
                slow = slow + 1;
                nums[slow] = nums[fast];
            } else {
              fast++;
              slow++;
            }
        }
        return slow + 1;
    }

    public static void main(String[] args) {
        int len;
        int[] nums = new int[] { 1, 2 };
        len = removeDuplicates(nums);

        System.out.println(len);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i]);
        }

    }
}
