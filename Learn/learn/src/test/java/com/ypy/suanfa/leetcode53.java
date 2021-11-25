/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-11-24 21:45:24
 * @LastEditTime: 2021-11-24 22:41:43
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

public class leetcode53 {
    public static int maxSubArray(int[] nums) {
        // 贪心算法

        if (nums.length <= 1) {
            return nums[0];
        }
        int sum = 0;
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (sum < 0) {
                sum = nums[i];
            } else if (sum >= 0) {
                sum = sum + nums[i];
            }
            max = Math.max(max,sum);

        }
        return max;
    }

    public static void main(String[] args) {
        int[] num = { -1, 1, -1 };
        int[] num1 = { 5,4,-1,7,8};
        int[] num3 = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSubArray(num1));
    }
}
/*
 * @Description:
 * 
 * @Author: YPY
 * 
 * @Date: 2021-11-24 21:45:24
 * 
 * @LastEditTime: 2021-11-24 21:45:24
 * 
 * @LastEditors: YPY
 * 
 * @Reference:
 */
