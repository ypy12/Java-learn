/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-13 12:41:48
 * @LastEditTime: 2021-12-13 13:07:57
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

import java.util.ArrayList;
import java.util.Arrays;

public class leetcode27 {
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int slow = 0;
        for (int fast = 0; fast < n; fast++) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;

    }

    public static void main(String[] args) {
        int[] nums = new int[] { 3, 2, 2, 3 };
        System.out.println(removeElement(nums, 2));
    }
}
/*
 * @Description:
 * 
 * @Author: YPY
 * 
 * @Date: 2021-12-13 12:41:48
 * 
 * @LastEditTime: 2021-12-13 12:41:48
 * 
 * @LastEditors: YPY
 * 
 * @Reference:
 */
