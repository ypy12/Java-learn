/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-11-26 10:57:37
 * @LastEditTime: 2021-11-27 21:39:55
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

import java.util.List;

public class leetcode198and213 {
    //static就是198题目，打家劫舍
    public static int rob_static(int[] nums) {
        int[] money = new int[nums.length];
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[1], nums[0]);
        }
        money[0]=nums[0];
        money[1]=Math.max(nums[1], nums[0]);
        for (int j = 2; j < nums.length; j++) {
          money[j]=Math.max(money[j-1], money[j-2]+nums[j]);
        }
        return money[nums.length-1];
    }
    public static int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[1], nums[0]);
        }
        int[] num=new int[nums.length-1];
        for(int i=0;i<nums.length-1;i++){
            num[i]=nums[i];
        }
        int num_1=rob_static(num);
        for(int i=1;i<nums.length;i++){
            num[i-1]=nums[i];
        }
        int num_2=rob_static(num);
        return Math.max(num_1, num_2);
    }
    public static void main(String[] args) {
        System.out.println(rob(new int[]{1,2,3,1}));
    }
}
/*
 * @Description:
 * 
 * @Author: YPY
 * 
 * @Date: 2021-11-26 10:57:37
 * 
 * @LastEditTime: 2021-11-26 11:07:40
 * 
 * @LastEditors: YPY
 * 
 * @Reference:
 */
